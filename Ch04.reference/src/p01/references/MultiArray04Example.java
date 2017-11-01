package p01.references;
/**
 * 가변길이 이차원 배열
 * 
 * */
public class MultiArray04Example {
	public static void main(String[] args) {
		int sum=0;
		int cnt =0;
		int[][] a = {{12,34,32},{21,54,76,23},{12,65}}; //선언과 동시에 초기값을 지정 (1차원초기값으로 2차원배열생성)
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
				sum += a[i][j];
			}
			cnt += a[i].length;
			System.out.println();
		}
		System.out.println("==========================");
		// for each문으로 작성
		for(int[] i : a) {
			for(int j : i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ (double) sum / (double) cnt);
	}
}
