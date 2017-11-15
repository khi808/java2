package p07.extends_implements;

public class StorageImple<T> implements Storage<T>{
	//필드
	private T[] array;
	//생성자
	//필드인 T[] array의 초기화
	public StorageImple(int capacity) {
		this.array = (T[])(new Object[capacity]);
	}
	
	//메소드
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}
	@Override
	public T get(int index) {
		return array[index];
	}
	
}
