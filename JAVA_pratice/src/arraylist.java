import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) throws IOException {
//宣告五個arraylist陣列
		ArrayList A=new ArrayList();
		ArrayList B=new ArrayList();
		ArrayList C=new ArrayList();
		ArrayList D=new ArrayList();
		ArrayList E=new ArrayList();
		//宣告二維陣列
		String Data[][];
		String str=null;//宣告字串為空值
		FileReader fr= new FileReader("E:/外匯.csv");//讀取檔案於路徑
		BufferedReader br=new BufferedReader(fr);
		
		while((str=br.readLine())!=null){
			String tempArray[]=str.split("\\,"); //分隔逗號
			A.add(tempArray[0]);
			B.add(tempArray[1]);
			C.add(tempArray[2]);
			D.add(tempArray[3]);
			E.add(tempArray[4]);
		}
		//產生2維陣列 根據清單的size
			Data=new String[A.size()][5];
			for(int i=0;i<A.size();i++){
				Data[i][0]=(String)A.get(i);
				Data[i][1]=(String)B.get(i);
				Data[i][2]=(String)C.get(i);
				Data[i][3]=(String)D.get(i);
				Data[i][4]=(String)E.get(i);
			}
			//輸出陣列
//			for (int i = 0; i < Data.length; i++) {// 外層迴圈 Data[]第一層
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
