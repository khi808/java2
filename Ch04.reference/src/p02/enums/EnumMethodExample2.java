package p02.enums;

import java.util.Scanner;

public class EnumMethodExample2 {
	public static void main(String[] args) {
		Gender gender = null;
		Scanner sc = new Scanner(System.in);
		// 남성이면 "남성입니다."
		// 여성이면 "여성입니다."
		
		//valueOf()메소드
		// 열거형.valueOf(문자열) -> 입력한 문자열을
		// 열거형 상수로 변환하는 메소드
		
		gender = Gender.valueOf(sc.next());
		if(gender ==Gender.MALE) {
			System.out.println("남성입니다.");
		}else {
			System.out.println("여성입니다.");
		}
			
			
			
	}
}

