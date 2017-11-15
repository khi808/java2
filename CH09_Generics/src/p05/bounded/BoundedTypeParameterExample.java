package p05.bounded;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b");//Number를 상속받은 객체들만 올 수 있음
											  //대상 - 문자열은 올수 없음
		int result1 = Util.compare(10, 20);//auto-boxing, auto-unboxing
		System.out.println(result1);
		
	}
}
