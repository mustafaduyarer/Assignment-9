package Assignment_9;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    String firstName, lastName , domain, topLevelDomain;
	    int underscoreIndex, atSignIndex, dotIndex;
	    
	    underscoreIndex = email.indexOf("_");
	    atSignIndex     = email.indexOf("@");
	    dotIndex        = email.indexOf(".");
	    
	    firstName= email.substring(0,underscoreIndex );
	    firstName= firstName.substring(0,1).toUpperCase() + firstName.substring(1);
	    
	    lastName = email.substring (underscoreIndex+1 , atSignIndex);
	    lastName= lastName.substring(0,1).toUpperCase() + lastName.substring(1);
	    
	    domain   = email.substring (atSignIndex+1 , dotIndex);
	    topLevelDomain = email.substring(dotIndex+1);
	    System.out.println("First name: " + firstName);
	    System.out.println("Last name: " + lastName);
	    System.out.println("Domain: " + domain);
	    System.out.println("Top-Level Domain: " + topLevelDomain);
	    

	}

}
