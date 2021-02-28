// JumpinJive.java - This program looks up and prints the names and prices of coffee orders.  
// Input:  Interactive.
// Output:  Name and price of coffee orders or error message if add-in is not found. 

import java.util.Scanner;

public class JumpinJive
{
   public static void main(String args[]) throws Exception
   {
      // Declare variables.
      String addIn;        // Add-in ordered by customer.
      final int NUM_ITEMS = 5; // Named constant
      // Initialized array of add-ins.
      String addIns[] = {"Cream", "Cinnamon", "Chocolate", "Amaretto", "Whiskey"}; 
      // Initialized array of add-in prices.
      double addInPrices[] = {.89, .25, .59, 1.50, 1.75};
      boolean foundIt = true; 
      int x = 0;           // Loop control variable.
      double orderTotal = 2.00; // All orders start with a 2.00 charge

      // Get user input.
      Scanner input = new Scanner(System.in);
      System.out.print("Enter coffee add-in or XXX to quit: ");
      addIn = input.nextLine();
      if (!addIn.equals("XXX")){
        for(x = 0; x < NUM_ITEMS; x++){
            if(addIn.equals(addIns[x])){
                System.out.println(addIns[x] + " " + addInPrices[x] + " " + (addInPrices[x]+2));
                foundIt = false;
                break;
            }
        }   
      }
      if (foundIt){
          System.out.println("Sorry, we do not carry that.");
      }
      // Write the rest of the program here.
    
      
   } // End of main() method.
} // End of JumpinJive class.