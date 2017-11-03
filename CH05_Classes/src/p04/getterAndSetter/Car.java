package p04.getterAndSetter;
/**
 * getters and setters 메소드
 * */
public class Car {
	// 필드
	private int speed;
	private boolean stop;
	
	// shift + alt + s + r 단축키
	public int getSpeed() {
		return speed;
	}
	protected void setSpeed(int speed) {
		if(speed<0) {
			this.speed=0;
			return;
		} else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
}
