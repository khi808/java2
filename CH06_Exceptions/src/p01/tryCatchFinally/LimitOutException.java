package p01.tryCatchFinally;

public class LimitOutException extends Exception{
	@Override
	public String getMessage() {
		return "가격이 변통제한 폭을 벗어났습니다.";
	}
}
