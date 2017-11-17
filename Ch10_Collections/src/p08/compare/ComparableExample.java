package p08.compare;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("홍길동",45));
		treeSet.add(new Person("일지매",25));
		treeSet.add(new Person("임꺽정",31));
		
		Iterator<Person> iter = treeSet.iterator();
		while(iter.hasNext()) {
			Person person = iter.next();
			System.out.println(person.name+"|"+person.age);
		}
		
		
		
	}
}
