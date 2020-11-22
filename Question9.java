package Assignment_9;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    if( !email.contains("_") ){
	      System.out.println(email);
	    }else{
	      
	      String firstName , lastName;
	      int underscoreIndex , atSignIndex;
	      underscoreIndex = email.indexOf("_");
	      atSignIndex = email.indexOf("@");
	      firstName = email.substring(0, underscoreIndex);
	      lastName = email.substring(underscoreIndex+1 ,atSignIndex);
	      System.out.println(lastName + "_" + firstName + "@" + "gmail.com");
	      
	    }
	    
	}

}
