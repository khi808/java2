package p01.dowhile;

import java.util.Scanner;

public class DoExample3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int cnt = 0, num;
	int answer = (int)(Math.random() * 100)+1;
	System.out.println("1~100까지의 수 중 어느 수 일까요?");
	do {
		num = sc.nextInt();
		if(answer == num) {
			System.out.println(cnt + "번만에 성공!");
			break;
		} else if (answer>num) {
			System.out.println("더 큰 값을 입력하시오");
		} else {
			System.out.println("더 작은 값을 입력하시오");
		}
		cnt++;
		if (cnt == 5)
			break;
		System.out.println("끝");
	} while (true);
	sc.close();
		
		
	}
}
