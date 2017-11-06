package test1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankApp {
	private static Account[] accountArr = new Account[10];
	private static Scanner sc = new Scanner(System.in);
	private static final String PREFIX = "Bank-";
	private static int seq=0; // 계좌번호 자동발번
	private static boolean isCreated = false;
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
			// 계좌번호 자동발번
			String ano = PREFIX+String.format(new DecimalFormat("0000").format(++seq));
			System.out.println("소유주명 : ");
			String onwer=sc.next();
			System.out.println("입금할 금액 : ");
			int bal = sc.nextInt();
			while(bal<0) {
					System.out.println("다시입력하세요");
					System.out.println("입금할 금액을 입력하세요.");
					bal = sc.nextInt();;
			}
			for(int i=0; i<accountArr.length; i++) {
				if(accountArr[i] != null) {
				accountArr[i] =
						new Account(ano, onwer, bal);
				isCreated = true;
				}
		} // 계좌번호 중복없애고 입금금액 -로 안되도록 하고
			System.out.println("계좌 등록 성공");
	} // 메소드 끝.
	// 계좌등록 여부 확인
	private static boolean isRegistered() {
		return isCreated;
	}
	
	private static void accountList() {
		if(!isRegistered()) {
			System.out.println("먼저 계좌등록을 하세요");
			return; // 메소드를 종료시킴.
		}
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
