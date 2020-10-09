/*John Sfara
  CSC.201.DL03
  CircleOperations.java
  This program calculates and prints the diameter, the circumference, or the area of a circle, given the radius, depending on the user's input. */
import java.util.Scanner;

public class CircleOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double diameter;
		double circumference;
		double area;
		double radius = 0; 
		String action;
		boolean success = false;
		
    /*This while loop uses a try and catch statement to detect if the user enters invalid string data,
		it also uses a nested while loop to ensure that radius values are greater than 0.*/
		
    while(!success) {
			try {
				System.out.print("Enter a radius >> ");
				radius = Double.valueOf(scanner.nextLine());
				while(radius <=0) { //If user enters a value less than or equal to zero, prompts the user for a new value.
					System.out.print("Enter a vaild radius - greater than 0 >> ");
					radius = Double.valueOf(scanner.nextLine());
				}

				success = true;
			}
			catch(NumberFormatException e){ //This catches the NumberFormatException that happens when you try to assign any non numeric value to a numeric variable.
				System.out.println("Invalid input");
			}
		}

		System.out.print("To calculate Diameter, Circumference, or Area, enter D, C, or A >> ");
		action = String.valueOf(scanner.nextLine());
		
    //This while loop tests if the user entered correct input of D, C, or A. 
		
    while(true) {
			if(action.equalsIgnoreCase("D")) {
				diameter = 2*radius; 
				System.out.println("The diameter of a circle with radius " +radius +" is " +String.format("%.2f",diameter) +".");
				break;
			}
			if(action.equalsIgnoreCase("C")) { 
				circumference = 2*Math.PI*radius;
				System.out.println("The circumference of a circle with radius " +radius +" is " +String.format("%.2f",circumference) + ".");
				break;
			}
			if(action.equalsIgnoreCase("A")) {
				area = Math.PI*Math.pow(radius, 2);
				System.out.println("The area of a circle with radius " +radius +" is " +String.format("%.2f",area) +".");
				break;
			}
			System.out.println("Invalid input");
			System.out.print("To calculate Diameter, Circumference, or Area, enter D, C, or A >> ");
			action = String.valueOf(scanner.nextLine());
		}

		scanner.close();
	}

}
