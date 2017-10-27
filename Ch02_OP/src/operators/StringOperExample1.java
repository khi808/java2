package operators;
/*
 *  String타입 데이터 + String타입 데이터가 아닌 데이터의 연산결과는 String
 * */
public class StringOperExample1 {
	public static void main(String[] args) {
		String str = "JDK";
		System.out.println(str+10.1); // String + double = String타입  
 		String str2 = "특징";
		int i = 7;
		System.out.println(i+str2);
		
		
	}
}
