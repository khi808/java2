package p04.reflection;

public class Car {
	//필드
	private String medel;
	public String owner;
	//생성자
	public Car() {}
	public Car(String medel) {
		this.medel = medel;
	}
	//메솓
	public String getMedel() {
		return medel;
	}
	public void setMedel(String medel) {
		this.medel = medel;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
