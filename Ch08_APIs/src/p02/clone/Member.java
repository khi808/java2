package p02.clone;

import java.util.Arrays;
/**
 * 객체의 복제는 Cloneable인터페이스로 구현된
 * 객체만 복제 가능함
 * */
public class Member /*extends Object*/ implements Cloneable{
	// 필드
	public String name; // String타입
	public int age; // int타입
	public int[] scores; // 배열타입
	public Car car; // 객체타입
	// 생성자 - 필드의 초기화
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	//메소드
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 얕은 복사 -clone() : 원본의 내용이 그대로 복사
		// 기본 데이터 타입은 실제 값이 복사
		// 참조 데이터 타입은 객체의 주소값이 복사(원본과 똑같은 참조(객체)를 공유)
		// 복사본의 객체를 수정하면 원본의 객체로 수정되서 복제가 무의미해짐.
		// 그래서 객체가 멤버인 경우 객체의 껍데기를 새로 만들어서 내용을 복사해줌
		// 깊은 복제 작업을 해주어야함.
		Member cloned = (Member)super.clone(); // clone()메소드의 리턴값은 Object이므로 Member타입으로 Casting하여 대입.
		// scores를 복제
		// copyOf(소스,복사할 길이) : 값을 복제하여 넘김
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car 복제
		// 새로운 객체를 생성하여 생성자의 매개변수로 값을 넘김.
		cloned.car = new Car(this.car.model);
		// 깊은 복제된 Member 객체를 리턴
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)clone();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return cloned;
	}
	
}
