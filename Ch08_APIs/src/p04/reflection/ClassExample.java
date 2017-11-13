package p04.reflection;
/**
 * Class 클래스 - 클래스의 정보를 담는 클래스
 * - 실행 중인 클래스의 정보를 얻어오는 방법 - reflection
 * - getClass() 클래스의 정보를 얻어오는 메소드
 * - forName("클래스경로명"); -> 해당 경로에 만들어져있는 클래스를
 * 							-> 메모리에 로딩하는 기능
 * - newInstance() : forName으로 로딩된 클래스를 instance화 시키는 메소드
 * 					  == new Car();
 * */
public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass(); //getClass() 클래스의 정보 획득
		System.out.println(clazz1.getName()); //package명부터 경로끝까지 리턴
		System.out.println(clazz1.getSimpleName()); // 클래스명만 리턴
		System.out.println(clazz1.getPackage()); // package명만 리턴
		System.out.println("--------------------");
		String className = clazz1.getName();
		
		try {
			Class clazz2 = Class.forName(className);
			//Class clazz2 = Class.forName("p04.reflection.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage());
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
