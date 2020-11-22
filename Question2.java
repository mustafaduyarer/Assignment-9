package Assignment_9;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		double price=0;
		String storgetype, screenType, cpu;
		int ram=0;
		int memory=0;
		double screenSize=0.0;
		
		
      Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter screen size");
		screenSize=scan.nextDouble();
		if(screenSize==13.3) {
			price +=200;
		}else if(screenSize==15.0) {
			price +=300;
		}else if (screenSize==17.3) {
			price +=400;
		}
		
		System.out.println("Please enter CPU Type");
		cpu=scan.next();
		if(cpu.equals("i3")) {
			price +=150;
		}else if (cpu.equals("i5")) {
			price +=250;
			
		}else if (cpu.equals("i7")) {
			price +=350;
		}
		
				
		System.out.println("Please enter RAM size");
		ram = scan.nextInt();
		price += (ram*50) /4;
		
		
		
		System.out.println("Please enter storege type");
		storgetype= scan.next();
		
		System.out.println("Please enter memory size");
		memory = scan.nextInt();
		
		if(storgetype.equals("HDD")) {
			price+= (memory/500) * 50;
		}else if (storgetype.equals("SSD")) {
			price+= (memory/500) * 100;
		}
		
		
	
		
		System.out.println("Please enter screen resolution");
		screenType= scan.next();
		switch (screenType) {
		case "FULLHD":
			price += 100;
			break;
		case "4K":
			price += 200;
			break;
		}
		
		
		
		
		System.out.println("Your laptop Price is : $" + price);
		


		

	}

}
