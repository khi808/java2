package p01.classes;

public class Account {
	//속성(field)
	private String owner;
	private int balance;
	//기능 (method)
	
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	public int withdraw(int amount) {
		if(balance < amount) {
			System.out.println("잔고가 부족합니다. 현재잔고 : "+balance);
			return 0;
		} else {
			this.balance -= amount;
			return amount;
		}
	}
}
