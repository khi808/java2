package p01.dowhile;
/**
 * do ~ while(조건식);
 * - while문과 비슷.
 * - 먼저 1회 실행 후 조건검사를 함.
 * 
 * */
public class DoExample {
	public static void main(String[] args) {
		int sum=0, i=1;
		do {
			sum += i; // 합계 더하기 실행문
			i++; // 증감식
			System.out.println("i : " + i);
		} while(i<=10); // 1가 10과 같거나 작을 경우 반복
		System.out.println(i);
		System.out.println("sum : " + sum);
	}
}
