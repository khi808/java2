package p01.switches;

import java.util.Scanner;

public class SwitchExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("계산기 값1 op 값2 형태");
			System.out.println("첫번째 값 입력 : ");
			int num1 = sc.nextInt();
			System.out.println("연산자 입력 : ");
			char op = sc.next().charAt(0);
			System.out.println("두번째 값 입력 : ");
			int num2 = sc.nextInt();
			
			switch (op) {
			case '+' :
				System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
				break;
			case '-' :
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
				break;
			case '*' :
				System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
				break;
			case '/' :
				System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
				break;
			case '%' :
				System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
				break;
				default : 
					break;
			}
			System.out.println("계속할? y");
			char ex = sc.next().charAt(0);
			if (!(ex == 'y' || ex == 'Y')) {
				System.out.println("종료");
				break;
			}
		}
		
		
	}
}
