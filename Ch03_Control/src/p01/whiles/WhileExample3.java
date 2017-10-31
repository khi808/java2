package p01.whiles;
/**
 * 중첩 while문
 * */
public class WhileExample3 {
	public static void main(String[] args) {
		int i = 1, j=2; // 초기값 설정
		while(i<=9) {
			while(j<=9) {
				System.out.printf("%d "+"x"+" %d"+" = "+"%2d  ", j,i,i*j);
				j++;
			}
			System.out.println();
			j=2; // 다시 초기화
			i++; // 바깥쪽 while()문의 증감식.
		}
		
	}
}
