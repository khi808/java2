package test;

import java.util.Scanner;

public class ArrExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			try {
			System.out.println("--------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.종료|5.분석");
			System.out.println("--------------------");
			System.out.println("선택>");
			int selectNo = sc.nextInt();
			if(selectNo == 1) { // 학생수만큼 배열생성
				System.out.println("학생수를 입력하세요.");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 25) { // 학생수만큼 배열에 점수입력
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
			} else if(selectNo == 3) { // 점수를 리스트로 출력
				for(int i=0; i<scores.length; i++) {
					System.out.println("studentNum [" +(i+1) +"]="+scores[i]);
				}
			} else if(selectNo == 5) { // 종료
				run = false;
			} else if(selectNo == 4) { // 분석
				char grade =' ';
				int temp =0;
				int num =0;
				System.out.println("1.오름차순출력|2.내림차순출력|3.등급 출력|4.종료");
				num = sc.nextInt();
				if(num == 1) {
					for(int i =0; i<scores.length; i++) {
						for(int j=i+1; i<scores.length; j++) {
							if(scores[i] > scores[j]) {
								temp = scores[i];
								scores[i] = scores[j];
								scores[j] = temp;
							}
						}
					}
					System.out.println("");
				} else if(num == 2) {
					for(int i =0; i<scores.length; i++) {
						for(int j=i+1; i<scores.length; j++) {
							if(scores[i] > scores[j]) {
								
							}
						}
					}
				} else if(num == 3) {
					System.out.println("등급 출력");
					
				} else if(num == 4){
					
				}
			} else {
				System.out.println("학생이 없습니다.");
			}
			
			} catch (Exception e) {
				System.out.println("학생이 없습니다.");
			}
		}// while문 끝
		System.out.println("종료");
		
		
	}
}
