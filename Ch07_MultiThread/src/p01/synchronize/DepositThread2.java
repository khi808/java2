package p01.synchronize;

public class DepositThread2 implements Runnable {
	// 필드
	Account2 myAccount;
	
	// 생성자
	public DepositThread2(Account2 myAccount) {
		this.myAccount = myAccount;
	}
	
	@Override
	public void run() {
		// 통장에 1원씩 입금
		// 1000번 반복 후 1000원 예상
		for(int i=0; i<1000; i++) {
			myAccount.deposit(1);
		}
		myAccount.iquiry(); // 현재 잔액 출력
	}
	
}
