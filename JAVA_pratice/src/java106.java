
public class java106 {

	public static void main(String[] args) {

		int sum=0;//羆
		int j=0;//俱计璸计
		int k=0;//獶俱计璸计
		
		for (int i=0;i<args.length;i++){
			
			try{ 
				sum+=Integer.parseInt(args[i]);
				j++;
				
			}catch(NumberFormatException e){
				
				k++;
			}
			
		}
		System.out.println("计羆㎝"+sum);
		System.out.println("獶计羆㎝"+k);
		System.out.println("计计"+j);
		
	}

}
