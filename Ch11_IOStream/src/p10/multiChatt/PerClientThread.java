package p10.multiChatt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 클라이언트 관리 객체
 * */
public class PerClientThread extends Thread{
	//클라이언트 저장 객체 생성(Thread-safe한 리스트 생성) 
	static List<PrintWriter> list 
		= Collections.synchronizedList(new ArrayList<PrintWriter>()); 
	/*static List<PrintWriter> list = new ArrayList<PrintWriter>();
	list = Collections.synchronizedList(list);*/
	Socket socket;
	PrintWriter writer;
	//생성자
	public PerClientThread(Socket socket) {
		this.socket = socket;
		try {
			//클라이언트로부터 받은 name의 값으로 writer객체 생성하여 list에 저장
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}//생성자 끝
	//메소드
	@Override
	public void run() {
		String name=null;
		try {
			//소켓으로 들어오는 byte단위의 데이터를 문자단위로 변환하여 버퍼에 저장
			BufferedReader reader 
				= new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
			name = reader.readLine();//
			sendAll("#"+name+"님이 입장하셨습니다.");//메세지를 모두에게 전달하는 메소드
			while(true) {
				String message = reader.readLine();
				if(message==null) break; //전달받은 입력밧이 없으면 반복문 빠져나감.
				sendAll(name+">"+message);
			}//while끝
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			list.remove(writer);//해당 객체를 list에서 제거
			sendAll("#"+name+"님이 나가셨습니다.");
			try {
				socket.close();
			} catch(Exception e) {}
		}//finally끝
	}//run끝
	private void sendAll(String message) {
		for(PrintWriter writer: list) {
			writer.println(message);
			writer.flush();//버퍼에 남아있는 메세지 밀어내기
		}
		
	}
	
	
	
}
