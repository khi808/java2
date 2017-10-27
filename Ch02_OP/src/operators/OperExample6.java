package operators;
/*
 *  삼항연산자는 조건문 처럼 사용할 수 있다.
 *  조건식 ? 참 : 거짓
 *  			조건식 ? 참 : 거짓
 *  						조건식 ? 참 : 거짓
 *  									조건식 ? 참 : 거짓
 *  삼항연산자의 거짓부분에 조건식으로 다시 시작하면 된다.
 * */
import java.util.Scanner;

public class OperExample6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isContinue=true;
		
		while(isContinue) {
			System.out.println("점수를 입력하세요 : ");
			
			int score = scanner.nextInt();
			char grade = ' ';
			grade = score > 90 ? 'A' : (score > 80 ? 'B' : (score > 70 ? 'C' : (score > 60 ? 'D' : 'E')));
			System.out.println("등급 : " + grade);
			
			System.out.println("종료하시겠습니까 ? y or n");
			char yesNo = scanner.next().charAt(0);
			if (yesNo == 'y' || yesNo == 'Y') {
				isContinue = false;
			} 
			if (yesNo == 'n' || yesNo == 'N') {
				isContinue = true;
				System.out.println("종료");
			}
		}
		
		
		
	}
}
