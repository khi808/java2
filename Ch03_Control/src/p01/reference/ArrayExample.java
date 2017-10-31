package p01.reference;
/**
 * 배열
 * */
public class ArrayExample {
	public static void main(String[] args) {
		int[] a = {2,3,5,99,1,33};// 초기값으로 배열 생성할 수 있음
		for(int i=0;i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		for(int k:a) { // for(객체타입 변수 : 객체변수명){변수}
			System.out.println("k="+k);
		}
		
		System.out.println("-----------");
		
		int[] c; 
		c = new int[] {23,55,43,253,4}; // new 키워드로 배열객체를 생성 및 초기화함
		
		
	}
}
