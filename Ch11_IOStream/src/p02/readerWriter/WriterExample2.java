package p02.readerWriter;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample2 {
	public static void main(String[] args) throws Exception{
		Writer wrier = new FileWriter("c:/temp/test.txt");
		String data = "안녕 자바 프로그램";
		wrier.write(data,3,2);
		wrier.flush();//
		wrier.close();
	}
}
