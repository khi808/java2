package p01.whiles;

import java.util.Scanner;
import java.io.IOException;

public class While2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하시오. ");
		try {									// 입출력 처리는 예외가 발생할 수 있음.
												// IOException예외 발생시 처리해주는 문장이 필요
												// checkedException
												// 실행시에 발생할 수 있는 예외를 미리 체크해서
												// 처리할 catch(){}문을 추가함
			// read() : 입력값 ascii코드값을 리턴
			// 3 입력시 ascii코드값 51이 리턴됨,
			// '0' = 48임
			// 51 - 48 = 3 원하는값 3이나옴
			int num = System.in.read() - '0'; 
			
			
			int i=1;
			if(num >=2 && num <=9) {
				while(i<=9) {
					System.out.print(num + " x " + i + " = " + num*i + "\t");
					i++;
				}
			} else {
				System.out.println("잘못입력했");
			}
			
			
											 
		} catch(IOException e) {			 
			e.printStackTrace();			 
		}									 
	}										 
}
