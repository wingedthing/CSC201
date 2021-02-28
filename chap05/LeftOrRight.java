// LeftOrRight.java - This program calculates the total number of left-handed and right-handed
//                    students in a class.   
// Input:  L for left-handed; R for right handed; X to quit.
// Output: Prints the number of left-handed students and the number of right-handed students. 

import java.util.Scanner;

public class LeftOrRight
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String leftOrRight = ""; // L or R for one student.
		int rightTotal = 0;	 // Number of right-handed students.
		int leftTotal = 0; 	 // Number of left-handed students.
		
		// This is the work done in the housekeeping() method
		System.out.println("Enter L if you are left-handed, R if you are right-handed or X to quit.");
		leftOrRight  = s.nextLine();
        while(true){
            if(leftOrRight.equals("X")) {
                break;
            }
            if(leftOrRight.equals("R")) {
                rightTotal++;
            }else if(leftOrRight.equals("L")) {
                leftTotal++;
            }
            System.out.println("Enter L if you are left-handed, R if you are right-handed or X to quit.");
            leftOrRight  = s.nextLine();
        }

		// This is the work done in the detailLoop() method
		// Write your loop here.
		


		// This is the work done in the endOfJob() method	
		// Output number of left or right-handed students.	
		System.out.println("Number of left-handed students: " + leftTotal);
		System.out.println("Number of right-handed students: " + rightTotal);
		System.exit(0); 
	} // End of main() method.

} // End of LeftOrRight class. 