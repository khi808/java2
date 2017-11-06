package p05.polymorph.field;

public class Car {
		// field
		Tire[] tires = {
		new Tire("앞쪽 왼쪽 타이어", 6), // 운전석
		new Tire("앞쪽 오른쪽 타이어", 2), // 조수석
		new Tire("뒤쪽 왼쪽 타이어", 3), // 잘안탐
		new Tire("뒤쪽 오른쪽 타이어", 4) // 상석?!
		};
		// method
		int run() {
			System.out.println("자동차 달림.");
			for(int i=0; i<tires.length; i++) {
				if(tires[i].roll()==false) {
					stop(); return i+1;
				}
			}
			return 0;
		}
		
		private void stop() {
			System.out.println();
		}
		
		
}
