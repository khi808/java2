package p06.strings;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "홍길동&이수홍,일지매,김자바-이순신";
		//split()메소드는 매개변수로 받은 구분자를 기준으로
		//토큰들을 추출함.
		String[] names = text.split("&|,|-");
		for(String n:names) {
			System.out.println(n);
		}
		
	}
}
