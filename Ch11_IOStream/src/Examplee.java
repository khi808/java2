import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Examplee {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("c:/temp/test1.txt");
			int strNum;
			byte[] isValue = new byte[100];
			
			while(true) {
				strNum = is.read(isValue, 0, 5);
				if(strNum==-1) break;
				System.out.println(isValue);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
