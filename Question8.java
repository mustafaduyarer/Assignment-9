package Assignment_9;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	    String a = s.nextLine();

	    //your code here
	    if(a.contains("alejandro") || a.contains("Alejandro")){
	      System.out.println("read this mail");
	    }else {
	      System.out.println("dont read");
	    }


	}

}
