
public class array2 {

	public static void main(String[] args) {
		int i,j = 0,total,sum;
		int [][]grades={{54,68},{67,78},{89,93}};
//		int [][]grades= new int[3][2];
//		grades[0][0]=54;
//		grades[0][1]=68;
//		grades[1][0]=67;
//		grades[1][1]=78;
//		grades[2][0]=98;
//		grades[2][1]=35;
		
		total=0;
		for(i=0;i<grades.length;i++){
			
			sum=0;
			for (j=0;j<grades[i].length;j++){
				
				System.out.print(grades[i][j]+"");
				sum+=grades[i][j];
				total+=grades[i][j];
				
			}
			System.out.println("==>小計"+sum);		
			
		}
				
		System.out.println("成績總和"+total);
		
	
		
	}
}