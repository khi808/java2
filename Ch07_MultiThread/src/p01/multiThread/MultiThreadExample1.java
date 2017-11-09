package p01.multiThread;
/**
 * 멀티 쓰레드
 * */
public class MultiThreadExample1 {
	public static void main(String args[]) {
		// 객체 생성
		G1 g1 = new G1();
		// thread실행 메소드 start();=O -> run(){}이 실행 run();=X
		g1.start();
		//  객체 생성
		G2 g2 = new G2();
		// g2.start(); 인터페이스를 상속받은 객체이긴 하나 오버라이드 하지않아서 사용불가
		
		// Thread객체 생성
		// Runnable로 구현된 Thread객체(G2타입의 g2)는
		// Thread생성자의 매개변수로 넘어가서
		// Thread객체가 됨. (오버라이드 한 run()이 실행됨)
		Thread th1 = new Thread(g2, "g2");
		// start()로 JVM에게 run() 메소드의 실행을 요청
		th1.start();
		
	}// main 끝
}

// Thread클래스를 상속받은 Thread객체
class G1 extends Thread{
	public void run() {
		for(int i=0;i<200;i++) {
			System.out.print("+");
		}
		System.out.println();
	}
}
// Runnable인터페이스를 구현한 Thread객체
class G2 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<200; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}


