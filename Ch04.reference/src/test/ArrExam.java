package test;

import java.util.Scanner;

public class ArrExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("--------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.종료");
			System.out.println("--------------------");
			System.out.println("선택>");
			int selectNo = sc.nextInt();
			if(selectNo == 1) { // 학생수만큼 배열생성
				System.out.println("학생수를 입력하세요.");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2 && studentNum != 0) { // 학생수만큼 배열에 점수입력
				System.out.println("점수를 입력하세요. 학생수 : " + studentNum);
				for(int i=0; i<scores.length; i++) {
					System.out.println(i+"번째 학생점수(0~100) : (종료 : 10000입력)");
					scores[i] = sc.nextInt();
					if(scores[i] == 10000) {
						scores[i] = 0;
						break;
					}
					if(!(scores[i] <= 100 && scores[i] >= 0)) {
						System.out.println("다시입력 범위 0~100");
						--i;
						continue;
					}
				}
			} else if(selectNo == 3 && studentNum != 0) { // 점수를 리스트로 출력
				for(int i=0; i<scores.length; i++) {
					System.out.println("studentNum [" +(i+1) +"]="+scores[i]);
				}
			} else if(selectNo == 4) { // 종료
				run = false;
			} else {
				System.out.println("학생이 없습니다.");
			}
			
			
		}// while문 끝
		System.out.println("종료");
		
		
	}
}
