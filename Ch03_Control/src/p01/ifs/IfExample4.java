package p01.ifs;

import java.util.Scanner;

public class IfExample4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("점수를 입력하시오 : ");
			int score = Integer.parseInt(sc.next());
			String grade = "";
			
			// if문
			if (score >= 90) {
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
			
			// 상세 점수
			if (score >= 100) {
				grade = "A+";
			} else if (score >= 60) {
				if (score%10 > 7) grade += "+"; // 10으로 나눳을시 남는 나머지 x > 7 8~9
				else if (score%10<4) grade += "-"; // 10으로 나눳을시 남는 나머지 x < 4 0~3
				else grade += "0";
			}
			System.out.println("등급 : " + grade);
			System.out.println("계속하실? y/n");
			char ex = sc.next().charAt(0);
			if (!(ex == 'y' || ex == 'Y')) {
				System.out.println("종료");
				break;
			}
			
		}	
			
	}
}
