package p03.methods;
/**
 * 정적 메소드
 * - 클래스가 클래스로더에 의해 메모리에 적재될 때
 *   클래스내용을 파악하여 static키워드 있는 필드나 메소드는
 *   따로 떼어서 static(정적)영역으로 로드함.
 * - 인스턴스 필드, 메소드는 클래스내의 그대로 둠.
 * => static멤버,메소드는 클래스명.멤버 or 클래스명.메소드 로 사용함
 * => instance멤버,메소드는 객체명.멤버 or 객체명.메소드로 반드시 instance를 만들어서 사용해야함
 * */
public class Calculator4 {
	String color; // 인스턴스 필드
	
	void setColor(String color) { // 인스턴스 메소드
		this.color = color;
	}
	
	// 정적 메소드 (static 메소드)
	static int plus(int x, int y) {
		return x+y;
	}
	// 정적 메소드 (static 메소드)
	static int minus(int x, int y) {
		return x-y;
	}
}
