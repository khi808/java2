package p03.methods;
/**
 * 초기화 블럭 { }
 * - 인스턴스 필드의 초기화 {}
 * - 정적(static)필드의 초기화는 static {}
 * */
public class Tv {
	// static field
	static String company = "samsong";
	static String model = "UHD";
	static String info;
	static {
		info = company + model; // "samsongUHD";
	}
	
	
}
