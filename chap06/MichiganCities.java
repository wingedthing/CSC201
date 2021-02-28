// MichiganCities.java - This program prints a message for invalid cities in Michigan.  
// Input:  Interactive.
// Output:  Error message or nothing.


import java.util.Scanner;

public class MichiganCities
{
   public static void main(String args[]) throws Exception
   {
      // Declare variables.
      String inCity;               // name of city to look up in array.
      // Initialized array of cities in Michigan.
      String citiesInMichigan[] = {"Acme", "Albion", "Detroit", "Watervliet", "Coloma", "Saginaw", "Richland", "Glenn", "Midland", "Brooklyn"}; 
      boolean foundIt = false;  // Flag variable.
      int x = 0;           // Loop control variable.

      // Get user input.
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the name of the city: ");
     inCity = input.nextLine();
         
      // Write your loop here.
      for (x = 0; x < citiesInMichigan.length; x++){
          if (inCity.equals(citiesInMichigan[x])){
              foundIt = true;
              System.out.println("City found");
              break;
          }
      }
      if (!foundIt){
          System.out.println("Not a city in Michigan.");
      }   
      
         // Write your test statement here to see if there is 
         // a match.  Set the flag to true if city is found. 
         
      }
         
         
      // Test to see if city was not found to determine if 
      // "Not a city in Michigan" message should be printed. 
      
      //System.exit(0);

      

   } // End of main() method.
 // End of MichiganCities class.