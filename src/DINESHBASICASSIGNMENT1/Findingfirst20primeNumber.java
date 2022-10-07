package DINESHBASICASSIGNMENT1;

public class Findingfirst20primeNumber {
	public static void main(String args[]) {
		int a=20;
		for(int i=1;i<=a;i++) 
		{
			int c=0;
			for(int j=2;j>=i;j++)
			{ 
				if(i%j==0) {
					c++;
				}					
			}
					if (c==0) {
					
					System.out.println(i);
				
					}
				}		
			
		
		
	}

}
