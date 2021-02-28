import java.util.Scanner;
import java.util.Arrays;
public class BattingAverage
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		// Declare a named constant for array size here.
        int ARRAY_SIZE = 8;
		
		// Declare array here.
		double[] battingArray = new double[ARRAY_SIZE];

		// Use this integer variable as your loop index.
		int loopIndex = 0; 

		// Use this variable to store the batting average input by user.
		double battingAverage;

		// String version of batting average input by user.
		String averageString; 

		// Use these variables to store the minimim and maximum batting averages.
		double min, max;
     

		// Use these variables to store the total and the average.
		double total, average; 

		// Write a loop to get batting averages from user and assign to array.
		for (loopIndex = 0; loopIndex < battingArray.length; loopIndex++){
		   System.out.println("Enter a batting average: ");
		   averageString  = s.nextLine();
		   battingAverage = Double.parseDouble(averageString);
           battingArray[loopIndex] = battingAverage;
        }
        min = battingArray[0];
		max = battingArray[0];   
		total = battingArray[0]; 
		// Write a loop here to access array values starting with averages[1]
        for (loopIndex = 1; loopIndex < battingArray.length; loopIndex++){
             total += battingArray[loopIndex];
             if (battingArray[loopIndex] < min){
                 min = battingArray[loopIndex];
             }
             if (battingArray[loopIndex] > max){
                 max = battingArray[loopIndex];
             }
                 
             
        }
		
		   // Within the loop test for minimum and maximum batting averages.
		   
		   // Also accumulate a total of all batting averages.
		   
		
		   
		// Calculate the average of the 8 averages.
		average = total/8;

		// Print the averages stored in the averages array. 
		System.out.println(Arrays.toString(battingArray));
		// Print the maximum batting average, minimum batting average, and average batting average.
        System.out.printf("Minimum batting average is %.3f", min);
        System.out.printf("Maximum batting average is %.3f", max);
        System.out.printf("Average batting average is %.4f",average); 
		
		System.exit(0);

	}
}
