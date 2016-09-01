import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class array_grade {
	
	public static void main(String args[]) throws IOException{
		
		ArrayList D= new ArrayList();
		int sum=0;
		int big60=0;
		
		String []items;
		String str="";
		FileReader fr =new FileReader("D:/學生成績表.csv");
		BufferedReader br =new BufferedReader(fr);
		while ((str=br.readLine())!=null){// 有東西就會讀取 條件式
			String tempArray[]=str.split(",");
			D.add(tempArray[3]);
		}
			items= new String[D.size()];
			for(int i=0;i<items.length;i++){
				items[i]=(String)D.get(i);
				
			}
		
		for (int i=0;i<items.length;i++){
			if(items[i].equals("缺考")){
				items[i]="0";
			}
			
			int x=Integer.valueOf(items[i]);
			
			if(x>=60){
				big60++;
			}
				sum=sum+x;
		}
		
		int n=items.length;
		Arrays.sort(items);
		System.out.println("最高分"+items[n-1]);
		System.out.println("最低分"+items[0]);
		System.out.println("及格人數"+big60);
		System.out.print("總平均");
		System.out.printf("%.2f", (float) sum/n);
		
		
		
		
	}
}
