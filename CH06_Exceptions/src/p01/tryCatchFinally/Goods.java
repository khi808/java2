package p01.tryCatchFinally;
/**
 * 상품명 goodsName
 * 상품가격 price
 * 
 * */
public class Goods {
	// 상수
	final int LIMIT = 200; // final 변수 = 값; 상수
	
	// 필드
	private String goodsName;
	private int price;

	// 생성자
	public Goods() {} // 생성자 오버로딩
	public Goods(String goodsName, int price) {
		this.goodsName = goodsName;
		this.price = price;
	}
	
	//getter and setter 메소드
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	// 사용자 정의 메소드
	void upPrice(int amount) throws Exception{
		if(amount > LIMIT)
			throw new LimitOutException();
		price += amount;
	}
	void downPrice(int amount) throws Exception{
		if(amount > LIMIT)
			throw new LimitOutException();
		price -= amount;
	}	
	
}
