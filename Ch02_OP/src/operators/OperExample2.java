package operators;

import java.util.Scanner;

/*
 * 사칙 연산
 * */
public class OperExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산할 값을 입력하세요 : ");
		int x = sc.nextInt();
		int op = sc.next().charAt(0);
		int y = sc.nextInt();
		
		switch (op) {
			case '*' :
				System.out.println("결과 : " + x + " x " + y + " = " + (x*y));
				break;
			case '/' : 
				System.out.println("결과 : " + x + " / " + y + " = " + (x/y));
				break;
			case '+' : 
				System.out.println("결과 : " + x + " + " + y + " = " + (x+y));
				break;
			case '-' : 
				System.out.println("결과 : " + x + " - " + y + " = " + (x-y));
				break;
			case '%' : 
				System.out.println("결과 : " + x + " % " + y + " = " + (x%y));
				break;
		}
		
		
	}
}
