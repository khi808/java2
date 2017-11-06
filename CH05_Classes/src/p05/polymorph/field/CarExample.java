package p05.polymorph.field;

public class CarExample {
	public static void main(String[] args) {
		// Car 객체 생성
		Car car = new Car();
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();//
			if((problemLocation-1)%2 ==0) {
				System.out.println(car.tires[problemLocation-1].location+" HankookTire 교체");
				car.tires[problemLocation-1] = new HankookTire("앞 왼쪽", 15);
			}
			/* switch (problemLocation) {
			case 1: 
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.tires[0] = new HankookTire("앞 왼쪽", 15);
				break;
			case 2: 
				System.out.println("앞 오른 GumhoTire로 교체");
				car.tires[1] = new GumhoTire("앞 오른",13);
				break;
			case 3: 
				System.out.println("뒤 왼쪽 GumhoTire로 교체");
				car.tires[2] = new GumhoTire("뒤 왼쪽",13);
				break;
			case 4: 
				System.out.println("뒤 오른 HankookTire로 교체");
				car.tires[3] = new HankookTire("뒤 오른", 15);
				break;
			}
			System.out.println("-----------------------------------------");
			*/
		}
	}
}
