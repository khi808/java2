package p01.classes;
/**
 * - 은닉화(encapsulation)
 * 객체의 속성을 보호하기위해
 * - 속성을 private접근제어자로 처리하고,
 * - 속성을 접근하는 메소드를 만들어서.
 * - 외부에서 사용할때 속성의 접근은 반드시 메소드()를 통해서
 * - 접근할수 있도로록 하는 방식
 * - 
 * */
public class Person2Example {
	public static void main(String[] args) {
	   Person2 person2 = new Person2();
	   person2.setName("홍길동");
	   person2.setAge(20);
	   
	   System.out.println(person2.getName()
			             +"의 나이는 "+person2.getAge()+"입니다.");

	   person2.setName("임꺽정");
	   person2.setAge(-13);//처리하지않고 다음으로 진행
	   System.out.println(person2.getName()
	             +"의 나이는 "+person2.getAge()+"입니다.");	   
	}
}
