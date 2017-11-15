package p07.extends_implements;
/**
 * 제네릭 인터페이스
 * */
public interface Storage<T> {
	public void add(T item, int index);//추가메소드
	public T get(int index);//출력메소드
}
