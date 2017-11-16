package p01.arrayList;

import java.util.ArrayList;//클래스
import java.util.List;//인터페이스

public class ArrayListExample2 {
	public static void main(String[] args) {
		//클래스구현체의 객체 생성 Promotion해서 대입(List인터페이스타입의 list에 ArrayList객체를 대입)
		List<String> list = new ArrayList<>();
		//자료 추가
		list.add("Java");//뒤에 추가
		list.add("JDBC");//뒤에 추가
		list.add("Servlet/JSP");//뒤에 추가
		list.add(2,"DATABASE"); //index 2번에 삽입
		list.set(0, "HTML"); //index 0번에 값(객체)을 수정(교체)
		list.add("iBatis");//뒤에 추가
		
		//추가된 자료의 개수 확인
		int size = list.size();
		System.out.println("ArrayList에 들어있는 객체의 개수 "+size);
		
		//특정 인덱스 위치
		String str1 = list.get(2);
		System.out.println("list(2)"+str1+"\n");
		
		//전체 객체 출력
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
