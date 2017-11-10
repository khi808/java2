package p01.standard;

public class Student extends Object{
	//필드
	String name;
	int sno;

	//생성자
	public Student(String name, int sno) {
		this.name = name;
		this.sno = sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) { // 동일 타입 비교 obj를 Student로 변환할 수 있는지?
			if(name.equals(((Student)obj).name) && (sno==((Student)obj).sno)) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return name.hashCode();
		//return sno;
		//return name.hashCode()+sno;
	}
	
}
