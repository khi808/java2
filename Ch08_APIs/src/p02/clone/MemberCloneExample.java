package p02.clone;
/**
 * 복제 clone() - 얕은 복제
 * 원본에 참조타입의 필드 존재하면
 * 얕은 복제 후 반드시 깊은 복제 작업으로
 * 필드로 선언된 객체를 따로 만들어서 복제해야
 * 원본의 필드값이 보존됨.
 * - 이 경우에는 Member객체에 clone()메소드를 재정의하여 따로
 *	 필드 객체를 따로 만들어 복제하지 않았음.
 * */
public class MemberCloneExample {
	public static void main(String[] args) {
		//원본객체 생성
		Member origin = new Member("홍길동",25,new int[] {90,90},new Car("소나타"));
		
		//복제
		Member cloned = origin.getMember();
		// 깊은복제
		cloned.scores[0] = 100;
		cloned.car.model ="그랜져";
		// 값 비교
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name:"+cloned.name);
		System.out.println("age:"+cloned.age);
		System.out.print("scores:");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print("|"+cloned.scores[i]+"|");
		}
		System.out.println();
		System.out.println("car:"+cloned.car.model);
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name:"+origin.name);
		System.out.println("age:"+origin.age);
		System.out.print("scores:");
		for(int i=0; i<origin.scores.length; i++) {
			System.out.print("|"+origin.scores[i]+"|");
		}
		System.out.println();
		System.out.println("car:"+origin.car.model);
	}
}
