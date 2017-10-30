package p01.ifs;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
			System.out.println("점수를 입력하세요 : ");
			int score = sc.nextInt();
			String grade = "";
			
			if(score <= 100 && score >= 0) {
				if(score >= 90) {
					grade = "A";
				} else if (score >= 80) {
					grade = "B";
				} else if (score >= 70) {
					grade = "C";
				} else if (score >= 60) {
					grade = "D";
				} else {
					grade = "F";
				}
				System.out.println("당신의 등급은 " + grade + " 입니다.");
				System.out.println("종료하겠습니까 y or n");
				char ex = sc.next().charAt(0);
				if (ex == 'y' || ex == 'Y') {
					break;
				}
					
			}
			else {
				System.out.println("잘못입력하였ㅇ");
			}
		}
			
		} catch (java.util.InputMismatchException e) {
			System.out.println(e.getMessage());
		}
			
		
		
		
	}
}
