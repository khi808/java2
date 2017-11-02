package p01.classes;

public class Stock {
	private String goodsName = "";
	private int qty;
	
	Stock(){}
	Stock(String goodsName, int qty) {
		this.goodsName = goodsName;
		this.qty = qty;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public void inStock(int qty) {
		this.qty += qty;
	}
	
	public int outStock(int qty) {
		if(this.qty < qty) {
			System.out.println("물품의 수량이 부족합니다.");
			return 0;
		} else {
			this.qty -= qty;
			return this.qty;
		}
		// array 형식으로 만들고 arraycopy를 이용한 메소드로 만들어볼것
	}

	
	
}
