package p05.bounded;
/**
 * 일부 타입만 사용가능하게 타입을 제한하는 경우
 * 상속의 관계인 경우 사용
 * */
public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}
