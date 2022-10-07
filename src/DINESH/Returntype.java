package DINESH;

public class Returntype {
	int max(int a, int b, int c) {
		if (a > b && a > c) {
			return a;

		} else if (b > c) {
			return b;
		}
		return c;
	}
				
		
	

	public static void main(String args[]) {
		Returntype a = new Returntype();
		int m = a.max(15, 100, 5);
		System.out.print(m);
	}
}
