import java.util.Scanner;

public class java110 {

		static long start;
		static long end;
		static Scanner scanner=new Scanner(System.in);
		static int right=0;
		
	
	public static void main(String args[]){
			String items[][]=new String[6][2];
			items [0][0]="電腦";
			items [0][1]="computrer";
			
			items [1][0]="資料庫";
			items [1][1]="database";
			
			items [2][0]="語法";
			items [2][1]="Sytax";
			
			items [3][0]="學校";
			items [3][1]="school";
			
			items [4][0]="假期";
			items [4][1]="vacation";

			items [5][0]="超人";
			items [5][1]="superman";
			
			start=System.currentTimeMillis();
			
			System.out.println("請翻譯英文為中文");
			System.out.println("輸入英文後請打enter");
			System.out.println("");
			
		for(int i=0;i<6;i++){
			
			System.out.println("第"+(i+1)+"題_:"+items[i][0]);
			if(items[i][1].equalsIgnoreCase(scanner.next())){
				System.out.println("答對了\n");
				right++;
			}else{
				System.out.println("答錯了!\n正確答案為"+items[i][1]+"\n");
				
			}
			
		}
				end=System.currentTimeMillis();
				System.out.println("你花費時間為"+(end-start)/1000+"秒,在"+items.length+"題中你答對了"+right+"題");
				
	}
}
