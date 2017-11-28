package p02.circle;

public class Ball extends Circle{
	//필드
	private String color;
	//생성자
	public Ball(String color) {
		this.color = color;
	}
	//메소드
	//추가된 메소드
	public void findColor() {
		System.out.println(color+"공이다.");
	}
	//추가된 메소드
	public void findVolume() {
		System.out.println("부피는 4/3*(3.14*반지름*반지름)이다");
	}
	
	@Override
	public void findArea() {
		findRadius();
		super.findArea();
		System.out.println("넓이는 4*(3.14*반지름*반지름)이다");
	}
	
}
