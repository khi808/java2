package p01.references;
/**
 * 배열의 복사
 * */
public class ArrayCopy01Example {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7}; // 길이가 7인 1차원 배열
		int[] b = new int[10]; //길이가 10인 1차원 배열, 모든 요소 0으로 초기화
		int[] c = new int[10];
		int[] d = new int[10];
		int[] e = new int[10];
		
		// 배열의 요소들의 값 복사
		// a배열의 요소들을 b배열로 복사하면
		// 복사되지 않은 요소들은 초기값인 0 그대로 존재함.
		for(int i=0; i<a.length; i++) { // 복사
			b[i] = a[i];
		}
		for(int i=0; i<b.length; i++) { // b배열 출력
			System.out.print("b["+i+"]="+b[i]+"\t");
		}
		System.out.println();
		// for each문 출력
		for(int i : b) {
			System.out.print(i+"\t");
		}
		System.out.println();
		// 배열의 복사 System.arraycopy()메소드
		// arraycopy(원본, 시작index, 타겟, 타겟의시작index, 복사할 길이);
		System.arraycopy(a, 0, c, 0, 7);
		for(int i=0; i<c.length; i++) {
			System.out.print("c["+i+"]="+c[i]+"\t");
		}
		System.out.println();
		
		// 배열의 일부분 복사하기
		System.arraycopy(a, 0, d, 2, a.length);
		for(int i=0; i<d.length; i++) {
			System.out.print("d["+i+"]="+d[i]+"\t");
		}
		System.out.println();
		
		// a배열의 일부를 타겟배열의 일부에 복사(a배열의 1번째 인덱스에서 부터 a.length-1 까지 e배열의 3번째 인덱스에서부터 복사 시작)
		System.arraycopy(a, 1, e, 3, a.length-1);
		for(int i=0; i<e.length; i++) {
			System.out.print("e["+i+"]="+e[i]+"\t");
		}
		System.out.println();
		
		//for문을 사용하여 a배열의 1번째 index부터 끝까지의 내용을
		//e배열의 3번index부터 시작하는 복사
		for(int i=1; i<a.length; i++) {
			if(i>0)
			e[i+3]=a[i];
		}
		
		for(int i=0; i<e.length; i++) {
			System.out.print("e["+i+"]="+e[i]+"\t");
		}
		System.out.println();
		
	}
}
