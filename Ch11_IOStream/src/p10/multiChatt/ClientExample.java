package p10.multiChatt;

import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket;
		try {
			socket = new Socket("localhost",5001);
			Thread th1 = new SenderThread(socket, "Ho");
			Thread th2 = new ReceiverThread(socket);
			th1.start();
			th2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
