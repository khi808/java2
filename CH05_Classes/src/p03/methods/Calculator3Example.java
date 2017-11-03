package p03.methods;

public class Calculator3Example {
	public static void main(String[] args) {
		Calculator3 myCal = new Calculator3();
		
		// 정사각형의 넓이
		double s1 = myCal.areaRectagle(10); // 동일한 메소드명(int)
		
		// 직사각형의 넓이
		double s2 =myCal.areaRectagle(10, 20); // 동일 메소드명(int,int)
		
		// 결과출력
		System.out.println("정사각형의 넓이 : "+s1);
		System.out.println("직사각형의 넓이 : "+s2);
		
		
		
	}
}
