package p05.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map 콜렉션 <K,V> 형태로 객체를 저장하는 자료구조
 * */
public class HashMapExample2 {
	public static void main(String[] args) {
		//Map객체 생성
		Map<String,Integer> map = new HashMap<>();
		//객체 저장
		map.put("홍길동", 85);//<K,V> 첫번째 와 네번째는 키가 "홍길동"으로 동일
		map.put("일지매", 90);//두번째 값 90이 다섯번째 값 90과 동일
		map.put("임꺽정", 85);
		map.put("홍길동", 95);
		map.put("이순신", new Integer(90));
		
		System.out.println("총 저장된 Entry수: "+map.size());
		//객체 출력
		//entrySet() : Map의 Entry(키와 값이 합쳐진 객체)를 리턴하여 Set에 저장
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryItor 
			= entrySet.iterator();//set의 값 정보 iterator에 저장
		
		for(;entryItor.hasNext();) {
			Map.Entry<String, Integer> key = entryItor.next();
			String key1 = key.getKey();//Entry에서 key추출 메소드
			int value = key.getValue();//Entry에서 value추출 메소드
			System.out.println(key1+" "+value);
		}

		
		
	}
}
