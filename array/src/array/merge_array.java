package array;

public class merge_array {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		int c[]= new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int j=0,i=a.length;j<b.length && i<c.length;j++,i++)
		{
			c[i]=b[j];
		}
		for(int k=0;k<c.length;k++)
		{
			System.out.print(c[k]+" ");
		}
		}
}
