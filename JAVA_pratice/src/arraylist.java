import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) throws IOException {
//�ŧi����arraylist�}�C
		ArrayList A=new ArrayList();
		ArrayList B=new ArrayList();
		ArrayList C=new ArrayList();
		ArrayList D=new ArrayList();
		ArrayList E=new ArrayList();
		//�ŧi�G���}�C
		String Data[][];
		String str=null;//�ŧi�r�ꬰ�ŭ�
		FileReader fr= new FileReader("E:/�~��.csv");//Ū���ɮש���|
		BufferedReader br=new BufferedReader(fr);
		
		while((str=br.readLine())!=null){
			String tempArray[]=str.split("\\,"); //���j�r��
			A.add(tempArray[0]);
			B.add(tempArray[1]);
			C.add(tempArray[2]);
			D.add(tempArray[3]);
			E.add(tempArray[4]);
		}
		//����2���}�C �ھڲM�檺size
			Data=new String[A.size()][5];
			for(int i=0;i<A.size();i++){
				Data[i][0]=(String)A.get(i);
				Data[i][1]=(String)B.get(i);
				Data[i][2]=(String)C.get(i);
				Data[i][3]=(String)D.get(i);
				Data[i][4]=(String)E.get(i);
			}
			//��X�}�C
//			for (int i = 0; i < Data.length; i++) {// �~�h�j�� Data[]�Ĥ@�h
//				for (int j = 0; j < Data[0].length; j++)
//					System.out.print(Data[i][j] + "\t");
//				System.out.println();

			for(int i=0;i<Data.length;i++){
				for(int j=0;j<Data[0].length;j++)
					System.out.print(Data[i][j]+"\t");
				System.out.println("");
			
			
			}
			
	}

}
