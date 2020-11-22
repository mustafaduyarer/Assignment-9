package Assignment_9;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    int halfindex = word.length()/2;
	    String halfWord = word.substring(0, halfindex);
	    
	    System.out.println(halfWord + halfWord);
	    

	}

}
