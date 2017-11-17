package p01.inputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("c:/temp/test.txt");
			int readByte;//읽어서 배열(readBytes)에 저장한 개수를 받는 변수
			byte[] readBytes = new byte[3];//길이가 3인 byte배열			String data = "";
			String data ="";
			while(true) {
				readByte = is.read(readBytes);
				if(readByte==-1)break;
				data += new String(readBytes,0,readByte);
			}
			System.out.println(data);
		   is.close();//자원(스트림)해제
		}catch(Exception e) {
		  System.out.println(e.getMessage());
		}
	}

}
