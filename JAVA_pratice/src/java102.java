import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class java102 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat df=new SimpleDateFormat("yyyy-mm-dd");
		Date d1=df.parse("1984-10-14");
		Date d2=new Date();
		Calendar ca1 =Calendar.getInstance();
		Calendar ca2= Calendar.getInstance();
		ca1.setTime(d1);
		ca2.setTime(d2);
		
		int year=ca2.get(Calendar.YEAR)-ca1.get(Calendar.YEAR);
		int month= ca2.get(Calendar.MONTH)-ca1.get(Calendar.MONTH);
		int day=ca2.get(Calendar.DATE)-ca1.get(Calendar.DATE);
		
		if (day<0){//如果月份為負數 
			
			month--; //則月份-1
			day=day+30;
		}
		
		if(month<=0){
			year--;
			month=month+12;
		}
		
		System.out.print(year+"歲");
		System.out.print(month+"個月,又");
		System.out.print(day+"天");
		System.out.println(d2);
		
		
	}

}
