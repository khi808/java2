package p01.standard;

import java.util.HashMap;
/**
 * <타입,타입> : 형 제한자(generic)
 * */
public class StudentExample2 {
	public static void main(String[] args) {
		// 객체 생성 <키,값>
		// HashMap<객체, 객체> => get(객체) -> 객체 리턴
		// int 타입에 Integer타입의 값이 대입.(Auto-unboxing)
		HashMap<Student,Integer> std = new HashMap<>();
		std.put(new Student("홍길동",1), new Integer(85));// put(객체,객체)인데
		std.put(new Student("일지매",2), 90); // put(객체, int) int타입이 Integer타입으로 변환(Auto-boxing)
		std.put(new Student("임꺽정",3), 80);
		
		try {
			int score = std.get(new Student("홍길동",1)); // 85
			System.out.println("성적: "+score);
		}catch(NullPointerException e) {
			System.out.println("찾는 학생이 없어요.");
		}
	}
}
