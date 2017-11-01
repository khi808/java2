package p01.references;

public class Arr06MaxMinExample {
	public static void main(String[] args) {
		int[] num = {76,45,34,89,100,50,90,92};
		int sum=0;
		int max=0; // max 변수의 초기값은 배열의 요소보다 현저하게 작은값 (최초의 값을 받아오기 위해)
		int min=120; // min 변수의 초기값은 배열의 요소보다 현저하게 큰 값 (최초의 값을 받아오기 위해)
		// int 타입의 배열에서 최소값, 최대값 구하는 간단한 방법
		for(int i=0;i<num.length; i++) {
			sum+=num[i];//합계
			if(num[i]>max) max=num[i]; // 첫번째 루프때 76이 들어감 마지막으로 들어가는 값은 100
			if(num[i]<min) min=num[i]; // 첫번째 루프때 76이 들어감 마지막으로 들어가는 값은 34
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + sum/num.length);
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
