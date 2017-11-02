package p01.classes;

public class Stock1 {
	private String[] goodsName = new String[30];
	private int[] qty = new int[30];
	
	Stock1(){}
	Stock1(String[] target, int stindex, int length) {
		System.arraycopy(this.goodsName, stindex, target, destPos, length);
		this.qty = qty;
		System.arraycopy(src, srcPos, dest, destPos, length);
	}
	// arraycopy(원본, 시작index, 타겟, 타겟의시작index, 복사할 길이);
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
