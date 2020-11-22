package Assignment_9;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);  // Reading from System.in
		 
        
		 
        System.out.println("Enter a String to reverse: ");



        String str = scan.nextLine();              



             String strRev = "";
             if(str.length()<5) {
            	 System.out.println("Too short!");
             }else if(str.length()>5) {
            	 System.out.println("Too long!");
             }else {
            	 
            	 for(int x = str.length() -1; x>=0; x--){

                     strRev = strRev + str.charAt(x);

               }
            	 System.out.print("The reversed string: " + strRev ); 
             }

           

	}
   
}
