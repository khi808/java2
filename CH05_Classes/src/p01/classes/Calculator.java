package p01.classes;
/**
 * 계산기 피연산자2, 연산자
 * */
public class Calculator {
	// 속성
	private int field1; // 피연산자 초기값 0
	private int field2; // 피연산자 초기값 0
	private char op; // 연산자 초기값 " "
	
	// 메소드
	public void setField1(int field1) { // 피연산자1 설정
		this.field1 = field1;
	}
	public void setField2(int field2) { // 피연산자2 설정
		this.field2 = field2;
	}
	public void setOp(char op) { // 연산자 설정
		this.op = op;
	}
	// int, int, char
	public void calc(int field1, int field2, char op) {
		switch (op) {
		case '+' :
			System.out.println(field1 + field2);
			break;
		case '-' :
			System.out.println(field1 - field2);
			break;
		case '*' :
			System.out.println(field1 * field2);
			break;
		case '/' :
			System.out.println((double)field1 / (double)field2);
			break;
		case '%' :
			System.out.println((double)field1 % (double)field2);
			break;
		}
	}
	
	public void calc() {
		switch (this.op) {
		case '+' :
			System.out.println(this.field1 + this.field2);
			break;
		case '-' :
			System.out.println(this.field1 - this.field2);
			break;
		case '*' :
			System.out.println(this.field1 * this.field2);
			break;
		case '/' :
			System.out.println((double)this.field1 / (double)this.field2);
			break;
		case '%' :
			System.out.println((double)this.field1 % (double)this.field2);
			break;
		}
	}
	
}