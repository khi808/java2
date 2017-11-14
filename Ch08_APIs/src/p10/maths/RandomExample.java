package p10.maths;

import java.util.Arrays;
import java.util.Random;

/**
 * Random 클래스 Random(){}, Random(seed){}
 * Random()생성자의 매개변수가 없으면 무작위로 난수가 발생
 * Random(seed)생성자의 매개변수가 있으면 처음 생선된 무작위 값이 고정 발생
 * 					다시 실행을 해도 같은 값이 발생
 * Random클래스와 Math.random()의 차이는 seed 설정 차이
 * */
public class RandomExample {
	public static void main(String[] args) {
		//선택번호
		int[] selectNumber = new int[6];//int타입의 배열
		Random random = new Random(3);
		System.out.println("선택 번호:");
		for(int i=0;i<6;i++) {
			selectNumber[i] = random.nextInt(45)+1;//1~45까지 난수 발생
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		//당첨번호(자동발번)
		int[] winNumber = new int[6];
		random = new Random(3);
		System.out.println("당첨 번호:");
		for(int i=0;i<6;i++) {
			winNumber[i] = random.nextInt(45)+1;
			System.out.print(winNumber[i]+" ");
		}
		System.out.println();
		//당첨여부 확인
		Arrays.sort(selectNumber);//정렬
		Arrays.sort(winNumber);//정렬
		//1차원 배열의 요소들의 값이 기본데이터 타입(참조타입이 아님)
		boolean result = Arrays.equals(selectNumber, winNumber);
		if(result)
			System.out.println("1등 당첨!!");
		else
			System.out.println("1등 당첨 실패");
		
		
		
	}
}
