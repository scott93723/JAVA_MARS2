
public class java108 {
	public static void main(String args[]){
		int i,j;
		i=1;
		
		while(i<=9){//條件式
			j=1;//初始值
			while(j<=9){

				j=1;//初始值
				while(j<=9){//條件式
					System.out.print(i+"*"+j+"="+i*j+"\t");			
					j++;
				};
				i++;
				System.out.println("");
			}
		
		}
		
	}

}
