package p01.synchronize;
/**
 * 멀티쓰레드의 작업을 동기화 하는 방법
 * - 메소드 동기화
 * - synchronized 메소드명() {}
 * */

public class Account2 {
	// 필드
	long balance;
	
	// 공유객체 (balance)의 데이터를 처리하는 메소드
	// 공유객체를 처리하는 메소드를 동기화 처리하면
	// 공유객체 처리 작업이 동기화되어
	// 먼저 점유한 쓰레드가 있으면 다른쓰레드는 자업
	// 완료될때까지 기다리게됨.
	public synchronized void deposit(long amount) {
		balance += amount;
	}
	
	public synchronized void iquiry() {
		System.out.println("현재 잔액:"+balance);
	}
}
