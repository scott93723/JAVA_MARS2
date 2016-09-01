import java.util.Arrays;
import java.util.Scanner;

public class foreach {
	public static void main(String args[]) {

		
		System.out.println("請輸入要產生之數字個數");

		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int n[] = new int[size];

		for (int i = 0; i < size; i++) {
			int a=(int)(Math.random()*999)+1;
		//	n[i] = (int) (Math.random() * 999) + 1;
			int j=0;
			while(j<i){
				if (n[j]==a){
					a=(int)(Math.random()*999)+i;
					j=0;
					}
				while(j<i){
					if(n[j]==a){
						a=(int)(Math.random()*999)+1;
						j=0;}else{
						j++;
						
						
					}
				n[i]=a;	
					
				}
				
			}
			
			
		}
		Arrays.sort(n);

//		for(int i=0;i<size;i++){
//			System.out.print(n[i]+"\t");
//		}
//		
		for (int i:n){
			System.out.print(i+"\t");
		}
		
	}

}
