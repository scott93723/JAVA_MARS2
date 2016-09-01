import java.util.Arrays;
import java.util.Scanner;

public class nextint {
	public static void main(String args[]){
		
		System.out.print("請輸入要產生的數字個數");
		Scanner sc=new Scanner(System.in);
				int size=sc.nextInt();
		int[] n=new int[size];
		for(int i=0;i<size;i++){
			int a=(int)(Math.random()*999)+1;
			
			int j=0;
			while(j<i){
				if(n[j]==a)
				{
					a=(int)(Math.random()*999)+1;
					j=0;
				}else{
					j++;
				}
				
				
			}
			n[i]=a;
			
		}
				Arrays.sort(n);
				for(int i:n){
					System.out.println(i+"\t");
				}
		
	}

}
