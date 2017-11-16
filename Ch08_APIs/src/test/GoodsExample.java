package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GoodsExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Goods goods = new Goods("새우깡",1000);
		//LocalDateTime.of(년,월,일,시,분,초) - 강제 생성
		//LocalDateTime.now();//현재 날짜 시간 객체 생성
		//새우깡의 정상 가격은 1000원
		//새우깡의 가격 다운 행사 기간은 2017-11-15 ~ 2017-11-18
		//이 기간 동안의 행사 가격은 800원, 기간이 지나면 다시 1000원으로 환원
		//Event객체 생성 해서 날짜 비교해서 상품명과 가격 출력
		//시작날짜, 종료날짜 입력 및 parse()메소드 사용.
		LocalDateTime startDate = LocalDateTime.of(2017, 11, 15,0,0);
		LocalDateTime endDate = LocalDateTime.of(2017, 11, 18,23,59);
		GoodsEvent event = new GoodsEvent(goods,startDate,endDate);
		System.out.println("행사 시작 "+event.getStartDate());
		System.out.println("행사 종료 "+event.getEndDate());
		System.out.println("날짜 입력 > yyyy,MM,dd");
		String dateStr = sc.next();//날짜 입력 받기
		LocalDate now; //입력받은 날짜 객체 저장
		LocalDateTime now2;// now->now2
		DateTimeFormatter formatter 
			= DateTimeFormatter.ofPattern("yyyy,MM,dd");//입력값이 패턴에 일치하는지 확인하는 값
		now = LocalDate.parse(dateStr,formatter);
		now2 =
			LocalDateTime.of(now, LocalDateTime.now().toLocalTime());
		
		if(now2.isAfter(startDate) && now2.isBefore(endDate)) {
			event.goods.setPrice(800);
			System.out.println(event.goods.getName()+"의 가격: "+event.goods.getPrice());
		} else {
			System.out.println(event.goods.getName()+"의 가격: "+event.goods.getPrice());
		}
	
		
	}
}
