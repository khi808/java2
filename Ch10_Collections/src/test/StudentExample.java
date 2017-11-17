package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentExample {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		students.add(new Student(1,"홍길동"));
		students.add(new Student(2,"일지매"));
		students.add(new Student(1,"임꺽정"));//번호가 같으면 논리적 동등 객체
											 //저장하지 않게 처리
		Iterator<Student> iter = students.iterator();
		while(iter.hasNext()) {
			Student std = iter.next();
			System.out.println(std.StudentNum+"|"+std.name);
		}
	}
}
