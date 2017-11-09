package p01.tryCatchFinally;

/**
 * 소유주: String 타입의 필드 - owner 계좌번호: String 타입의 필드 -ano 잔액: long 타입의 필드 - balance
 */
public class Account {
	// 필드

	// 소유주
	private String owner;
	// 계좌번호
	private String ano;
	// 잔액
	private long balance;

	// 생성자 오버로딩
	public Account() {}
	public Account(String owner) {
		this.owner = owner;
	}
	public Account(String owner, String ano) {
		this.owner = owner;
		this.ano = ano;
	}
	public Account(String owner, String ano, long balance) {
		this.owner = owner;
		this.ano = ano;
		this.balance = balance;
	}

	// getter and setter 메소드
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	// 사용자 정의 메소드
	public void deposit(int amount) {
		balance += amount;
	}
	// 예외 강제 발생
	// throw new Exception(); // Exception() 생성자에 메세지 입력
	// new Exception(); // 생성
	// throw 예외 위임 메소드
	public int withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("잔액이 모자랍니다.");
		} else {
			balance -= amount;
		}
		return amount;
	}

}
