package p09.ploymorph;

public class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName()+"가 달립니다.");
	}
}
