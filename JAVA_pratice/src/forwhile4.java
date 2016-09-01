
public class forwhile4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		i=1;
		do{
			if(i==4){
				i++;
				continue;
			}
			j=1;
			do{
				if(j==8){
					break;
				}
			System.out.println((i*j)+"");
			j++;
			
			}while(j<=9);
			i++;
			System.out.println();
			
		}while(i<=9);
		
		
	}

}
