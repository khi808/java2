package p01.fors;

import java.util.Scanner;

public class ForExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 구구단 수를 입력하시오 : ");
		System.out.println("가로 출력 : 1 , 세로 출력 : 2");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		if (num >= 1 && num <= 9) {
			if (num2 == 1) {
				for(int i = 1; i <= 9; i++) {
					System.out.print(num + " x " + i + " = " + num*i + " | ");
				}
			} else if (num2 == 2) {
				for(int i = 1; i <= 9; i++) {
					System.out.println(num + " x " + i + " = " + num*i);
				}
			}
		}
		
		
	}
}
