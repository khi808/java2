package p01.multiThread;
/**
 * 멀티 쓰레드 객체를 만드는 방법
 * 1. Thread클래스를 상속받아서 생성
 * 2. Runnable인터페이스를 구현한 구현체를
 *    Thread클래스의 생성자의 매개변수로 넘겨서
 *    생성
 * - 멀티 쓰레드 실행
 *  - 생성된 Thread는 run()메소드가 재정의된 구현체
 *  - 실행은 start() 메소드로 실행
 *  - start() 메소드는 Thread의 run()메소드의 실행을 요청
 * */
public class MultiThreadExample {
	public static void main(String[] args) {
		for(int i =0; i<2000; i++) {
			System.out.print("+");
		}
		System.out.println();
		
		// MultiSub1 구현객체 생성
		MultiSub1 th1 = new MultiSub1();
		th1.start();
		// MultiSub2 구현객체 생성
		Thread th2 = new Thread(new MultiSub2());
		th2.start();
	}

}
// Thread를 상속받아서 생성
class MultiSub1 extends Thread { // 클래스 상속
	public void run() {
		for(int i=0;i<2000;i++) {
			System.out.print("+");
		}
		System.out.println();
	}
}
// Runnable 구현해서 생성
class MultiSub2 implements Runnable{ // 인터페이스 구현
	@Override
	public void run() {
		for(int i=0; i<2000; i++) {
			System.out.print("+");
		}
		System.out.println();
	}
}
