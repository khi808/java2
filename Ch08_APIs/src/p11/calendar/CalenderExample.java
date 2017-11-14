package p11.calendar;
import java.util.Calendar;
/**
 * Calendar는 달력정보를 가지고 있는 객체
 * 		- Calendar의 날짜정보는 PC의 system타임을 근거로 함.
 * */
public class CalenderExample {
	public static void main(String[] args) {
		//singleton : 생성자를 private로 막아서 외부에서
					//생성을 하지 못하게 하고, getInstance()메소드로
					//객체를 전달하는 방식
				//  - 데이타의 오류를 막기위함.
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String str = "";
		switch(week) {
		case 1 : 
			str = "일요일";
			break;
		case 2 : 
			str = "월요일";
			break;
		case 3 : 
			str = "화요일";
			break;
		case 4 : 
			str = "수요일";
			break;
		case 5 : 
			str = "목요일";
			break;
		case 6 : 
			str = "금요일";
			break;
		case 7 : 
			str = "토요일";
			break;
		}
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		strAmPm = (amPm ==0) ? "오전" : "오후";
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year+"년 "+month+"월 "+day+"일 "+str+" "+strAmPm+" "+hour+"시 "+minute+"분 "+second+"초");
	}
}
