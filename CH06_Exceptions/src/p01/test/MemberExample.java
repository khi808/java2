package p01.test;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member[] member = new Member[10];
		boolean isContinue = true;
		String id;
		String pw;
		String name;
		int cnt = 0;
		w:while(isContinue) {
			System.out.println("1.회원가입|2.로그인");
			int select = sc.nextInt();
			if(select == 1) {
				for(int i =0; i<member.length; i++) {
					System.out.println("ID입력 : ");
					id = sc.next();
					System.out.println("password입력 :");
					pw = sc.next();
					System.out.println("이름 입력: ");
					name = sc.next();
					if(member[i] == null) {
						if(member[i].getId().equals(id)){
							System.out.println("이미 존재하는 ID입니다.");
						}
							member[i] = new Member(id, pw, name);
							System.out.println("회원가입 완료");
							break;
					} 
				}
			} else if(select == 2) {
				System.out.println("ID입력 :");
				id = sc.next();
				System.out.println("password입력 :");
				pw = sc.next();
				for(int i=0; i<member.length; i++) {
					if(member[i] != null) {
						if(member[i].getId().equals(id) && member[i].getPassword().equals(pw)) {
							System.out.println(member[i].getName()+"님 로그인 되었습니다.");
						} else if(member[i].getId().equals(id) && !(member[i].getPassword().equals(pw))){
							System.out.println("비밀번호가 틀렸습니다.");
							if(cnt == 5) isContinue = false;
							cnt++;
						} else {
							System.out.println("ID가 없습니다.");
						}
					}
				}
			} else {
				System.out.println("다시 선택 1 or 2");
				continue w;
			}
		}
		/**
		 * 회원가입,
		 * 로그인 처리
		 * ID체크 ID가 다르면 NoMemberException();
		 * 회원가입 처리
		 * pw체크 password가 다르면 NoMatchPassword();
		 * password 5회 입력까지 성공못하면 자동 종료
		 * 둘다 맞으면 로그인 성공 메세지 출력
		 * */
	}
}
