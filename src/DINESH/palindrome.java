package DINESH;

public class palindrome {
	public static void main( String arrg [] ) {
		int n=757;
		int sum=0;
		int tem=n;
		while(n>0) 
		{
			int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if (tem==sum)
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
