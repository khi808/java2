package p02.standardApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/**
 * Function 함수적 인터페이스
 * - 매개값과 리턴타입이 모두 있는 추상메소드
 * - 주로 매개값을 리턴값으로 매핑(타입변환)할 경우 사용
 * */
public class FunctionalExample {
	//리스트 생성
	private static List<Student> list
		= Arrays.asList(
				new Student("홍길동",90,96),
				new Student("일지매",95,93)
				);
	
	//printString메소드
	public static void printString(Function<Student, String> function) {
		for(Student std:list) {
			System.out.println(function.apply(std)+" ");//
		}
		System.out.println();
	}//메소드끝
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student std:list) {
			System.out.println(function.applyAsInt(std)+" ");//
		}
		System.out.println();
	}//메소드끝
	
	public static void printDouble(ToDoubleFunction<Student> function) {
		for(Student std:list) {
			System.out.println(function.applyAsDouble(std)+" ");//
		}
		System.out.println();
	}//메소드끝
	
	//평균을 구하는 메소드
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student std : list) {
			sum += function.applyAsInt(std);// int로 변환
		}
		double avg = (double)sum/list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		System.out.println("String");
		printString(t->t.getName());
		
		System.out.println("Integer");
		printInt(t->t.getEngScore());
		
		System.out.println("Integer");
		printInt(t->t.getMathScore());
		
		System.out.println("Double");
		printDouble(d -> {return d.getMathScore();});
		
		double engAvg = avg(s->s.getEngScore());
		System.out.println("영어 평균:"+engAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균:"+mathAvg);
		
		
		
		
		
		
		
	}
}
