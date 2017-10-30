package p01.switches;

import java.util.Scanner;

/**
 * 
 * */

public class SwitchExample2 {
	public static void main(String[] args) {
		int calNum = -1;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("월을 입력하시오.");
			calNum = sc.nextInt();
			
			switch (calNum) {
			case 12 :
			case 1 :
			case 2 : 
				season = "겨울"; break;
			case 3 :
			case 4 :
			case 5 :
				season = "봄"; break;
			case 6 :
			case 7 :
			case 8 :
				season = "여름"; break;
			case 9 :
			case 10 :
			case 11 :
				season = "가을"; break;
			default :
				System.out.println("잘못입력");
			}
			
			System.out.println(calNum + "월은 " + season + "입니다.");
			char ex = sc.next().charAt(0);
			if (!(ex == 'y' || ex == 'Y')) { 
				System.out.println("종료");
				break;
			}
		}
	}
}
