package p01.breaks;

public class BreakExample2 {
	public static void main(String[] args) {
		int i=0, j=0;
		while(true) {
			i++;
			while(true) {
				System.out.print(j+"\t");
				if(j==5) break;
				j++;
			}// 안쪽 while문 끝
			System.out.println("i = " + i);
			if(i==10) break;
		}// 바깥쪽 while문 끝
		System.out.println("종료");
	}
}
