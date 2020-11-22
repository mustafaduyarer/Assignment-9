package Assignment_9;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String message = scan.nextLine();
	    //Sender: Mike Smith
	    //Phone Number: 202-123-3456
	    //Message body: I love programing and problem solving
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    int o1,c1,o2,c2,o3,c3;
	    o1= message.indexOf("<");
	    o2= message.indexOf("[");
	    o3= message.indexOf("{");
	    c1= message.indexOf(">");
	    c2= message.indexOf("]");
	    c3= message.indexOf("}");
	    
	    sender= message.substring(o1+1 , c1);
	    phoneNumber= message.substring(o2+1 ,c2);
	    messageBody= message.substring(o3+1, c3);
	    
	    System.out.println("Sender: "+ sender);
	    System.out.println("Phone Number: "+ phoneNumber);
	    System.out.println("Message body: "+ messageBody);
	    
	    

	}

}
