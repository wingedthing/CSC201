// NewMultiply.java - This program prints the numbers 0 through 10 along
// with these values multiplied by 2 and by 10.
// Input:  None.
// Output: Prints the numbers 0 through 10 along with their values multiplied by 2 and by 10. 


public class NewMultiply
{
   public static void main(String args[])
   {
      
      String head1 = "Number: ";
      String head2 = "Multiplied by 2: ";
      String head3 = "Multiplied by 10:  ";           
      int numberCounter;   // Numbers 0 through 10.
      int byTen;     // Stores the number multiplied by 10.
      int byTwo;          // Stores the number multiplied by 2.
      final int NUM_LOOPS = 10; // Constant used to control loop.

      // This is the work done in the housekeeping() method
      System.out.println("0 through 10 multiplied by 2 and by 10" + "\n");

      // This is the work done in the detailLoop() method
      // Write for loop
      for(numberCounter=0; numberCounter <= NUM_LOOPS; numberCounter++){        
          byTen = numberCounter * 10;
          byTwo = numberCounter * 2;
          System.out.println(head1 + numberCounter);
          System.out.println(head2 +byTwo);
          System.out.println(head3 +byTen);
      }
      // This is the work done in the endOfJob() method
                System.exit(0);
   } // End of main() method.

} // End of NewMultiply class.