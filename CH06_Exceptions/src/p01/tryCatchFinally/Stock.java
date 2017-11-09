package p01.tryCatchFinally;
/**
 * String 타입의 상품명 goodsName
 * Stirng 타입의 제조사명 company
 * int 타입의 수량 qty
 * */
public class Stock {
	// 필드
	private String goodsName;
	private String company;
	private int qty;
	
	// 생성자
	public Stock(){}
	
	public Stock(String goodsName, String company, int qty) {
		this.goodsName = goodsName;
		this.company = company;
		this.qty = qty;
	}
	
	// getter and setter 메소드
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	// 사용자 정의 메소드
	// 입고처리 메소드
	void inStock(int qty) { // 원하는 수량을 메소드에 넘겨주는 역할, 원하는수량 = int qty
		this.qty += qty;
	}
	// 출고처리 메소드
	// 메소드 앞에 타입(int,byte,long,boolean,객체)이
	// 있으면 실행부{} 안에 return문이 있어야함.
	int outStock(int qty) throws Exception { // 원하는 수량을 메소드에 넘겨주는 역할 - 매개변수
		if(this.qty < qty) { // 예외 처리
			throw new OutOfBalanceException("재고량이 모자랍니다. 현재고:",this.qty); 
		} else {
			this.qty -= qty;
		}
		return qty;
	}
	
	// OutOfBalanceException
	
}