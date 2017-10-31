package p01.whiles;
/**
 *  While문 (조건식) {실행문} 
 *  - for문은 시작과 종료시점을 알고 있을때 사용 
 *  - while문은 시작과 종료시점을 알지 못할 때 주로 사용. ( 사용자한테 입력받을시 )
 *  - while문은 증감식을 실행문 내부에 기술, 초기식은 while문 밖에 기술.
 * */
public class WhileExample {
	public static void main(String[] args) {
		int sum = 0, i = 1;
		while(i<=10) {
			sum += i;
			System.out.println(i + "일 때 합계는: " + sum);
			i++;// 증감식은 실행부 내에서 기술.
		}
		System.out.println("최종합계 : " + sum);
	}
}
