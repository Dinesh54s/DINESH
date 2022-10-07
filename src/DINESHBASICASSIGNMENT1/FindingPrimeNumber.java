package DINESHBASICASSIGNMENT1;

public class FindingPrimeNumber {
	public static void main(String args[]) {
		int num=7;
		int b=0;
		for( int i=1;i<=num;i++)
		{
			if(num%i==0) {
				b++;
		
			}
		}
			if(b<=2)
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Not Prime" );
				
			}
			
		
		
	}
	

}
