package p02.inherits;
/**
 *  객체의 다형성(polymorphism)
 * */
public class CarExample2 {
	public static void main(String[] args) {
		Car[] car = new Car[4];
		Car car1 = new Car();
		Bus bus = new Bus();
		Ambulance ambulance = new Ambulance();
		FireEngine fireEngine = new FireEngine();
		// 최상위 부모 객체를 상속받은 자식객체들은
		// 최상위 부모객체참조변수에 대입 가능하다
		
		car[0] = car1;
		car[1] = bus;
		car[2] = ambulance;
		car[3] = fireEngine;
		// move()라는 메소드는 이름은 동일하지만
		// 속한 객체에 따라 실행결과가 달라짐
		for(int i=0; i<car.length; i++) {
			car[i].move();
			System.out.println(car[i].a);
			if(car[i] instanceof Ambulance) { // instanceof = car타입인 객체가 Ambulance타입으로 변환이 가능한지 (car[i]가 루프를 돌다가 ambulance를 만나면 true가 리턴됨)
				Ambulance am = (Ambulance)car[i];
				am.special();
			}
		}
	}
}
