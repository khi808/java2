package operators;
/*
 *  조건 연산자 (3항연산자)
 *  조건식 ? 참 : 거짓
 * */
public class OperExample5 {
	public static void main(String[] args) {
		int a = 20, b = 30, max;
		// 조건 연산식 (3항연산자)
		max = a < b ? a : b;
		System.out.println(max);
		
		// 조건문
		if (a < b) {
			max = a;
		} else {
			max = b;
		}
		
		int score = 90;
		char grade = ' ';
		
		/* if (score > 90) {
			grade = 'A';
		} else {
			grade = 'B';
					
		} */
		grade = score > 90 ? 'A' : 'B';
		System.out.println("grade = " + grade);
		
		
		
		
	}
}
