package p08.seversocket;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null; //소켓 선언
		try {
			socket = new Socket();//클라이언트는 하나의 소켓만 생성
			System.out.println("[연결 요청]");
			//서버주소와 port번호로 연결요청
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
		} catch (Exception e) {}
		//종료시 연결이 끊어지지 않으면 강제로 연결 해제
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (Exception e) {}
		}
		
	}
}
