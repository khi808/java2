package p01.classes;

public class StockExample {
	public static void main(String[] args) {
		Stock stock = new Stock("box",5);
		System.out.println("상품명: " + stock.getGoodsName() + " 수량: " + stock.getQty());
		stock.inStock(30);
		System.out.println("상품명: " + stock.getGoodsName() + " 수량: " + stock.getQty());
		stock.outStock(40);
		
	}
}
