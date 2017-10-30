package p01.ifs;

import java.util.Scanner;

/**
 *  중첩 if - nest if
 * */
public class IfExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("점수를 입력하시오 : ");
			int score = Integer.parseInt(sc.next());
			String grade = "";
			// A, A+, A0, A-
			if(score >=90) {
				if (score > 96) { 
					grade = "A+"; //
				} else if (score < 94) {
					grade = "A-"; // 90 <= score <= 95
				} else {
					grade = "A0";
				}
			} else if (score >= 80) {
				if (score>86) {
					grade = "B+";
				} else if (score < 84) {
					grade = "B-";
				} else {
					grade = "B0";
				}
			} else if (score >= 70) {
				grade = "C";
			} else if (score >=60) {
				grade = "D";
			} else {
				grade = "F";
			}
			
			System.out.println("결과 : " + grade);
			System.out.println("계속하실? y/n");
			char ex = sc.next().charAt(0);
			if (!(ex == 'y' || ex == 'Y')) {
				System.out.println("종료");
				break;
			}
			
		}
	}
}
