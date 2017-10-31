package p01.reference;

public class ArrExample {
	public static void main(String[] args) {
		String[] str = {"산토끼", "집토끼", "판토끼", "죽은토끼","알칼리토끼"};
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		// 향상된 for문으로 바꾸기
		for(String a : str) {
			System.out.println(a);
		}
	}
}
