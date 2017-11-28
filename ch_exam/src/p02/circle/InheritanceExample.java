package p02.circle;

public class InheritanceExample {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("red");
		
		System.out.println("원:");
		c1.findArea();
		c1.findRadius();
		
		System.out.println("공:");
		c2.findArea();
		c2.findColor();
		c2.findVolume();
		c2.findRadius();
	}
}
