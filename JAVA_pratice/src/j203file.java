import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class j203file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr= new FileReader("D:/203.txt");
		BufferedReader  br=new BufferedReader(fr);
		String str1;
		String str_temp="";
		while ((str1=br.readLine())!=null){
			str_temp=str_temp+str1;
		}
		
		String str[]=str_temp.split("¡A");
		System.out.println("Á`¦@¦³"+str.length);
		
		for(int i=0;i<str.length;i++){
			System.out.println(i+1+"."+str[i]);
		}
		
	}

}
