
public class java9x9dowhile2 {
	
	public static void main(String args[]){
		
		int i,j;
		
		i=1;
		do{
			j=1;
			do{
				System.out.print((i*j)+"");
				j++;
			}while(j<=9);
			i++;
			
			System.out.println();
			
		}while(i<=9);
		
	}
}
