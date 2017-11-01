package p02.enums;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		// 열거형 객체 생성
		Week today = null; // today는 열거타입의 참조변수
		// Calender는 내 pc의 시스템타임을 참조하여
		// 현재 시점의 날짜를 리턴하는 객체
		Calendar cal = Calendar.getInstance(); 
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("week : " + week);
		
		switch(week) {
		case 1: today=Week.SUNDAY; break;
		case 2: today=Week.MONDAY; break;
		case 3: today=Week.TUESDAY; break;
		case 4: today=Week.WEDNESDAY; break;
		case 5: today=Week.THURSDAY; break;
		case 6: today=Week.FRIDAY; break;
		case 7: today=Week.SATURDAY; break;
		}
		
		System.out.println("오늘의 요일은 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("오늘은 쉽니다.");
		} else {
			System.out.println("열심히 공부합시다.");
		}
	}
}
