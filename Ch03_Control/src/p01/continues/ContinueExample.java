package p01.continues;
/**
 *  continue문
 *  
 * */
public class ContinueExample {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			System.out.println("\t i="+i);
			if(i>5) break;
			System.out.println("\t i="+i);
		}
		
		System.out.println("------------");
		for(int i=0; i<=10; i++) {
			System.out.println("\t i="+i);
			if(i>5) continue;
			System.out.println("\t i="+i);
		}
	}
}
