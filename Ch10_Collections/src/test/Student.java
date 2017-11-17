package test;

public class Student extends Object{
	//필드
	public int StudentNum;
	public String name;
	//생성자
	public Student(int studentNum, String name) {
		StudentNum = studentNum;
		this.name = name;
	}
	
	// hashCode() 재정의
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	// equals()재정의
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
}
