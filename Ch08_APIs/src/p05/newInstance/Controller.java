package p05.newInstance;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;


public class Controller {
	static private Map<String,Action> map
		= new HashMap<String,Action>();
	public static void main(String[] args) {
		//command.properties의 정보를 저장할 객체 생성
		Properties props = new Properties();
		//File구분자 "/", "\\"
		File f = new File("src/p05/newInstance/command.properties");
		try {
			//File로 부터 정보를 입력받는 객체
			FileReader fis = new FileReader(f);
			props.load(fis); //입력받은 객체로 부터 property형식으로 값을 저장
			Set keySet = props.keySet();//키들만 set에 저장
			Iterator keyIter = keySet.iterator();
			while(keyIter.hasNext()) {
				String command = (String)keyIter.next();
				String className = props.getProperty(command);
				Class clazz;
				clazz = Class.forName(className);
				Action action = (Action)clazz.newInstance();
				//map에 저장 put(키,값)
			}
			System.out.print("명령어 입력");
			Scanner sc = new Scanner(System.in);
			String commandStr = sc.next();
			Action action = map.get(commandStr);
			action.execute();//재정의된 메소드 실행
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}