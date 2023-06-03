
public class without_square_root {

	public static void main(String[] args) 
	{
		int z=9;
		int sr=z;
		int temp;
		do {
			temp=sr;
			sr=(temp+(z/temp))/2;
		}while(sr-temp!=0);
		System.out.println(sr);
	}

}
