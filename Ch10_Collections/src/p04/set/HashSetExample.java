package p04.set;

import java.util.HashSet; //클래스
import java.util.Iterator;//인터페이스
import java.util.Set; //인터페이스

/**
 * Set - 자료를 중복저장하지 않는 자료구조,
 *     - 순서가 없음 ( 집합 )
 * */
public class HashSetExample {
	public static void main(String[] args) {
		//Set객체 생성 - HashSet객체 생성 후 Promotion
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //중복저장 X.
		set.add("iBatis");
		
		int size = set.size();//저장된 객체의 개수
		System.out.println("총 객체의 개수: "+size);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(new Integer(1));//객체저장 Wrapper클래스
		set2.add(1);//int타입의 정수 -> Wrapper클래스: auto-boxing
		set2.add(2);//int타입의 정수 -> Wrapper클래스: auto-boxing
		set2.add(new Integer(3));
		
		System.out.println("총 객체의 개수: "+set2.size());
		
		//set에서 자료를 얻어내기위헤서 반복자를 생성
		//iterator() - 저장객체들의 순서와 번지 정보를 만들어서 iterator객체에 저장
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {//hasNext() 자료가 있는지 여부확인
			String e1 = iterator.next(); //next()값을 가져오는 메소드
			System.out.print(e1+"\t");
		}
		System.out.println();
		System.out.println("-----set2-----");
		
		//set2의 정보 출력
		Iterator<Integer> iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			int e2 = iterator2.next();
			System.out.print(e2+"\t");
		}
		
	}
}
