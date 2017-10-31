package p01.references;

public class ArrExample4 {
	public static void main(String[] args) {
		int[] a = {85,90,75,100,65};
		int sum=0;
		double avg;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		avg = sum/a.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		// 향상된 for 문
		sum =0;
		for(int k:a) { // (타입 변수 : 객체 ) {}
			sum+=k;
		}
		System.out.println("합계 : " + sum);
	}
}
