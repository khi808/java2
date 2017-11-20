package p07.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * InetAdress클래스
 * - IP주소 정보를 가지는 객체(자신:local, 상대:remote의 주소정보)
 * 
 * */
public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();//자신의 주소정보를 얻는 메소드 getLocalHost()
			System.out.println("내 컴퓨터 ip주소: "+ local.getHostAddress());//getHostAddress() -> ip주소
			
			InetAddress[] iaArr 
				= InetAddress.getAllByName("www.naver.com");
			//Domain주소로 ip주소정보를 얻는 메소드: getAllByName();
			for(int i=0;i<iaArr.length; i++) {
				System.out.println("www.naver.com IP주소: "+iaArr[i].getHostAddress());
			}
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
