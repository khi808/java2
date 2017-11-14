package test;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * 회원가입 
 *  id:5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다
 *  password:6~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.
 *  name:5자이하 한글
 * */
public class MemberExample {
	public static void main(String[] args) {
	  System.out.println("회원가입 하시겠습니까?");
	  Scanner scanner = new Scanner(System.in);
	  char yesNo = scanner.next().charAt(0);
	  if(yesNo=='Y'||yesNo=='y') {
		  while(true) {
			  boolean[] patCheck = new boolean[3];
			  String[] pattern = {"[a-z|0-9|_,-]{5,20}","[a-zA-z|0-9|~!@#$%^&*]{6,16}","[가-힣]{1,5}"};
			  System.out.print("id>");
			  String id = scanner.next();
			  if(!(Pattern.matches(pattern[0], id))) { // id Pattern체크
				  System.out.println("id:5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다");
				  continue;
			  }
			  System.out.print("password>");
			  String password = scanner.next();
			  if(!(Pattern.matches(pattern[1], password))) { // password 체크
				  System.out.println("password:6~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.");
				  continue;
			  }
			  System.out.print("name>");
			  String name = scanner.next();
			  if(!(Pattern.matches(pattern[2], name))) { // name 체크
				  System.out.println("name:5자이하 한글");
				  continue;
			  }
			  Member member = new Member(id,name,password);
			  System.out.println("가입완료");
			  System.out.println(member);
			  return;
		  }
	  }
	  else {
		  System.exit(0);
	  }
	}

}
