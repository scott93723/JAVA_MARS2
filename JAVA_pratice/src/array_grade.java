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
		FileReader fr =new FileReader("D:/�ǥͦ��Z��.csv");
		BufferedReader br =new BufferedReader(fr);
		while ((str=br.readLine())!=null){// ���F��N�|Ū�� ����
			String tempArray[]=str.split(",");
			D.add(tempArray[3]);
		}
			items= new String[D.size()];
			for(int i=0;i<items.length;i++){
				items[i]=(String)D.get(i);
				
			}
		
		for (int i=0;i<items.length;i++){
			if(items[i].equals("�ʦ�")){
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
		System.out.println("�̰���"+items[n-1]);
		System.out.println("�̧C��"+items[0]);
		System.out.println("�ή�H��"+big60);
		System.out.print("�`����");
		System.out.printf("%.2f", (float) sum/n);
		
		
		
		
	}
}
