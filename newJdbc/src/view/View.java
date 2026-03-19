package view;

import java.util.ArrayList;
import java.util.Arrays;

import dao.MemberDAO;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
		MemberDAO memberDao = new MemberDAO();
//		각 객체를 만들어서 리스트에 넣어서 각 원소 별로 해서 넣는거도 가능 (스트림도 이동 가능??)
		
		MemberVO hong = new MemberVO("hong1234@gmail.com", "1234", "서울시 강남구");
	    MemberVO lee = new MemberVO("lee1234@gmail.com", "1234", "경기도 성남시");
	    MemberVO jang = new MemberVO("jang4567@gmail.com", "1234", "경기도 수원시");
	    MemberVO kim = new MemberVO("kim7897@gmail.com", "1234", "서울시 종로구");
	    
//	    memberDao.join(kim);
	    
//	    ArrayList<MemberVO> users = new ArrayList<MemberVO>(Arrays.asList(hong, lee, jang, kim));
//	    users.forEach(memberDao::join);
//	    System.out.println("회원가입 완료!");
	
	    if(memberDao.login(hong)) {
	       System.out.println("로그인 성공");
	       System.out.println(memberDao.findById());
	       
//	       마이페이지 에서 비밀번호를 수정하는 개념
	       
//	       먼저 사용자가 비밀번호 변경 인증을 위한 기존 비밀번호 입력해서 서버로 전송
//	       String originalPw = "1234";
//	       String newPassword = "0000";
//	       if(originalPw.equals(memberDao.findById().getMemberPassword())) {
////	       	   비밀번호 변경
//	    	   memberDao.changePassword(newPassword);
//	       } else {
//	    	   System.out.println("2단계 인증 실패: 비밀번호 오류");
//	       }
//	       System.out.println(memberDao.findById());
	       
//	       대망의 kim 탈퇴 시간
//	       memberDao.deleteMember();
	       
//	       memberDao.logout();
	       
//	       System.out.println(memberDao.findById());
	       System.out.println("과연 누가 나를 추천인으로 입력 했을까???");
	       System.out.println(memberDao.getRecommenders());
	       
	       System.out.println("난 과연 누구를 추천인으로 입력 했을까?");
	       System.out.println(memberDao.findInputRecommender());
	       
	    }else {
	       System.out.println("로그인 실패");
	    }
	}
	
//	회원 탈퇴
	
	
//	로그아웃
}
