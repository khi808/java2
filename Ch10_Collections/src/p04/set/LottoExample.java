package p04.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class LottoExample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Random random = new Random();
		
		int cnt = 0;
		while(set.size()<=6) {
			int ran = (int)(Math.random()*45)+1;
			set.add(ran);
			cnt++;
		}
		
		System.out.println("반복횟수:"+cnt); //중복값은 저장 안하는 Set의 특징때문에 반복된 수는 더 많이 나옴
		Iterator<Integer> iterator = set.iterator();
		System.out.println("\t\t"+"당첨번호");
		while(iterator.hasNext()) {
			System.out.print("\t"+iterator.next());
		}
		
	}
}
