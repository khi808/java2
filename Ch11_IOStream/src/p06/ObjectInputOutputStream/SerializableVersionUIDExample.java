package p06.ObjectInputOutputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableVersionUIDExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos
			= new FileOutputStream("c:/temp/Object3.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassC classC = new ClassC(); //저장할 객체 생성
		classC.field1 = 1;
		oos.writeObject(classC);
		System.out.println("저장 완료");
		oos.flush(); oos.close(); fos.close();
	}
}
