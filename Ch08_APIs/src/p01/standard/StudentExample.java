package p01.standard;

public class StudentExample {
	public static void main(String[] args) {
		Student std1 = new Student("홍길동",1);
		Student std2 = new Student("홍길동",1);
		
		System.out.println("std1의 저장 번지값:"+std1.hashCode());
		System.out.println("std2의 저장 번지값:"+std2.hashCode());
		//
		if(std1.equals(std2)) {
			System.out.println("동일인물입니다.");
		} else {
			System.out.println("다른인물입니다.");
		}
		
	}
}
