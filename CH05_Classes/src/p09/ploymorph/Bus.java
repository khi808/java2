package p09.ploymorph;

public class Bus implements Vehicle {
	@Override
	public void run() {
	 System.out.println("Bus가 달립니다.");
	}
	//메소드 추가
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
