package p01.tryCatchFinally;

public class GoodsExample {
	public static void main(String[] args) {
		try {
		// 객체 생성
		Goods goods = new Goods("새우깡", 1000); // 객체 선언 및 생성자 호출
		System.out.println(goods.getGoodsName()+"의 현재가격은 "+goods.getPrice());
		
		goods.upPrice(200);
		System.out.println(goods.getGoodsName()+"의 현재가격은 "+goods.getPrice());
		goods.upPrice(300);
		System.out.println(goods.getGoodsName()+"의 현재가격은 "+goods.getPrice());
		} catch(Exception e) { //매개변수의 다형성 | 최상위 객체인 exception에 자식객체인 LimitOutException을 대입.
			System.out.println(e.getMessage()); // e = LimitOutException 객체이지만 Exception객체의 기능만 사용가능.
			// (오버라이드 된건 자식객체의 메소드 사용됨)
		}
		
		
	}
}
