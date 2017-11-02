package p02.inherits;

public class CarExample {
	public static void main(String[] args) {
		Bus bus = new Bus();
		System.out.println("탑승인원= "+bus.a);
		bus.move();
		
		Ambulance ambul = new Ambulance();
		ambul.move();
		ambul.special();
		
		FireEngine fe = new FireEngine();
		fe.move();
	}
}
