package p01.fors;

import java.util.Scanner;

public class ForExample4 {
	public static void main(String[] args) {

		
		// 구구단 가로출력
			for(int i =2; i<=9; i++) {
				for(int j =1; j<=9; j++) {
					System.out.print(i + " x " + j + " = " + i*j + "\t");				
				}
				System.out.println();
			}
			System.out.println("----------------------");
			// 구구단 세로출력
			for(int i =1; i<=9; i++) {
				for(int j =2; j<=9; j++) {
					System.out.print(j + " x " + i + " = " + i*j + "\t");				
				}
				System.out.println();
			}
	}
}
