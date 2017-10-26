package p03_DataType;
/*
 *  데이터 타입
 *  - 자바 프로그램에서
 *    연산은 반드시 동일한 타입끼리 연산을 함.
 *  - 변수 선언시 초기값으로 입력한 값을 literal 이라고 함.
 *    literal도 데이터 타입을 가짐.
 *  - 연산증가값도 타입을 가짐, 연산중간결과도 타입 변환됨.
 *    타입변화될때는 작은타입의 데이터타입이 큰 데이터 타입으로 자동변환됨.
 *    byte -> short -> int -> long
 *    float -> double
 *    10진수 12.375숫자 -> 2진수로 바꾸기
 *    -> 1100.011(2진수)
 *    
 * */
public class DataType3Example {
	public static void main(String[] args) {
		double result;
		// '='는 대입연산자 1이라는 정수타입의 리터럴을 정수타입의 변수a에 대입하라는 의미
		int a = 1; // 연산자 (=)를 기준으로 왼쪽과 오른쪽 타입이 같아야함.
		int b = 2; //  
		double c = 0.5; //0.5 더블타입의 값을 더블 타입의 변수에 대입하라는의미
		result = (a+b) * c; // int타입 a와 int타입 b가 연산을 함. 결과는 int
							// ()안의 연산을 한 결과는 int 값과 * 연산을 하는 c는 double형임.
							// *연산을 기준으로 왼쪽은 int 오른쪽은 double
							// 이때 int가 double형으로 타입이 자동 변경 ( 묵시적 형변환 )
							// double * double형식으로 바뀌어서 결과값이 double이 됨.
		System.out.println("result = " + result);
	}
}
