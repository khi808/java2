import java.io.Serializable;

public class Member implements Serializable {
	//필드
	private String name;
	private String tel;
	private int age;
	//생성자
	public Member(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
