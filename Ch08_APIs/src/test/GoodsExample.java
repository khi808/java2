package test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GoodsExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Goods goods = new Goods("새우깡",1000);
		GoodsEvent goodsEvent = new GoodsEvent();
		LocalDate now = LocalDate.now();
		goodsEvent.setStartDate(LocalDate.parse("2017-11-15"));
		goodsEvent.setEndDate(LocalDate.parse("2017-11-18"));
		goodsEvent.setGoods(goods);
		LocalDate startDate;
		startDate = goodsEvent.getStartDate();
		LocalDate endEvent = ChronoUnit.DAYS.between();
		
		//새우깡의 정상 가격은 1000원
		//새우깡의 가격 다운 행사 기간은 2017-11-15 ~ 2017-11-18
		//이 기간 동안의 행사 가격은 800원, 기간이 지나면 다시 1000원으로 환원
		//Event객체 생성 해서 날짜 비교해서 상품명과 가격 출력
		//시작날짜, 종료날짜 입력 및 parse()메소드 사용.
	}
}
