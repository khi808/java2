package p05.polymorph.params;
/**
 * 매개변수의 다형성
 * - 메소드의 매개변수로 최상위 객체가 선언되면
 *   최상위 객체를 상속받은 하위의 객체들은 모두
 *   매개변수로 올 수 있음.
 * */
public class Driver {
	public void drive(Vehicle vehicle) {// 최상위 객체가 메소드의 매개변수.
		vehicle.run();// 상속받은 하위의 객체에서 재정의되었으면,
					  // 실행되는 메소드는 최상위 Vehicle의 메소드가 아니고 재정의된 메소드가 실행된다.
	}
}
