package p01.references;
/**
 * 다차원 배열(2차원)
 * - 1차원 배열을 묶어서 하나로 만든 배열
 * - java에서 배열은 반드시 길이를 미리 지정해서 선언해야한다. (1차원의 길이는 제외해도 됨)
 * - 값을 저장시 index범위를 벗어나면 오류발생
 * - index번호는 반드시 0번부터 시작.
 * 
 * */
public class MultiArray01Example {
	public static void main(String[] args) {
		// 2차원 배열 객체 생성
		// 1차원 배열의 길이가 3인 배열이 2개 합쳐서 만든 2차원 배열
		// [3] 1차원배열의 길이, [2]1차원 배열의 개수
		int[][] arr = new int[2][3];
		//이차원 배열이므로  타입[][] 배열명 = new 타입[행의수][열의수];
		arr[0][0] = 7; arr[0][1] = 23; arr[0][2] = 11;
		arr[1][0] = 27; arr[1][1] = 2; arr[1][2] = 13;
		for(int i=0; i<arr.length; i++) { //arr.length는 1차원배열의 개수를 리턴함, 즉 행의 길이 arr.length = 2
			System.out.print(arr[i][0]+"\t");
			System.out.print(arr[i][1]+"\t");
			System.out.println(arr[i][2]);
		}
		// => 이중 for문사용
		System.out.println("====================");
		for(int i=0; i<arr.length; i++) { //arr.length는 1차원배열의 개수를 리턴함, 즉 행의 길이 arr.length = 2
			for(int j=0; j<arr[i].length; j++) { // arr[i].length는 1차원배열의 길이, 즉 열의 길이 arr[i].length = 3
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("====================");
		// 향상된 for문 (for each문)
		// 첫번째 for each문에서는 1차원 배열의 행의수 만큼 반복 
		// 두번째 for each문에서는 1차원 배열의 열의수 만큼 반복
		// arr[0] -> arr[0][0] arr[0][1] arr[0][2]
		// arr[1] -> arr[1][0] arr[1][1] arr[1][2]
		for(int[] i : arr) { // 이차원 배열의 반복자변서 선언
							 // int[][] arr => int[] 변수 : arr
			for(int j : i) { // int[] i => int 변수 : i
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}
}
