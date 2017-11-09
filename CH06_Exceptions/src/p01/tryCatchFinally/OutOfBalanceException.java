package p01.tryCatchFinally;

public class OutOfBalanceException extends Exception{
	String message;
	int qty;
	
	public OutOfBalanceException(String message, int qty) {
		this.message = message;
		this.qty = qty;
	}
	
	public String getMessage() {
		this.message += qty;
		return this.message;
	}
}
