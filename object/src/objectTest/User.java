package objectTest;

import java.util.Objects;

public class User {
//	클래스 만들 때 id 는 무조건 long 타입으로 넣기
	private Long id;
	private String name;
	
//	기본
	public User() {;}
	public User(Long id, String name) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
//	equals 를 재정의
//	Long id 필드를 비교하기
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
