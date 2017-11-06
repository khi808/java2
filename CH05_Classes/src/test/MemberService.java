package test;

import java.util.Scanner;

public class MemberService {
	static Member[] memberArr = new Member[100];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// 객체 생성
		String id = " ";
		String pw = " ";
  start:while(true) {
		System.out.println("아이디를 입력하세요");
		id = sc.next();
		System.out.println("비밀번호를 입력하세요");
		pw = sc.next();
		Member member = findMember(id,pw);
		if(member==null) {
			System.out.println("아이디가 없습니다. 회원가입 하시겠습니까? y/n");
			char c = sc.next().charAt(0);
			if (!(c == 'Y' || c == 'y')) continue start;
			System.out.println("아이디 입력 : ");
			id = sc.next();
			System.out.println("비밀번호 입력 : ");
			pw = sc.next();
			System.out.println("이름 입력 : ");
			String name = sc.next();
			member = new Member(id, pw, name);
			for(int i=0;i<memberArr.length; i++) {
				if(memberArr[i] == null) {
					memberArr[i] = member;
					System.out.println("회원가입성공");
					break;
				}
			}
		} else {
			System.out.println(member.getName()+"님 로그인 환영합니다.");
		}
		
		}
	}
	private static Member findMember(String id, String password) {
		Member member = null;
		for(int i=0; i<memberArr.length; i++) {
			if(memberArr[i] != null) {
			if(memberArr[i].getId().equals(id) && memberArr[i].getPassword().equals(password)) {
				member = memberArr[i];
			}
		}
		}
		return member;
	}
	
}
