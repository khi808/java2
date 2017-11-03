package p03.methods;

public class Product {
	// field
	static int count=0;
	int serialNo;
	{
		++count;
		serialNo = count;
	}
	// 생성자
	Product(){}
	// method
	void print() {
		System.out.println("count="+count);
	}
}
