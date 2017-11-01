package p02.enums;
/**
 * 열거형타입의 메소드 사용
 * */
public class EnumMethodExample {
	public static void main(String[] args) {
		//name()메소드
		Week today=Week.SUNDAY;//열거형 변수의 선언 및 초기회
		String name = today.name();
		System.out.println(name);
		
		//ordinal()메소드-열거형 상수의 index순번 리턴
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo()메소드
	   Week day1 = Week.MONDAY;
	   Week day2 = Week.WEDNESDAY;
	   
	   int result1 = day1.compareTo(day2);//자신과 비교대상과의 순서비교
	   int result2 = day2.compareTo(day1);//
	   //compareTo()의 결과값
	   //내림차순 정렬
	   //a.compareTo(b) ; a>b 이면 양의 값 리턴(a,b 내의 속성값으로 비교)
	   //                 a==b 이면 0을 리턴
	   //                 a<b 이면 음의 값 리턴
	   System.out.println(result1);
	   System.out.println(result2);
	   
	   //valueOf()메소드
	   if(args.length==1) {
		   String strDay = args[0];//main()메소드의 args로 받음
		   Week weekDay = Week.valueOf(strDay);
		   if(weekDay ==Week.SATURDAY||weekDay==Week.SUNDAY) {
			   System.out.println("주말입니다.");
		   }else {
			   System.out.println("평일입니다");
		   }
	   }
	   
	   //values()메소드
	   Week[] days = Week.values();
	   for(Week day:days) {
		   System.out.print(day+"\t");
	   }
	   
	   
		

	}

}
