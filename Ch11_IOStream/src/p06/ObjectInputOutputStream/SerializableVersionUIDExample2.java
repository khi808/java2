package p06.ObjectInputOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableVersionUIDExample2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis
			= new FileInputStream("c:/temp/Object3.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassC classC = (ClassC)ois.readObject();
		System.out.println("field1: "+classC.field1);
		ois.close();
		
		
		
	}
}
