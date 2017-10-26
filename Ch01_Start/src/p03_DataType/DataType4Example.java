package p03_DataType;
/*
 *  16진수표기 : 0x 로 시작함
 *  8진수표기 : 0으로 시작함
 * */
public class DataType4Example {
	public static void main(String[] args) {
		boolean bool = true;
		byte by = 127;
		short sh = 32767;
		char c = 66;
		
		System.out.println(c); // B
		char c2 = 'A';
		char c3 = '가'; //char타입에 값을 입력시 '가' 입력
		char c4 = '\uac00'; // 해당 unicode를 입력해도 동일한 결과가 나옴
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("한글");
		System.out.println('\ud55c'); // 2byte 표기
		System.out.println('\uae00'); // 2byte 표기
		
		
	}
}
