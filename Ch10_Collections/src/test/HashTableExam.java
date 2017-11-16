package test;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
/**
 * Thread-safe: 멀티쓰레드환경에서 자료를 보호할 수 있는 구조
 * */
public class HashTableExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.회원가입 2.로그인 3.종료
		//1.회원가입 - scanner로 입력받아서 저장
		// 반복 저장 종료.
		//2.로그인시 비밀번호 5회 틀릴시 종료
		// 아이디 없으면 가입
		while(true) {
			System.out.println("1.회원가입|2.로그인|3.종료");
			int selectNo = sc.nextInt();
			switch(selectNo) {
			case 1 : 
				System.out.println("[회원가입]");
				System.out.print("아이디 입력>");
				String id = sc.next();
				System.out.print("비밀번호 입력>");
				String password = sc.next();
				if()
			case 2 :
			case 3 :
			}
		}
		Map<String,String> map = new Hashtable<>();
		
		map.put("spring", "1234");
		map.put("summer", "1234");
		map.put("fall", "1234");
		map.put("winter", "1234");
		
		
		int cnt = 0;
		while(true) {
			System.out.println("아이디와 패스워드를 입력하세요");
			System.out.print("아이디: ");
			String id = sc.next();
			
			System.out.print("패스워드: ");
			String password = sc.next();
	
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 완료");
					break;
				} else {
					if(cnt==5) {
						System.out.println("비밀번호 5회 입력 실패로 종료합니다.");
						break;
					}
					System.out.println("비밀번호가 일치하지 않습니다.");
					cnt++;
				}
			} else {
				System.out.println("입력한 아이디가 없습니다.");
			}
		}
		
	}
}
