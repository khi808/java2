package p05.newInstance;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
/**
 * property객체 = (키,값) String타입만 가능
 * map객체 = (키,값) 객체를 저장.
 * */

public class Controller {
	static private Map<String,Action> map
		= new HashMap<String,Action>();
	public static void main(String[] args) {
		//command.properties의 정보를 저장할 객체 생성
		Properties props = new Properties();
		//File구분자 "/", "\\"
		File f = new File("src/p05/newInstance/command.properties");
		try {
			//File(외부객체)로 부터 정보를 입력받기 위한 통로(FileReader)
			FileReader fis = new FileReader(f); //파일(외부객체)과 properties(내부객체)와의 통로 (빨대)
			//통토를 통해서 외부파일의 정보를 키와 값의 형태로 property객체에 저장
			//load(통로);
			props.load(fis); //입력받은 객체로 부터 property형식으로 값을 저장
			//property객체에는 키와 값으로 저장되어있고
			//키가 중복이 되어있을수 있기 때문에 
			//중복을 허용하지 않는 자료구조인 Set에 키들만 다시 저장함.
			//Set객체는 자료를 중복저장하지 않고, 순서가 없는 저장객체.
			Set keySet = props.keySet();//키들만 set에 저장
			//순서가 없는 객체를 저정한 Set에서
			//값을 처음부터 끝까지 순회하면서 출력하기위한
			//객체 - Iterator
			//Iterator는 객체의 처음,현재,다음 번지값만 저장.
			Iterator keyIter = keySet.iterator();
			while(keyIter.hasNext()) { // 다음 값이 있는지 확인 hasNext() 즉, 다음 키값이 있는지? 있으면 true 없으면 false
				String command = (String)keyIter.next(); // 다음 값을 리턴 next()
				String className = props.getProperty(command);
				Class clazz;
				clazz = Class.forName(className); //문자열로 주어진 클래스를 메모리에 로딩
				Action action = (Action)clazz.newInstance(); //new SendAction(); or new RecieveAction();
				//map에 저장 put(키,값)
				map.put(command, action);
			}
			//instance 저장 작업완료
			System.out.print("명령어 입력");
			Scanner sc = new Scanner(System.in);
			String commandStr = sc.next();
			Action action = map.get(commandStr);//자동형변환이 아님. 제너릭에<Action> 정의해놓았음.
			action.execute();//재정의된 메소드 실행
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
