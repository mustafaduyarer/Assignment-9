package Assignment_9;

import java.util.Scanner;

public class Question4 {

	  public static void main(String[] args) {
		  
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Input a string: ");
	    String word = scan.next();
	    //YOUR CODE HERE
	    int count= word.length();
	    
	    if(count%2==0 || count<5){
	      System.out.println("invalid");
	    }else {
	      int midPoint = count/2;
	      System.out.println(word.substring (midPoint-1, midPoint+2));
	      
	      
	    }
	    
	    
	  }
	}