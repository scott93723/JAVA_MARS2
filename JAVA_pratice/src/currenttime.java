import java.util.Calendar;

public class currenttime {

	public static void main (String args[]){
		Calendar c=Calendar.getInstance();
		System.out.println("----");
		System.out.println(" 當地時間 ");
		System.out.println("------");
		for (int i=3;i>=0;i--){
			System.out.println(c.get(Calendar.YEAR));
			System.out.println(c.get(Calendar.MONTH)+1);
			System.out.println(c.get(Calendar.DATE));
			
			
		}
		
		
	}
}
