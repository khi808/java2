package p01.fors;
/**
 * 반복문 (for, while, do-while)
 * - 주로 시작과 끝을 알 수 있을 때 사용
 * */
public class ForExample {
	public static void main(String[] args) {
		// 1 ~ 10까지의 합 구하기 팩토리얼
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 합은 ? " + sum);
		
		int j = 1; // 초기식
		for (;j<=10;) {// 조건식 
			sum += j;
			j++; // 증가식
		}
		System.out.println(sum);
		
		
		
	}	
}
