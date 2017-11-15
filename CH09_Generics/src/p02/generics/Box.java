package p02.generics;
/**
 * 제너릭 타입 <T> : T타입만 대입 가능
 * */
public class Box<T> {
	//필드
	private T t;
	
	//생성자
	public Box(T t) {
		this.t = t;
	}
	public Box(){}
	//메소드
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
