package operators;
/*
 * 증감 연산자 - 증가 , 감소하는 연산자
 * 증감 연산자는 피연산자의 왼쪽/오른쪽 위치에 따라
 * 연산되는 순서가 달라짐.
 * ex ) i++ = i가 먼저 연산되고 후에 증가됨, ++i = i가 증가 되고 연산됨
 * 
 * */
public class OperExample3 {
	public static void main(String[] args) {
		int x = 0, y = 0;
		// 후위 연산자 = 0으로 출력 후에 1 증가됨
		System.out.println(x++);
		System.out.println(y++);
		// 전위 연산자 = 값이 1 증가 된 후에 출력됨
		System.out.println(++x);
		System.out.println(++y);
		
		int family = 150;
		System.out.println(++family);
	}
}
