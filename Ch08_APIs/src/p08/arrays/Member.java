package p08.arrays;
/**
 * 객체의 비교는 동일한 타입끼리 여야 비교대상이 됨.
 * - 비교할수 있는 객체를 만들기 위해서는 Comparable 인퍼테이스를 구현해야함.
 * - Comparable을 구현할때 <>제너릭에 타입이 될 객체를 작성.
 * - name으로 객체를 비교
 *   <타입> : 이 객체에 대상을 해당 타입으로 한정함(형 제한자:generic)
 * */
public class Member implements Comparable<Member>{
	//필드
	String name;
	//생성자
	public Member(String name) {
		this.name = name;
	}
	//메소드
	@Override
	public int compareTo(Member o) {//매개변수로 대입되는 객체가 <>로
									   //한정되어 있어서 casting불 필요
		return name.compareTo(o.name);
		//String의 compareTo()메소드는
		//두 문자열의 길이중 작은 길이까지만 비교함
		//제일 앞의 값끼리 비교해서 크기가 크면 양수,작으면 음수,같으면 0을 리턴
		//한글의 값비교는 유니코드끼리 비교
		//ex) 홍 과 선의 비교 유니코드값 비교
	}
	
}
