
public class java106 {

	public static void main(String[] args) {

		int sum=0;//�[�`
		int j=0;//��ƭp��
		int k=0;//�D��ƭp��
		
		for (int i=0;i<args.length;i++){
			
			try{ 
				sum+=Integer.parseInt(args[i]);
				j++;
				
			}catch(NumberFormatException e){
				
				k++;
			}
			
		}
		System.out.println("�ƭ��`�M"+sum);
		System.out.println("�D�ƭ��`�M"+k);
		System.out.println("�ƭȭӼ�"+j);
		
	}

}
