package p05.cooperStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 버퍼보조스트림 - 속도향상
 * */
public class BufferedInputStreamExample {
	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		File f = new File("C:\\Users\\Administrator\\Downloads\\forest.jpg");
		FileInputStream fis1;
		FileInputStream fis2;
		try {
			fis1 = new FileInputStream(f);
			start = System.currentTimeMillis();//시작시간
			while(fis1.read()!= -1) {}
			end = System.currentTimeMillis();//종료시간
			System.out.println("BufferedStream 미사용시: "+(end-start)+"ms");
			fis1.close();//스트림 해제
			System.out.println("---------------------------");
			fis2 = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis2);	
			start = System.currentTimeMillis();//시작시간
			while(bis.read()!= -1) {}
			end = System.currentTimeMillis();//종료시간
			System.out.println("BufferedStream 사용시: "+(end-start)+"ms");
			fis1.close();//스트림 해제
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
