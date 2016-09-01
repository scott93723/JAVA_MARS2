
public class j104 
{

	public static void main(String[] args)
	{
		int a[]= {0,1,2,3,4,5,6,7,8,9};
		boolean redo=true;
		do{
		for(int i=1;i<=9;i++){
			int j=(int)(Math.random()*9)+1;
			//繦诀睹计 琵9计ッ环ユ传
			int temp; //砞俱计temp
			temp=a[i]; 
			a[i]=a[j];
			a[j]=temp;
			}
		int x1=a[1]+a[2]+a[3];
		int x2=a[4]+a[5]+a[6];
		int x3=a[7]+a[8]+a[9];
		int y1=a[1]+a[4]+a[7];
		int y2=a[2]+a[5]+a[8];
		int y3=a[3]+a[6]+a[9];
		int z1=a[1]+a[5]+a[7];
		int z2=a[3]+a[5]+a[7];
		if((x1==15)&&(x2==15)&&(x3==15)&&(y1==15)&&(y2==15)&&(y3==15)&&(z1==15)&&(z2==15)){
			redo = false;
			}
	}while (redo);
		
		System.out.println("氮:");
		System.out.println(a[1]+a[2]+a[3]);
		System.out.println(a[4]+a[5]+a[6]);
		System.out.println(a[7]+a[8]+a[9]);
		
}
}