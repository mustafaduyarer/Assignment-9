package Assignment_9;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
		
		System.out.println("Split:");
		
		String splitOrNot= scan.next();
		
		
		String quality;
		int numOfPeople;
		double totalToPay =0, totalTip=0, totalPerPerson=0, tipPerPerson=0;
		
		if(splitOrNot.equalsIgnoreCase("Yes")){
		
		System.out.println("Number of people:");
	  numOfPeople=scan.nextInt();
		
		System.out.println("Check amount:");
		totalToPay=scan.nextDouble();
		
		System.out.println("Service Quality:");
		 quality=scan.next();
		
		
		
		switch(quality.toLowerCase()){
		   case"poor":
		    totalTip=totalToPay*0.05;
		    break;
		  case"fair":
		    totalTip=totalToPay*0.1;
		    break;
		  case"good":
		    totalTip=totalToPay*0.15;
		    break;
		    case"great":
		    totalTip=totalToPay*0.2;
		    break;
		    case"excellent":
		    totalTip=totalToPay * 0.25;
		    break;
		}
		totalToPay=totalToPay+totalTip;
		totalPerPerson = totalToPay / numOfPeople;
		tipPerPerson = totalTip / numOfPeople;
		
		String numPplAmpersand ="";
		for(int x=1 ; x<= numOfPeople; x++){
		  numPplAmpersand+= "&";
		}
		System.out.println("Number of people entered: " + numPplAmpersand);
		System.out.println("Total to pay: "+ totalToPay);
		System.out.println("Total tip: " + totalTip);
		System.out.println("Total per person: " + totalPerPerson);
		System.out.println("Tip per person: " + tipPerPerson);
		
  }

	}

}
