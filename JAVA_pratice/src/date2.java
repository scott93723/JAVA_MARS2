import java.text.DateFormat;
import java.util.Date;

public class date2 {
	public static void main(String args[]){
		
		System.out.print("----------");
		System.out.print(" ��a�ɶ�");
		System.out.print("----------");
		for (int i=3;i>=0;i--){
			System.out.println(DateFormat.getDateTimeInstance(i,i).format(new Date()));
			
		}
			}
			
			
			
}
