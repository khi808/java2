package p10.chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread{
	//필드
	Socket socket;
	//생성자
	public ReceiverThread(Socket socket) {
		this.socket = socket;
	}
	//메소드
	@Override
	public void run() {
		try {
			BufferedReader reader 
				= new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				String str = reader.readLine(); //한줄씩 읽어들이기 '\r\n'
				if(str==null) break; //입력받은 값이 없으면 반복문 종료
				System.out.println("수신>"+str);//수신 메세지 출력
					
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	
}
