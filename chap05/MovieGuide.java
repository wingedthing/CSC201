// MovieGuide.java - This program allows each theater patron to enter a value from 0 to 4 
// indicating the number of stars that the patron awards to the Guide's featured movie of the 
// week. The program executes continuously until the theater manager enters a negative number to 
// quit. At the end of the program, the average star rating for the movie is displayed.  

import java.util.Scanner;

public class MovieGuide {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// Declare and initialize variables.
		double numStars; // star rating.
		String numStarsString; // string version of star rating
		double averageStars = 0; // average star rating.
		double totalStars = 0; // total of star ratings.
		int numPatrons = 0; // keep track of number of patrons

		// This is the work done in the housekeeping() method
		// Get input.
		System.out.print("Enter stars: ");

		// This is the work done in the detailLoop() method
		// Convert to double.
		numStars = Double.valueOf(s.nextLine());

		// Write while loop here
		while (numStars >= 0) {
			totalStars += numStars;
			numPatrons++;
			averageStars = totalStars / numPatrons;
			System.out.print("Enter stars: ");
			numStars = Double.valueOf(s.nextLine());

			// This is the work done in the endOfJob() method
			// Calculate average star rating
		}
		System.out.println("Average Star Value: " + averageStars);

		s.close();
		System.exit(0);
	} // End of main() method.

} // End of MovieGuide class.