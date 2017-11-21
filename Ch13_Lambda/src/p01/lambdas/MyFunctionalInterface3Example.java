package p01.lambdas;

public class MyFunctionalInterface3Example {
	public static void main(String[] args) {
		MyFunctionalInterface3 fi3 = new MyFunctionalInterface3() {
			@Override
			public int method(int x, int y) {//두개의 매개변수
				int result = x + y;
				return result; //리턴문
			}
		};
		
		fi3 = (x,y) -> {//두개의 매개변수
			int result = x + y;
			return result; //리턴문
		};
		System.out.println(fi3.method(5, 2));
		fi3 = (x,y) -> {return x+y;};
		System.out.println(fi3.method(5, 2));
		fi3 = (x,y) -> x+y;
		System.out.println(fi3.method(5, 2));
		
		//메소드내에서 다른 메소드의 호출
		fi3 = new MyFunctionalInterface3() {
			
			@Override
			public int method(int x, int y) {
				int result = sum(x,y);
				return result;
			}
		};
		
		fi3 = (x,y) -> {
			int result = sum(x,y); 
			return result;
		};
		fi3 = (x,y) -> {return sum(x,y);}; //다른 메소드 호출한 결과 리턴
		fi3 = (x,y) -> sum(x,y); //다른메소드를 호출한 결과 리턴(생략) 람다식
		System.out.println(fi3.method(3, 5));
	}//main끝
	
	//두개의 값을 더하여 결과를 리턴하는 메소드
	public static int sum(int x, int y) {
		return (x+y);
	}
}
