package p08.compare;

public class Person implements Comparable<Person>{
	//필드 - 객체의 고유 속성, 현재의 상태를 저장하는 역할
	public String name;
	public int age;
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//메소드
	@Override
	public int compareTo(Person p) {
		if(this.age<p.age) return -1;//음수
		else if(this.age==p.age) return 0;//0
		else return 1;//양수
	}
	
}
