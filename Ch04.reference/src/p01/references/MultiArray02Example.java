package p01.references;
/**
 *  2차원 배열
 * */
public class MultiArray02Example {
	public static void main(String[] args) {
		// 행 3행 3열, 길이가 3인 1차원 배열이 3개 있는 배열
		int[][] a = {{12,45,23},{16,4,879},{45,87,12}}; // 배열의 선언과 동시 초기화
		// a[0][0]=12, a[0][1]=45, a[0][2]=23
		// a[1][0]=16, a[1][1]=4, a[1][2]=879
		// a[2][0]=45, a[2][1]=87, a[2][2]=12
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print("a["+i+"]["+j+"]= "+a[i][j]+"\t");
			}
				System.out.println();
		}
		System.out.println("========================================");
		// for each문으로 작성
		int cnt1 =0, cnt2 =0;
		for(int[] i : a) {
			for(int j : i) {
				System.out.print("a["+cnt1+"]["+cnt2+"]= "+j+"\t");
				cnt2++;
			}
			cnt1++;
			cnt2=0;
			System.out.println();
		}
		
	
		
	}
}
