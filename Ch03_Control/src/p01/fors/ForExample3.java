package p01.fors;

public class ForExample3 {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int n=5; n>i; n--)
				System.out.print(" ");
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		for(int i=0;i<=5;i++) {
			for(int n=1; n<=i; n++)
				System.out.print(" ");
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
