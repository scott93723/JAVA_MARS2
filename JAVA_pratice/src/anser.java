import java.util.Scanner;

public class anser {
	static long start;
	static long end;
	static int right;
	static Scanner scanner= new Scanner (System.in);
	public static void main(String args[]){
		
		String items[][]=new String [5][3];
		items [0][0]="超級電腦";
		items [0][1]="supercomputer";
		items [0][2]="AI";
		items [1][0]="廚房";
		items [1][1]="kitchen";
		items [1][2]="kit";
		items [2][0]="鴨子";
		items [2][1]="dock";
		items [2][2]="zoo";
		items [3][0]="自行車";
		items [3][1]="bike";
		items [3][2]="ride";
		items [4][0]="伺服器";
		items [4][1]="server";
		items [4][2]="connect";
	
		start =System.currentTimeMillis();
		System.out.println("請輸入中文翻譯英文");
		System.out.println("輸入英文後請打enter");
		System.out.println("");
		for (int i=0;i<=5;i++){
			System.out.println("第"+(i+1)+"題"+items[i][0]);
			if (items[i][1].equalsIgnoreCase(scanner.next())){
				System.out.println("答對了");
				System.out.println("");
				right++;
			}else{
				System.out.println("答錯了\n正確答案為"+items[i][1]+"\n");
			}
		}
		
			end = System.currentTimeMillis();
			System.out.println("你花了多少時間"+(end-start)/1000+items.length+right);
		
		
	}
	
}
