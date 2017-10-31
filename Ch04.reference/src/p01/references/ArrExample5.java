package p01.references;

public class ArrExample5 {
	public static void main(String[] args) {
		int[] sum= new int[4];
		double[] avg = new double[4];
		int[] sum2 = new int[3];
		String[] title = {"이름","국어","영어","수학","총점","평균"};
		String[] name = {"일지매","이순신","임꺽정","홍길동"};
		int[][] score = {{90,80,70}, {76,86,90}, {90,78,90}, {80,80,80}};
		
		System.out.println("성적표\n");
		for(String t:title) {
			System.out.print(t + "\t");
		}
		System.out.println();
		for(int i=0;i<44;i++) {
			System.out.print("=");
		}
		System.out.println();
		// 총점, 평균 구하기
		for(int i=0; i<score.length; i++) {
			for(int j=0;j<score[i].length; j++) {
				sum[i] += score[i][j];
				avg[i] = (double)sum[i] / (double)score[i].length; 
			}
		}
		
		for(int i=0; i<score.length; i++) {
			// 이름 점수 총점 평균 출력
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(sum[i] + "\t");
			System.out.println(avg[i]);
		}// 이름 점수 총점 평균 출력 끝
		
		for(int i=0;i<44;i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.print("합계");
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				sum2[0] += score[i][0];
				sum2[1] += score[i][1];
				sum2[2] += score[i][2];
	
			}
			System.out.print(sum2[i]);
		}
		
		
		
	}
}
