package operators;
/*
 * 비트 연산
 * - 자바의 특성상
 *   두 피연산자가 모두 int타입보다 작은 크기의 타입이면 int타입으로 자동 형변환을 한 후 연산이 처리됨.
 * */
public class BitOperExample2 {
	public static void main(String[] args) {
		byte num1 = 1, num2 = 2;
		short num3 = 3;
		char ch = 'A';
		
		//byte result =  num1 & num2; // byte & byte 결과는 int
		//short result2 = num2 | num3; // byte | byte 결과는 int
		int result3 = num3 ^ ch; // short ^ char 결과는 int
		//byte result4 = ~num1; // ~byte 결과는 int 
		
		
	}
}
