package p01.synchronize;

public class GeneralTest {
	public static void main(String[] args) {
		// 객체 생성
		Account myAccount = new Account();
		
		for(int i=0; i<10; i++) {
			// Thread 객체 생성
			Thread t = new Thread(new DepositThread3(myAccount));
			// Thread 객체의 run()메소드 실행
			t.start();
		}
		
		
	}
}
