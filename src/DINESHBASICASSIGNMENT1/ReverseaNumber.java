package DINESHBASICASSIGNMENT1;

public class ReverseaNumber {
	public static void main(String args[]) {
		int n =7589;
		int rem=0;
		int r=0;
		while(n>0)
		{
		    rem=n%10;
			r=r*10+rem;
			n=n/10;
		}
		System.out.println(r);   
			
		}

	}


