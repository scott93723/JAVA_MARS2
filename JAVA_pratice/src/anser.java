import java.util.Scanner;

public class anser {
	static long start;
	static long end;
	static int right;
	static Scanner scanner= new Scanner (System.in);
	public static void main(String args[]){
		
		String items[][]=new String [5][3];
		items [0][0]="�W�Źq��";
		items [0][1]="supercomputer";
		items [0][2]="AI";
		items [1][0]="�p��";
		items [1][1]="kitchen";
		items [1][2]="kit";
		items [2][0]="�n�l";
		items [2][1]="dock";
		items [2][2]="zoo";
		items [3][0]="�ۦ樮";
		items [3][1]="bike";
		items [3][2]="ride";
		items [4][0]="���A��";
		items [4][1]="server";
		items [4][2]="connect";
	
		start =System.currentTimeMillis();
		System.out.println("�п�J����½Ķ�^��");
		System.out.println("��J�^���Х�enter");
		System.out.println("");
		for (int i=0;i<=5;i++){
			System.out.println("��"+(i+1)+"�D"+items[i][0]);
			if (items[i][1].equalsIgnoreCase(scanner.next())){
				System.out.println("����F");
				System.out.println("");
				right++;
			}else{
				System.out.println("�����F\n���T���׬�"+items[i][1]+"\n");
			}
		}
		
			end = System.currentTimeMillis();
			System.out.println("�A��F�h�֮ɶ�"+(end-start)/1000+items.length+right);
		
		
	}
	
}
