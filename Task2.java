package basics;

public class Task2 {

	static int Mins = 3456789;
	static int Years = Mins / 525600 ;
	static int Days = (Mins % 525600)/1440;
	
	public static void main(String[] args) {
				System.out.println(Mins+" Minutes is approximately " +Years+" years and "+Days+" days");
	}

}
 
