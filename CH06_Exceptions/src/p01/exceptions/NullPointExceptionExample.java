package p01.exceptions;
/**
 * RuntimeException
 * */
public class NullPointExceptionExample {
	public static void main(String[] args) {
		// 객체 생성
		String data = null; // 참조변수만 선언, null 값을 참조
		System.out.println(data.toString());
	}
}
