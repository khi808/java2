package p01.tryCatchFinally;

public class StockExample {
	public static void main(String[] args) {
		// 객체 생성
		Stock stock = new Stock("새우깡","농심", 50);
		System.out.println(stock.getGoodsName()+"의 현 재고는 "+stock.getQty());
		
		// 입고처리
		stock.inStock(20); // inStock() 메소드 호출 (실제값);
		System.out.println(stock.getGoodsName()+"의 현 재고는 "+stock.getQty());
		
		// 출고처리
		try {
			stock.outStock(90);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Stock[] stArr = new Stock[5];
		stArr[0] = new Stock();
	}
}
