package array;
// remove without using new array
public class remove_2_array {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,3,4,5};
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		for(int k=0;k<a.length-1;k++)
		{
			System.out.println(a[k]);
		}
	}

}
