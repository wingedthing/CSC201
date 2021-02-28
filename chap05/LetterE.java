// LetterE.java - This program prints the letter E with 3 asterisks
// across and 5 asterisks down. 
// Input:  None.
// Output: Prints the letter E. 

public class LetterE
{
   public static void main(String args[])
   {
      
               
      final int NUM_ACROSS = 3;  // Number of asterisks to print across.
      final int NUM_DOWN = 5;    // Number of asterisks to print down.
      int row; // Loop control for row number.
      int column; // Loop control for column number.

      for(row = 1; row <= NUM_DOWN; row++){
          for(column = 1; column <= NUM_ACROSS; column++){
            if(row == 2 || row == 4){
                System.out.print("*");
                break;
            }
            System.out.print("*");  
          }
          System.out.println();
          
         
        
          

         
          
      }  
                // This is the work done in the endOfJob() method
      System.exit(0); 
   } // End of main() method.

} // End of LetterE class.