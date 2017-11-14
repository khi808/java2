package p11.calendar;
import java.util.TimeZone;
/**
 * TimeZone id얻기 - getAvailableIDs();
 * */
public class PrintTimeZoneID {
	public static void main(String[] args) {
	String[] availableIDs = TimeZone.getAvailableIDs();
	for(int i=0;i<availableIDs.length;i++)
		System.out.println(availableIDs[i]);
	}
}
