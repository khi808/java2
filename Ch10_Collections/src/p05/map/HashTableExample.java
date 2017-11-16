package p05.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
/**
 * Thread-safe: 멀티쓰레드환경에서 자료를 보호할 수 있는 구조
 * */
public class HashTableExample {
	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<>();
		
		map.put("spring", "1234");
		map.put("summer", "1234");
		map.put("fall", "1234");
		map.put("winter", "1234");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 패스워드를 입력하세요");
			System.out.print("아이디: ");
			String id = sc.next();
			
			System.out.print("패스워드: ");
			String password = sc.next();
			int cnt = 0;
			/*if(map.containsKey(id)) {
				if(map.containsValue(password)) {
					System.out.println("로그인에 성공하셨습니다.");
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else {
				System.out.println("아이디가 없습니다.");
			}*/
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 완료");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력한 아이디가 없습니다.");
			}
		}
		
	}
}
