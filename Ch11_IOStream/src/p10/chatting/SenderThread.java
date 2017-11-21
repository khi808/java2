package p10.chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 송신 thread객체
 * */
public class SenderThread extends Thread{
	//필드
	Socket socket;
	//생성자
	public SenderThread(Socket socket) {
		this.socket = socket;
	}
	//메소드
	@Override
	public void run() {
		try {
			BufferedReader reader 
				= new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream()); //출력 스트림
			while(true) {
				String str = reader.readLine(); //입력된 데이터를 한줄 단위로 읽음
				if(str.equals("bye")) break; //입력값이 bye 면 클라이언트 종료
				writer.println(str); //bye가 아니면 메세지 전송
				writer.flush(); //버퍼내의 데이터 밀어내기
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close(); //클라이언트 종료시는 반드시 소켓 해제
			} catch (Exception e) {}
		}
	}
	
	
}
