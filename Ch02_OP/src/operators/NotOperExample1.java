package operators;
/*
 *  논리연산 부정 ! ( Not )
 *  - true -> false , false -> true 결과 반전
 *  조건문 if()는 ()안의 값이 true 이면 실행함
 * */
public class NotOperExample1 {
	public static void main(String[] args) {
		boolean stop = false;
		if(!stop) { // stop의 값을 반전함 false -> true
			System.out.println("정지");
		} else {
			System.out.println("진행");
		}
		
		if(stop != true) { // stop은 true와 같지 않다. 즉, 다르다. stop은 false이므로 true 랑 다름.
			System.out.println("정지");
		} else {
			System.out.println("진행");
			
		}
	}
}
