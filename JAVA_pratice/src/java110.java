import java.util.Scanner;

public class java110 {

		static long start;
		static long end;
		static Scanner scanner=new Scanner(System.in);
		static int right=0;
		
	
	public static void main(String args[]){
			String items[][]=new String[6][2];
			items [0][0]="�q��";
			items [0][1]="computrer";
			
			items [1][0]="��Ʈw";
			items [1][1]="database";
			
			items [2][0]="�y�k";
			items [2][1]="Sytax";
			
			items [3][0]="�Ǯ�";
			items [3][1]="school";
			
			items [4][0]="����";
			items [4][1]="vacation";

			items [5][0]="�W�H";
			items [5][1]="superman";
			
			start=System.currentTimeMillis();
			
			System.out.println("��½Ķ�^�嬰����");
			System.out.println("��J�^���Х�enter");
			System.out.println("");
			
		for(int i=0;i<6;i++){
			
			System.out.println("��"+(i+1)+"�D_:"+items[i][0]);
			if(items[i][1].equalsIgnoreCase(scanner.next())){
				System.out.println("����F\n");
				right++;
			}else{
				System.out.println("�����F!\n���T���׬�"+items[i][1]+"\n");
				
			}
			
		}
				end=System.currentTimeMillis();
				System.out.println("�A��O�ɶ���"+(end-start)/1000+"��,�b"+items.length+"�D���A����F"+right+"�D");
				
	}
}
