package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.MemberVO;



public class MemberDAO {
//	1. 연결
	Connection connection;
//	2. 쿼리 날려야 함
	PreparedStatement preparedStatement;
//	3. resultSet 이용
	ResultSet resultSet;
	
//	로그인 성공
	public static Long session;
	
//	finally 에 반복되는 코드가 존재 하면 이렇게 매서드로 추출 가능
	public void closeResources() {
		try {
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
//	회원가입
	public void join(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "INSERT INTO TBL_MEMBER(ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_ADDRESS)"
				+ "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?)";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
	        preparedStatement.setString(2, memberVO.getMemberPassword());
	        preparedStatement.setString(3, memberVO.getMemberAddress());
	        
//	        쿼리를 실행
	        preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("member join query 오류");
			e.printStackTrace();
		}
		
//		사용 후 반드시 닫아주자
		finally {
			try {
				if (preparedStatement != null) preparedStatement.close();
				if (connection != null) connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
//	로그인
	public boolean login(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "SELECT ID FROM TBL_MEMBER "
				+ "WHERE MEMBER_EMAIL = ? AND MEMBER_PASSWORD = ?";
		
		boolean check = false;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			
//			결과를 담기
			resultSet = preparedStatement.executeQuery();
//			인터페이스를 통해서 값을 가져와야 함
			resultSet.next();
			check = true;
			session = resultSet.getLong(1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.closeResources();
		}
		
		return check;
	}
	
	
//	회원정보수정
	public void update(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "UPDATE TBL_MEMBER "
				+ "SET MEMBER_EMAIL = ?, MEMBER_PASSWORD = ?, MEMBER_ADDRESS = ?"
				+ "WHERE ID = ?";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberAddress());
			preparedStatement.setLong(4, session);
			
			preparedStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
//	마이페이지
	public MemberVO findById() {
//		단 패스워드는 "절대 화면단으로 들고오면 안됨"
		String query = "SELECT ID, MEMBER_EMAIL, MEMBER_ADDRESS, MEMBER_PASSWORD, MEMBER_RECOMMENDER_EMAIL "
				+ "FROM TBL_MEMBER "
				+ "WHERE ID = ?";
		
		connection = DBConnecter.getConnect();
		MemberVO memberVO = new MemberVO();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
			
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
//			인덱스로 쓰면 값이 잘못 들어갈 수 있음, 순서가 햇갈려서
//			따라서 이를 막기 위해 키로 접근하는 방법도 존재
			memberVO.setId(resultSet.getLong("ID"));
			memberVO.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
			memberVO.setMemberAddress(resultSet.getString("MEMBER_ADDRESS"));
			memberVO.setMemberPassword(resultSet.getString("MEMBER_PASSWORD"));
			memberVO.setMemberRecommenderEmail(resultSet.getString("MEMBER_RECOMMENDER_EMAIL"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("세션 정보 오류");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("알 수 없는 오류 발생");
		} finally {
			System.out.println("통로 닫기");
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return memberVO;
	}
	
//	새로운 비밀번호 변경 (단순 버전)
	public void changePassword(String password) {
//		변경 결과를 건네주는거도 중요함
//		1. ID 를 통해서 접근
//		2. 바꿀 비밀번호 입력
		
//		tip: 비밀번호가 올바른 형태의 비밀번호 인지는 이미 화면단에서 검증이 완료가 된 상황이어야 함
		
		String query = "UPDATE TBL_MEMBER "
				+ "SET MEMBER_PASSWORD = ?"
				+ "WHERE ID = ?"
				+ "AND MEMBER_PASSWORD != ?";
		connection = DBConnecter.getConnect();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, password);
			preparedStatement.setLong(2, session);
			preparedStatement.setString(3, password);
			
			int result = preparedStatement.executeUpdate();
			if (result > 0) {
			    System.out.println("비밀번호 변경 성공");
			} else {
			    System.out.println("실패: 새 비밀번호가 기존과 동일합니다");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
//	회원 탈퇴
//	로그인이 되어있는 상태에서 진행 되어야 함
	public boolean deleteMember() {
		String query = "DELETE FROM TBL_MEMBER "
				+ "WHERE ID = ?";
		connection = DBConnecter.getConnect();
		boolean delResult = false;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
			int result = preparedStatement.executeUpdate();
			if (result > 0) {
				session = null;
				delResult = true;
			    System.out.println("그동안 감사했습니다.");
			} else {
			    System.out.println("실패: 세션 오류");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return delResult;
	}
	
//	로그아웃
	public void logout() {
		session = null;
		System.out.println("로그아웃 완료");
	}
	
//	나를 추천 한 사람 전체 조회
//	회원 가입 할 때 추천인을 나 를 입력한 사람
	public ArrayList<MemberVO> getRecommenders() {
		String query = "SELECT ID, MEMBER_EMAIL, MEMBER_ADDRESS, MEMBER_RECOMMENDER_EMAIL "
				+ "FROM TBL_MEMBER "
				+ "WHERE MEMBER_RECOMMENDER_EMAIL = ( "
					+ "SELECT MEMBER_EMAIL "
					+ "FROM TBL_MEMBER "
					+ "WHERE ID = ? "
				+ ")";
		ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
		
		if(session == null) {
			System.out.println("세션 정보 없음");
			return memberList;
		}
		
		connection = DBConnecter.getConnect();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
			
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				MemberVO member = new MemberVO(
						resultSet.getLong("ID"), 
						resultSet.getString("MEMBER_EMAIL"), 
						resultSet.getString("MEMBER_ADDRESS"), 
						resultSet.getString("MEMBER_RECOMMENDER_EMAIL"));
				
				memberList.add(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return memberList;
	}
	
//  내가 추천한 추천인 조회
	public ArrayList<MemberVO> findInputRecommender() {
		String query = "SELECT ID, MEMBER_EMAIL, MEMBER_ADDRESS, MEMBER_RECOMMENDER_EMAIL "
				+ "FROM TBL_MEMBER "
				+ "WHERE MEMBER_EMAIL = ( "
					+ "SELECT MEMBER_RECOMMENDER_EMAIL "
					+ "FROM TBL_MEMBER "
					+ "WHERE ID = ? "
				+ ")";
		
		connection = DBConnecter.getConnect();
		ArrayList<MemberVO> members = new ArrayList<MemberVO>();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
			
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				MemberVO memberVO = new MemberVO();
				memberVO.setId(resultSet.getLong("ID"));
				memberVO.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
				memberVO.setMemberAddress(resultSet.getString("MEMBER_ADDRESS"));
				memberVO.setMemberRecommenderEmail(resultSet.getString("MEMBER_RECOMMENDER_EMAIL"));
				
				members.add(memberVO);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return members;
	}
}













