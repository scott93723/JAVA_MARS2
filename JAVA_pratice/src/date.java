import java.text.DateFormat;

public class date {
	public static void main(String args[]){
		System.out.print("---");
		System.out.print(" 當地時間 ");
		System.out.print("----");
		for(int i=3;i>=0;i--){
			System.out.println(DateFormat.getDateTimeInstance(i,i).format(System.currentTimeMillis()));
		}
		
		
		
	}
}
