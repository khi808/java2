package p01.switches;

import java.util.Scanner;

/**
 *  조건문 - switch문
 *  switch(조건) - 조건에 따라 미리 실행할 작업을 분기해놓은 제어문 (다중분기문)
 * */
public class SwitchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("점수를 입력하시오 .");
			int score = Integer.parseInt(sc.next());
			String grade = "";
			
			switch (score/10) {
				case 10 : 
					grade = "A+";
					break;
				case 9 :
					grade = "A";
					break;
				case 8 :
					grade = "B";
					break;
				case 7 : 
					grade = "C";
					break;
				case 6 : 
					grade = "D";
					break;
				default : 
					grade = "F";
					break;
			}
			
			System.out.println("등급 : " + grade);
			System.out.println("계속하실? y/n");
			char ex = sc.next().charAt(0);
			if (!(ex == 'y' || ex == 'Y')) { // sc.next().equalsIgnoreCase("y")) 스트링 타입 비교메소드 return boolean타입
				System.out.println("종료");
				break;
			}
		}
	}
}
