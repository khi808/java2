package p02.standardApi;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

/**
 * Consumer타입 인터페이스
 * void타입의 추상메소드를 하나 가진 인터페이스
 * */
public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer 
			= t -> System.out.println(t+8);
		consumer.accept("java");
		//두개의 객체를 받아서 처리
		BiConsumer<String, String> biConsumer
			= (t,u) -> System.out.println(t+u);
		biConsumer.accept("java", "8");	
		
		DoubleConsumer doubleConsumer
			= d -> System.out.println("java"+d);
		doubleConsumer.accept(8.0);
		
		//Object, 기본데이터 타입을 받는 메소드
		ObjIntConsumer<String> objInConsumer
			= (t,i) -> System.out.println(t+i);
		objInConsumer.accept("Java", 8);
		
		
		
			
	}
}
