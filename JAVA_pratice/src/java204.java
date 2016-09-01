import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class java204 {

	public static void main(String[] args) throws IOException {

		FileReader fr =new FileReader("D:/203.txt");
		BufferedReader br= new BufferedReader(fr);
		
		String str1;
		String str_temp="";
		while ((str1 = br.readLine()) != null){
			str_temp=str1+str_temp;
		}
		args= new String[]{"58","30","100","98","88","80"};
		int sum=0;
		int big60=0;//宣告及格
		int n=args.length;
		for(int i=0;i<args.length;i++){
			int x=Integer.parseInt(args[i]);
			if(x>=60){
				big60++;
			}
			sum=sum+x;
		}
		Arrays.sort(args);
		System.out.println("本班最高分"+args[n-1]);
		System.out.println("最低分"+args[0]);
		System.out.println("及格人數"+big60);
		System.out.printf("本班平均是:%.2f",(float)sum/n);
	}
}
