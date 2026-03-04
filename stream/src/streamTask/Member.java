package streamTask;

import java.util.Objects;

public class Member {
	private String id;
	private String name;
	private String hobby;
	private String intro;
	
	public Member() {;}
	public Member(String id, String name, String hobby, String intro) {
		this.id = id;
		this.name = name;
		this.hobby = hobby;
		this.intro = intro;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", hobby=" + hobby + ", intro=" + intro + "]";
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
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}
	
}
