package p01.annotations;

import java.lang.reflect.Method;

/**
 * annotation 적용
 * */
public class PrintAnnotationExample {
	public static void main(String[] args) {
		//Service클래스로부터 메소드 정보 얻기
		Method[] declareMethod = Service.class.getDeclaredMethods();
		//
		for(Method method:declareMethod) {
			//Annotatic 적용여부확인
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation 정보 얻기
				PrintAnnotation printAnnotation
					= method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력
				System.out.println("["+method.getName()+"]");
				//구분선 출력
				for(int i=0;i<printAnnotation.number();i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					//메소드 호출
					method.invoke(new Service());
				} catch (Exception e) {
					System.out.println();
				}
			}
		}
		
		
	}
}
