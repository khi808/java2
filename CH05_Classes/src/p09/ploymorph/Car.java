package p09.ploymorph;

public class Car {
	//필드
	Tire frontLeftTire = new HankookTire();
	Tire frontRighTire = new HankookTire();
	Tire rearLeftTire = new HankookTire();
	Tire rearRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRighTire.roll();
		rearLeftTire.roll();
		rearRightTire.roll();
	}
}
