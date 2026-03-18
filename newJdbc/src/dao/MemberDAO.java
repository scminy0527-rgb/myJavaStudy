package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}
