package p05.newInstance;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("p05.newInstance.SendAction");
			Action action = (Action)clazz.newInstance(); //new SendAction(); 
			action.execute();//execute() 재정의 됬으므로 재정의된 메소드가 실행
		} catch (InstantiationException | IllegalAccessException e) {
				System.out.println(e.getMessage());
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
