package p04.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		//자료구조 객체(Set)
		Set<Member> set = new HashSet<>();
		
		Member mem1 = new Member("홍길동",30);
		Member mem2 = new Member("홍길동",30);
		System.out.println(mem1.hashCode());
		System.out.println(mem2.hashCode());
		
		set.add(mem1);
		set.add(mem2);
		
		System.out.println("저장된 객체수: "+set.size());
		Iterator<Member> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().getName());
		}
	}
}
