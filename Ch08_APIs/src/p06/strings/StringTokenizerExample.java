package p06.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/일지매/임꺽정/이순신";
		//객체 생성시 구분자를 기준으로 문자를 잘라서 저장.
		StringTokenizer st = new StringTokenizer(text, "/");
		int count = st.countTokens();//토큰화된 문자열의 갯수를 리턴
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		//
		st = new StringTokenizer(text, "/");
		//hasMoerTokens() - 남은 토큰이 있는지 확인 메소드
		while(st.hasMoreTokens()) {
			String token = st.nextToken(); //token 추출 메소드
			System.out.println(token);
		}
		
		
		
		
	}
}
