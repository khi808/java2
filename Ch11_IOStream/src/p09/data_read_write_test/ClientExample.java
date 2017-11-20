package p09.data_read_write_test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;
/**
 * 클라이언트에서 숫자1, 숫자2, op(+,-,*,/) 세개의 값을 받아서
 * 서버로 보냄 - 서버에서 연산결과를 클라이언트로 보내기
 * */
public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 값 입력:");
		System.out.print("첫번째 값: ");
		int num1 = sc.nextInt();
		System.out.print("연산자: ");
		char op = sc.next().charAt(0);
		System.out.print("두번째 값: ");
		int num2 = sc.nextInt();
		try {
			socket = new Socket();//클라이언트는 하나의 소켓만 생성
			System.out.println("[연결요청]");
			//서버주소와 port번호로 연결요청
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
			
			byte[] bytes = null;
			String message = null;
			OutputStream os = socket.getOutputStream();//출력객체 생성
			bytes[0] = (byte)num1;
			bytes[1] = (byte)op;
			bytes[2] = (byte)num2;
			//message = "Hello Server";
			//bytes = message.getBytes();//String.getBytes()->문자열을 byte배열로 변환
			os.write(bytes);//전송
			os.flush();//메세지 밀어내기
			System.out.println("[데이터 보내기 성공]");
			
			InputStream is = socket.getInputStream();//socket으로 들어오는 스트림 얻기
			bytes = new byte[100];//byte단위의 값을 읽어들여 저장하는 배열
			int readByteCnt = is.read(bytes);//읽어들이만큼 배열에 저장후 저장된 갯수 readByteCnt에 대입
			message = new String(bytes,0,readByteCnt);//
			System.out.println("[데이타 받기 성공]:"+message);
			
		}catch(Exception e) {}
		//종료시 연결이 끊어지지 않으면 강제로 연결 해제
		if(!socket.isClosed()) {
			try {
				socket.close();
			}catch(IOException e) {
			}
		}
	}
}