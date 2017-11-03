package p03.methods;

public class Car {
	// 필드
	private int gas;
	
	//생성자
	Car() {
		
	}
	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	int getGas() {
		return gas;
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		System.out.println("가스가 있습니다.");
		return true;
	}
	void run() { // 리턴문이 없는 void타입의 메소드
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량 :"+gas+")");
				gas-=1; // gas--;
			} else {
				System.out.println("멈춥니다.(gas잔량 :"+gas+")");
				return;// 여기서의 return문의 역할은 값을 리턴하는용도가 아니라 
				       // 메소드의 실행을 중지하는 역할.
			}
		}
	}
}
