package Assignment_9;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int countOfCats = 0;
		    int countOfDogs = 0;
		    String word = scan.next();
		    
		    int wordcharCount = word.length();
		    int tCharCount = 3;
		    
		    for(int x=0; x<= wordcharCount-tCharCount; x++){
		   // System.out.println(word.substring(x, x + tCharCount));
		    
		    String currentWord= word.substring(x, x + tCharCount);
		    //System.out.println(currentWord);
		    
		    if(currentWord.equals("cat")){
		     countOfCats++;
		     //System.out.println("FOUND CAT");
		    }else if(currentWord.equals("dog")){
		    countOfDogs++;
		    //System.out.println("FOUND DOG");
		    }
		  }
		  
		  //System.out.println(countOfCats);
		 // System.out.println(countOfDogs);
		  System.out.println(countOfCats==countOfDogs);
		  

	}

}
