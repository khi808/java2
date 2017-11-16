package p05.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map 콜렉션 <K,V> 형태로 객체를 저장하는 자료구조
 * */
public class HashMapExample {
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
		Set<String> keySet = map.keySet();//keySet() -> map에 있는 키들만 리턴해서 set에 저장
		Iterator<String> iterator = keySet.iterator();//set의 값 정보 iterator에 저장
		
		for(;iterator.hasNext();) {
			String key = iterator.next();
			int value = map.get(key);
			System.out.println(key+" "+value);
		}
		
		//특정위치의 객체 검색
		System.out.println("홍길동:"+map.get("홍길동")); //map.get(키)
		//특정위치의 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry수: "+map.size());
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Enty수: "+map.size());
		
	}
}
