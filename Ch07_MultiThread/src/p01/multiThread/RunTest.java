package p01.multiThread;

public class RunTest {
	public static void main(String[] args) {
		// Runnable을 구현한 구현체 생성
		// Thread()생성자의 매개변수로
		// Thread(()Thread클래스,"이름")을 넘기면
		// 생성된 Thread는 사용자 정의 이름을 부여받음
		Thread th1 = new Thread(new B2(),"Thread1");
		Thread th2 = new Thread(new B2(), "Thread2");
		
		th1.start();
		th2.start();
		
		
	}
	
}
/**
 * 자바는 클래스의 다중상속을 허락하지 않음
 * 인터페이스의 구현의 개수 제한은 없음(상속제한X)
 * class B2 extends B1, Thread{} = error 다중상속 안됨 interface로 구현해야함
 * -> clss B2 extends B1 implements Runnable{} < 요래 해야됨
 * 
 * 
 * */
class B1 {}
class B2 extends B1 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			// 현재 실행중인 쓰레드의 정보를 얻어오는 메소드
			// currentThread().getName() - 실행 중인 쓰레드의 이름 리턴
			System.out.print(Thread.currentThread().getName()+"가 실행 중\t");
			if(i%10 == 0) {
				System.out.println();
			}
		}
		
	}
}