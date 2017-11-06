package p05.polymorph.params;

public class DriverExample {
	public static void main(String[] args) {
		// 객체 생성
		Driver driver = new Driver();
		// Vehicle을 상속받은 자식 객체들
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // 매개변수로 Vehicle객체 대신에 Bus객체를 대입 promotion
		driver.drive(taxi); // 매개변수로 Vehicle객체 대신에 Taxi객체를 대입 promotion
	}
}
