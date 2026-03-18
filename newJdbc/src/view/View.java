package view;

import java.util.ArrayList;
import java.util.Arrays;

import dao.MemberDAO;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
		MemberDAO memberDao = new MemberDAO();
		MemberVO memberVo = new MemberVO();
		
//		각 객체를 만들어서 리스트에 넣어서 각 원소 별로 해서 넣는거도 가능 (스트림도 이동 가능??)
		
		
//		memberVo.setMemberEmail("hong1234@gmail.com");
//		memberVo.setMemberPassword("1234");
//		memberVo.setMemberAddress("서울시 강남구");
//		
//		memberDao.join(memberVo);
		
//      3명 데이터 추가하기
//      lee1234@gmail.com, "1234", "경기도 성남시"
//      jang4567@gmail.com, "1234", "경기도 수원시"
//      kim7897@gmail.com, "1234", "서울시 종로구"
		
//		memberVo.setMemberEmail("lee1234@gmail.com");
//		memberVo.setMemberPassword("1234");
//		memberVo.setMemberAddress("경기도 성남시");
//		
//		memberDao.join(memberVo);
//		memberVo.setMemberEmail("jang4567@gmail.com");
//		memberVo.setMemberPassword("1234");
//		memberVo.setMemberAddress("경기도 수원시");
//		
//		memberDao.join(memberVo);
		
		memberVo.setMemberEmail("kim7897@gmail.com");
		memberVo.setMemberPassword("1234");
		memberVo.setMemberAddress("서울시 종로구");
		
//		memberDao.join(memberVo);
		
		
		
		if(memberDao.login(memberVo)) {
			System.out.println("로그인 성공");
			
		} else {
			System.out.println("로그인 실패");
		}
		
		
		
		
		System.out.println("회원가입 완료");
	}
}
