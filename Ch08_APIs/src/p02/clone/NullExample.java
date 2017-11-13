package p02.clone;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		// requireNonNull(객체) : 객체가 null이 아니면 객체의 내용 출력
		System.out.println(Objects.requireNonNull(str1));
		try {
			// 객체가 null이면 NullPointerException 을 출력.
			System.out.println(Objects.requireNonNull(str2));
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name 
				= Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
