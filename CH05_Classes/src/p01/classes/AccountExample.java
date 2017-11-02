package p01.classes;

public class AccountExample {
	public static void main(String[] args) {
		// 객체(instanct) 생성
		Account cnt = new Account();
		cnt.setOwner("홍길동"); // setOwner("값") -> owner필드에 저장
		cnt.setBalance(10000); // setBalance(값) -> balance필드에 저장
		
		System.out.println(cnt.getOwner() + " " + cnt.getBalance());
		
		// 추가입금
		cnt.deposit(5000); //클래스에 설계된 deposit(){} 메소드를
						   //통해서  balance필드에 저장
		
		System.out.println(cnt.getOwner() + " " + cnt.getBalance());
		
		//출금
		cnt.withdraw(12000);
		System.out.println("잔고 : "+cnt.getBalance());
		cnt.withdraw(7000);
		System.out.println("잔고 : "+cnt.getBalance());
		
	}
}
