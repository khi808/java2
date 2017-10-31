package p01.fors;

import java.util.Scanner;

/**
 * 중첩 for문을 이용한 구구단 출력
 * */
public class ForExample5 {
	public static void main(String[] args) {
		// 값을 입력받아서 2단부터 입력받은 단수까지
		// 구구단 출력 세로로 출력
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("출력할 구구단의 단수를 입력하시오. ");
			int num = sc.nextInt();
			
			for(int i =1; i<=9; i++) {
				for(int j=2; j<=num; j++) {
					//System.out.print(j + " x " + i + " = " + i*j + "\t");
					System.out.printf("%d"+ " x " + "%d" + " = " + "%2d  ", j,i,i*j);
				}
				System.out.println();
			}
			System.out.println("계속 하시겠습니까?");
			char c = sc.next().charAt(0);
			if(!(c == 'y'|| c == 'Y')) {
				break;
			}
		}
		System.out.println("종료");
	}
}
