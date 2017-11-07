package p09.interfaces;

public interface Inter1 {
	int a = 3; // public static final int a = 3; 상수
	
	void display();//public void display(); 추상메소드
	public void print(); // 추상메소드
}

class D1 implements Inter1 {
	@Override
	public void display() {
		System.out.println("구현체 D1");
	}
	@Override
	public void print() {
		System.out.println("구현체 D1의 print");
	}
}

class D2 extends D1 {
	@Override
	public void display() { //인터페이스를 구현한 D1을 상속 후 메소드 오버라이드 가능
		System.out.println("D1을 상속받은 D2");
	}
	@Override
	public void print() {
		System.out.println("D1을 상속받은 D2의 print");
	}
}