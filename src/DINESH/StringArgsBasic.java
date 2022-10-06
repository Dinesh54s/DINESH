package DINESH;

public class StringArgsBasic {
	 int rollNo;
	 String name;
	 int mark;
	 public static void main(String args[]) {
		 {
			 StringArgsBasic s1=new StringArgsBasic();
			 s1.rollNo=101;
			 s1.name="siva";
			 s1.mark=50;
			 System.out.println(s1.rollNo);
			 System.out.println(s1.name);
			 System.out.println(s1.mark);
			 {
				 StringArgsBasic s2=new StringArgsBasic();
				 s2.rollNo=102;
				 s2.name="subu";
				 s2.mark=90;
				 System.out.println(s2.rollNo);
				 System.out.println(s2.name);
				 System.out.println(s2.mark);
			 }
		 }
	 }

}
