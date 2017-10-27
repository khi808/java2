package operators;
/*
 *   비교 연산자
 * - 연산의 결과가 true , false 로 나옴
 * */
public class OperExample4 {
	// 수치 연산
	public static void main(String[] args) {
		System.out.println(4 < 3);
		System.out.println(10.5 < 3);
		System.out.println(12.5F <= 11);
		System.out.println(7 >= 7);
		
		// 비교 연산자 ( == )
		int num1 = 5;
		int num2 = 2+3;
		if(num1 == num2) {
			System.out.println("num1과 num2의 값이 동일합니다.");
		} else {
			System.out.println("num1과 num2의 값이 다릅니다.");
		}
		
		double num3 = 1.1 + 2.2;
		double num4 = 3.3;
		
		
		
		
	}
}
