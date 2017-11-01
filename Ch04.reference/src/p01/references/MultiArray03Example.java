package p01.references;
/**
 *  가변길이의 이차원배열
 *  - 이차원의 각행의 열을 구성하는 요소의 길이가 서로 다른 배열
 *  - 배열의 값을 구하기 위해서는 각 행의 열을 개별적으로 구해서 처리
 * */
public class MultiArray03Example {
	public static void main(String[] args) {
		int[][] a = new int[3][]; // 행의 길이만 정해놓음 ( 1차원배열의 개수 )
		a[0] = new int[3]; // 크기가 3인 1차원배열 ( 1차원 배열의 길이 )
		a[1] = new int[2]; // 크기가 2
		a[2] = new int[4]; // 크기가 4
		
		a[0][0]=7; a[0][1]=23; a[0][2]=13;
		a[1][0]=23; a[1][1]=3;
		a[2][0]=2; a[2][1]=21; a[2][2]=56; a[2][3]=71;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
