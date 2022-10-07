package DINESHBASICASSIGNMENT1;

public class Fibonacciusingwithoutthirdvariable {
	public static void main(String args[]) {
		int a=-1;
		int b=1;
		for(int i=1;i<=7;i++)
		{
	
			System.out.println(a+b);
			b=a+b;
			a=b-a;
		}
	}

}