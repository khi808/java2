package p01.standard;

import java.util.HashMap;
/**
 * HashMap<키,값> 키와 값의 형태로 자료를 저장할 수 있는 객체
 * 
 * */
public class KeyExample {
	public static void main(String[] args) {
		// 자료저장용 객체 생성
		HashMap<Key, String> hashmap = new HashMap<>();
		Key key = new Key(1);
		//
		hashmap.put(new Key(2), "홍길동");
		
		String value = hashmap.get(new Key(2));
		System.out.println(value);
	}
}
