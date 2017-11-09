package p01.tryCatchFinally;

public class AccountExample {
	public static void main(String[] args) /* throws Exception */{
		// 객체 생성
		Account account1 = new Account();
		Account[] accArr = new Account[4];
		
		account1.setOwner("이순신");
		account1.setAno("11-001");
		account1.setBalance(500000);
		
		Account account2 = new Account("홍길동");
		account2.setAno("11-004");
		account2.setBalance(500000);
		
		Account account3 = new Account("일지매","11-002");
		account3.setBalance(500000);
		
		Account account4 = new Account("임꺽정","11-003",100000);
		
		accArr[0] = account1;
		accArr[1] = account2;
		accArr[2] = account3;
		accArr[3] = account4;
		// 계좌 정보 출력
		for(int i=0; i<accArr.length; i++) {
			System.out.println("소유주: "+accArr[i].getOwner()+"|계좌번호: "+accArr[i].getAno() + "|소유금액: "+accArr[i].getBalance());
		}
		
		// 입금 처리
		accArr[0].deposit(5000);
		System.out.println(accArr[0].getOwner()+"의 현재잔고: "+accArr[0].getBalance());
		
		// 출금 처리
		// 호출하는 메소드가 throws Exception{} 으로 선언되어있으면
		// 호출하는 곳에서 예외처리를 해줘야함.
		// try-catch(){} - 호출한 쪽에서 예외를 처리하는 명령
		// throws Exception{} - 이 프로그램을 호출한 곳으로 예외를 위임하는 명령
		// 예외를 처리하는 두가지
		try {
			accArr[0].withdraw(800000);
		} catch(Exception e) {
			System.out.println(e.getMessage()); // getMessage()가
			// 호출된 메소드의 Exception()의 생성자 매개변수의 메세지를
			// 받아서 출력
		}
	}
}
