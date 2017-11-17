package p02.readerWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
public class ReaderWriterExample {
	public static void main(String[] args) throws Exception{
		File f = new File("c:/temp/test1.txt");
		Writer writer = new FileWriter(f);//출력스트림 생성
		Reader reader = new FileReader(f);//입력스트림 생성
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();//값 입력
		writer.write(str);//파일에 기록
		writer.close();//스트림 해제
		int readCharNo;//읽은 문자 갯수 저장 변수
		char[] cbuf = new char[100];//적당한 크기의 char타입 배열 생성
		String message ="";
		while(true) {
			readCharNo = reader.read(cbuf);//읽은 데이터 저장후 길이 저장
			if(readCharNo==-1) break;//읽을 데이터가 없으면 종료
			message+=new String(cbuf,0,readCharNo);//문자열 객체 생성
		}
		System.out.println(message);//문자열 출력
		reader.close();//자원 해제
	}
}
