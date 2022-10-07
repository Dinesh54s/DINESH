package DINESHBASICASSIGNMENT1;

public class Factorial54321 {
	int n,a=1;
	void fact()
	{
		for(int i=1;i<=n;i++)
		{
			a=a*i;
		}
		System.out.println(a);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial54321 f5=new Factorial54321();
		f5.n=5;
		Factorial54321 f4=new Factorial54321();
		f4.n=4;
		Factorial54321 f3=new Factorial54321();
		f3.n=3;
		Factorial54321 f2=new Factorial54321();
		f2.n=2;
		Factorial54321 f1=new Factorial54321();
		f1.n=1;
		f5.fact();
		f4.fact();
		f3.fact();
		f2.fact();
		f1.fact();

	}

}
