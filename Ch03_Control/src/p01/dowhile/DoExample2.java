package p01.dowhile;

import java.util.Scanner;

public class DoExample2 {
	public static void main(String[] args) {
		int num = 0, i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("프로그램을 종료하려면 'a'를 입력하시오");
		do {
			System.out.println("숫자를 입력하세요");
			num = (int)sc.next().charAt(0) - '0';
			if (num>=2 && num<=9) {
				while(i<=9) {
					System.out.println(num + " x " + i + " = " + i*num);
					i++;
				}
			}
			i=1;
		} while(num!=49); // 입력받은 값이 'a'이면 종료
		System.out.println("프로그램 종료");
	}
}
