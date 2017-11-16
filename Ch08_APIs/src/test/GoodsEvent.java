package test;

import java.time.LocalDateTime;

public class GoodsEvent {
	//필드
	Goods goods;
	LocalDateTime startDate;
	LocalDateTime endDate;
	//생성자
	public GoodsEvent(Goods goods, LocalDateTime startDate, LocalDateTime endDate) {
		this.goods = goods;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public GoodsEvent() {}
	//메소드
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public LocalDateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	
}
