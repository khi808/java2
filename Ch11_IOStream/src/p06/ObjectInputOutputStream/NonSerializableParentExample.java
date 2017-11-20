package p06.ObjectInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {
	public static void main(String[] args) throws FileNotFoundException,ClassNotFoundException{
		FileOutputStream fos = new FileOutputStream("c:/temp/Object4.dat");
		FileInputStream fis = new FileInputStream("c:/temp/Object4.dat");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//파일에 저장할 객체 생성
			Child child = new Child();
			child.field1 = "홍길동"; //부모클래스에서 상속받은 필드
			child.field2 = "일지매"; //자식클래스에서 추가된 필드
			oos.writeObject(child);//파일에 객체 저장
			System.out.println("저장 성공");
			oos.flush(); oos.close(); fos.close(); //자원 해제
			System.out.println("------------------");
			ObjectInputStream ois = new ObjectInputStream(fis);
			//파일에서 읽어와서 저장할 객체 생성
			Child v = (Child)ois.readObject();
			System.out.println(v.field1);
			System.out.println(v.field2);
			ois.close(); fis.close();
			
			
		} catch (Exception e) {
			
		}
		
		
		
		
	}
}
