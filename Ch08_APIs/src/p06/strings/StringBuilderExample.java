package p06.strings;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "Java ";
		str+="program study";
		System.out.println(str);
		//StringBuilder는 내부에 버퍼(배열과 비슷한 메모리공간)
		StringBuilder sb = new StringBuilder();
		sb.append("Java ");
		sb.append("Program study");
		System.out.println(sb.toString());
		//index위치 4에 "2"를 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());
		sb.setCharAt(4, '6');//문자를 수정
		System.out.println(sb.toString());
		sb.replace(6, 13, "book");//6<= <13
		System.out.println(sb.toString());
		sb.delete(4, 5);//index 4 < 5 //4번째 index문자 삭제
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총 문자수: "+length);
		
		String result = sb.toString();
		System.out.println(result);
	}
}
