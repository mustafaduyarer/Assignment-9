package Assignment_9;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    if(word.substring(0,1).equalsIgnoreCase("X")){
	      word=word.substring(1);
	    }
	    int lastCharIndex= word.length()-1;
	    String lastCharStr = word.substring(lastCharIndex);
	    
	    if(lastCharStr.equalsIgnoreCase("X")){
	      word=word.substring(0,lastCharIndex);
	    }
	    
	    System.out.println(word);

	}

}
