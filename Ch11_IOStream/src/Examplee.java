import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Examplee {
	public static void main(String[] args) {
		Member member = new Member("홍길동","010-1123-4567",30);
		File f = new File("c:/temp/example1.dat");
		ObjectOutputStream oos;
		ObjectInputStream ois;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(member);
			System.out.println("저장 완료");
			oos.flush(); oos.close();
			
			//불러오기
			ois = new ObjectInputStream(new FileInputStream(f));
			Member member2 = (Member)ois.readObject();
			System.out.println(member2.getName() + member2.getTel());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}