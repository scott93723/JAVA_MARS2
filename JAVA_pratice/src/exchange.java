import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class exchange {

		static Scanner scanner =new Scanner(System.in);
	public static void main(String[] args) throws IOException {
//�ŧi�ťհ}�C
		ArrayList A= new ArrayList();
		ArrayList B= new ArrayList();
		ArrayList C= new ArrayList();
		ArrayList D= new ArrayList();
		ArrayList E= new ArrayList();

		String str=null;
		//�ŧi�G���}�C
		String Data[][];
		//Ū���ɮ׵�����|
		
		FileReader fr= new FileReader("E:/�~��.csv");
		//Ū���ť���M��
		BufferedReader  bf=new BufferedReader(fr);
		
		while((str=bf.readLine())!=null){
			String tempArray[]=str.split("\\,");
			A.add(tempArray[0]);
			B.add(tempArray[1]);
			C.add(tempArray[2]);
			D.add(tempArray[3]);
			E.add(tempArray[4]);
			
		}
		//���ͤG�L�}�C �ھڲM�檺�j�p
		 Data = new String[A.size()][5];
		for(int i=0;i<A.size();i++){
			Data[i][0]=(String)A.get(i);
			Data[i][1]=(String)B.get(i);
			Data[i][2]=(String)C.get(i);
			Data[i][3]=(String)D.get(i);
			Data[i][4]=(String)E.get(i);
		}
		
		for(int i=0;i<Data.length;i++){
			for(int j=0;j<Data[0].length;j++)
				System.out.print(Data[i][j]+"\t");
			System.out.println("");
		}
		
	}

}
