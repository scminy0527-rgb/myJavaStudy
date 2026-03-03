package streamTask;

import java.util.Objects;

public class User {
	private Long id;
	private String name;
	private int age;
	private String job;
	private String gender;
	
	public User() {;}
	public User(Long id, String name, int age, String job, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", job=" + job + ", gender=" + gender + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, gender, id, job, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(gender, other.gender) && Objects.equals(id, other.id)
				&& Objects.equals(job, other.job) && Objects.equals(name, other.name);
	}
}
