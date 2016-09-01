import java.text.DateFormat;
import java.util.Date;

public class jva105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("---------------");
		System.out.print("      當地時間      ");
		System.out.print("---------------");
		Date date= new Date();
		DateFormat shortF=DateFormat.getDateTimeInstance(3,3);
		DateFormat mediumF=DateFormat.getDateTimeInstance(2,2);
		DateFormat longF= DateFormat.getDateTimeInstance(1,1);
		
		DateFormat fullF=
		DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		System.out.println(shortF.format(date));
		System.out.println(mediumF.format(date));
		System.out.println(longF.format(date));
		System.out.println(fullF.format(date));
		
		
		
	}

}
