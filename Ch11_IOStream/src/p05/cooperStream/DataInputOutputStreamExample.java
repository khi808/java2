package p05.cooperStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 기본 데이터 타입(byte,short,char,int,long,double,float,boolean,String?)등
 * 의 입출력시 사용하는 보조스트림
 * - DataInputStream, DataOutputStream
 * */
public class DataInputOutputStreamExample {
	public static void main(String[] args) {
		FileOutputStream fos;//byte단위의 출력 스트림
		DataOutputStream dos;//primitive타입의 데이터 출력 스트림
		FileInputStream fis;//byte단위의 입력 스트림
		DataInputStream dis;//primitive타입의 데이터 입력 스트림
		File f = new File("c:/temp/primitive.dat");
		
		try {
			fos = new FileOutputStream(f); //주 스트림 객체 생성
			dos = new DataOutputStream(fos); //보조 스트림 객체 생성
			fis = new FileInputStream(f); //주 스트림 객체 생성
			dis = new DataInputStream(fis); //보조 스트림 객체 생성
			//파일에 기록하기
			dos.writeUTF("홍길동");//String타입의 값 저장
			dos.writeDouble(95.5);//점수
			dos.writeInt(1);//순번
			
			dos.writeUTF("일지매");//String타입의 값 저장
			dos.writeDouble(90.3);//점수
			dos.writeInt(2);//순번
			//자원 해제
			dos.flush(); //밀어내기
			dos.close(); fos.close(); //스트림 해제
			
			//파일 읽어오기
			//*** 기록한 순서대로 읽어 들이기!!!
			for(int i=0;i<2;i++) {
				String name = dis.readUTF();//
				double score = dis.readDouble();
				int order = dis.readInt();
				System.out.println("이름: "+name+"|점수: "+score+"|번호: "+order);
			}
			//자원 해제
			dis.close(); fis.close(); //스트림 객체 해제
		
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
