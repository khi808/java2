package p09.ploymorph;
/**
 * drive메소드의 매개변수로 인터페이스 (Vehicle)이 옴
 * */
public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
	   if(vehicle instanceof Bus)//casting가능여부 확인하는 메소드
		  ((Bus)vehicle).checkFare();//강제형변환 casting
	}
}
