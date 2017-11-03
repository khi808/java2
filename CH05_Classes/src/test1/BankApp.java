package test1;

import java.util.Scanner;

public class BankApp {
	private static Account[] accountArr = new Account[10];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("--------------------------");
			System.out.println("선택>");
			int selectNo = sc.nextInt();
			
			switch (selectNo) {
			case 1: createAccount(); break;
			case 2: accountList(); break;
			case 3: deposit(); break;
			case 4: withdraw(); break;
			case 5: run=false; break;
			default : System.out.println("다시입력하세요.");
			}
			
		}
		System.out.println("프로그램 종료");
		
		
	}
	
	private static void createAccount() {
		//Bank-0001, 홍길동, 100000
		for(int i=0; i<accountArr.length; i++) {
			System.out.println("계좌번호를 입력하세요.");
			String ano=sc.next();
			System.out.println("이름을 입력하세요.");
			String onwer=sc.next();
			System.out.println("입금할 금액을 입력하세요.|종료:-99");
			int bal = sc.nextInt();
			if(bal == -99) break;
			accountArr[i] =
					new Account(ano, onwer, bal);
		} // 계좌번호 중복없애고 입금금액 -로 안되도록 하고
		
	} // 메소드 끝.
	private static void accountList() {
		// 
		for(int i=0; i<accountArr.length; i++) {
			if(accountArr[i] != null) {
				System.out.println("계좌번호: "+accountArr[i].getAno()+" 이름: "+accountArr[i].getOwner()+" 보유금액: "+accountArr[i].getBalance());
			}
		}
		
	}
	private static void deposit() {
		// 계좌번호 선택
		
		// 입금
	}
	private static void withdraw() {
		// 계좌번호선택
		// 출금(잔액<출금액)
		
	}

}
