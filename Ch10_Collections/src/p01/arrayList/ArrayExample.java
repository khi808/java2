package p01.arrayList;
/**
 * 배열 사용의 단점
 *  - 크기가 초기의 크기로 고정,자료추가가 어려움
 *  - 객체의 저장과 연산시 null여부확인
 * */
public class ArrayExample {
	public static void main(String[] args) {
		//배열은 크기가 정해져있는 자료구조
		int [] arr1 = new int[5];//크기가 5이 배열
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		//arr1[4] = "5";//반드시 int타입의 데이타만 저장 가능
		
		//arr1[5] = 6; //ArrayIndexOutOfBoundsException
		//arr1[7] = 7;
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);
	
		//참조데이타 타입의 배열
	   String[] arr3 = new String[3];
	   arr3[0] = "홍길동";
	   arr3[1] = "일지매";
	   //배열 요소의 초기값은 null이다.
	   //요소값의 연산이 필요한 상화에서는
	   //반드시 요소값이 null인지 여부확인
	   for(int i=0;i<arr3.length;i++)
	      System.out.println(arr3[i]);
		
 	}

}
