package p03.methods;
/**
 *  static 멤버의 호출 => 클래스명.메소드()
 *  instance 멤버의 호출 => new 클래스명(); 후 접근가능.
 * */
public class Calculator4Example {
	public static void main(String[] args) {
		int result1 = Calculator4.plus(10, 20);
		int result2 = Calculator4.minus(20, 10);
		System.out.println("10+20="+result1);
		System.out.println("20-10="+result2);
		
		Calculator4 cal = new Calculator4();
		cal.setColor("빨강");
		System.out.println(cal.color);
		
	}
}
