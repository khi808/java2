package p01.references;
/**
 * sort문 
 * */
public class Arr07SortExample {
	public static void main(String[] args) {
		int[] num = {76,45,34,89,100,50,90,92};
		int temp=0;
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i] > num[j]) { // i번째의 값이 j번째의 값보다 크면 서로 바꿈 ( 오름차순 )
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		System.out.print("{ ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.print("}");
		for(int i=0; i<num.length; i++) { // i번째의 값이 j번째의 값보다 작으면 서로 바꿈 ( 내림차순 )
			for(int j=i+1; j<num.length; j++) {
				if(num[i] < num[j]) { 
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		System.out.println();
		
		System.out.print("{ ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.print("}");
		
	}
}
