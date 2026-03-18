package vo;

import java.util.Objects;

public class MemberVO {
//	1. private
//	2. 기본 생성자
//	3. 초기화 생성자
//	4. 개터새터
//	5. to string 재정의
//	6. hash, equals 재정의
	private long id;
	private String memberEmail;
	private String memberPassword;
	private String memberAddress;
	private String memberRecommenderEmail;
	
	public MemberVO() {;}
	public MemberVO(long id, String memberEmail, String memberPassword, String memberAddress,
			String memberRecommenderEmail) {
		this.id = id;
		this.memberEmail = memberEmail;
		this.memberPassword = memberPassword;
		this.memberAddress = memberAddress;
		this.memberRecommenderEmail = memberRecommenderEmail;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberRecommenderEmail() {
		return memberRecommenderEmail;
	}
	public void setMemberRecommenderEmail(String memberRecommenderEmail) {
		this.memberRecommenderEmail = memberRecommenderEmail;
	}
	
	@Override
	public String toString() {
		return "TempMemberVO [id=" + id + ", memberEmail=" + memberEmail + ", memberPassword=" + memberPassword
				+ ", memberAddress=" + memberAddress + ", memberRecommenderEmail=" + memberRecommenderEmail + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return id == other.id;
	}
}
