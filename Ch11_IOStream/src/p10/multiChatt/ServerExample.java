package p10.multiChatt;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(5005);//port
			while(true) {
				Socket socket = serverSocket.accept();
				Thread thread = new PerClientThread(socket);
				thread.start();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				
			}catch(Exception e) {}
		}
		
		
	}
}
