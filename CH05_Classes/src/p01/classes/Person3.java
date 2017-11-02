package p01.classes;

public class Person3 {
	 Person3(){}
	 Person3(String name,int age){
		 this.name=name;
		 this.age=age;
	 }
    //속성
	private String name;
	private int age;
	private Calculator calculator; // 속성 추가
	// calc() 메소드
	public void calc() {
		calculator = new Calculator();
		calculator.setField1(10); // 메소드의 매개변수로 실제값을 넘겨줌
		calculator.setField2(5); // 메소드의 매개변수로 실제값을 넘겨줌
		calculator.setOp('+'); // 메소드의 매개변수로 실제값을 넘겨줌
		calculator.calc(); //참조변수.메소드()호출
	}
	 //기능
	 public void setName(String name) {
		 this.name=name;//this는 클래스 자신
	 }
	 public void setAge(int age) {
		 if(age<0) { 
			 System.out.println("오류");
			 return; //메소드에서 return; 문을 만나면 아래부분은 실행하지않고 다시 호출한쪽으로 이동
		 }
		 this.age=age;//this는 클래스 자신
	 }
	 
	 public String getName() {
		 return this.name;
	 }
	 public int getAge() {
		 return this.age;
	 }
}
