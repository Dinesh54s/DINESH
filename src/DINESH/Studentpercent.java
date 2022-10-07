package DINESH;

public class Studentpercent {
	String studentname;
	int rollno;
	int mark;
	char grade;

void setgrate()
{
	if(mark>=91) {
		grade='A';
}
	

    else if(mark>=81) { 
    	grade='b';
    }
    else if(mark>=71) {
    	grade='c';
    }
    else if(mark>=61) {
    	grade='d';
    }
    else if(mark<50)  {
    	grade='e';
    }
    
}
    public static void main(String args[]) {
    	Studentpercent a=new Studentpercent();
    	a .studentname="yuvan";
    	a.rollno=10;
    	a.mark=92;
    	a.setgrate();
    	
    	System.out.print(a.grade);
    	
    	
    }




	
	
}
