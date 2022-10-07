package DINESHBASICASSIGNMENT1;

public class printingOnlyMultiplesOf3Or5 {
	public static void main(String args[]) {
		int n=30;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 )
			{
				System.out.println(i);
			
	         }

	     }
		  System.out.println();
		for(int j=1;j<=n;j++)
	{
		if(j%5==0)
		{
			System.out.println(j);
			}
		}
	}
 }
