package p09.ploymorph;

public class Car2 {
	//필드
	Tire[] tires = {new HankookTire(),
	               new HankookTire(),
	               new HankookTire(),
	               new HankookTire()
	};
	
	void run() {
	 for(int i=0;i<tires.length;i++)
		  tires[i].roll();
	}
}
