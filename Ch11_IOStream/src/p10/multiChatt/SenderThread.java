package p10.multiChatt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Multi 송신 thread객체
 * */
public class SenderThread extends Thread{
	//필드
	Socket socket;
	String name;//클라이언트 구분 이름
	//생성자
	public SenderThread(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}
	//메소드
	@Override
	public void run() {
		try {
			//입력으로 들어오는 스트림의 속도 향상
			BufferedReader reader 
				= new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream()); //출력 스트림
			writer.println(name); //홍길동>메세지
			writer.flush();//메세지 밀어내기
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
