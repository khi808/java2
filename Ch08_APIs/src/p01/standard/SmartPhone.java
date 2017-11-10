package p01.standard;

public class SmartPhone {
	//필드
	private String company;
	private String os;
	//생성자
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	//getter and setter 메소드
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	@Override
	public String toString() {
		return "제조사:"+company + "|os:"+ os;
	}
}
