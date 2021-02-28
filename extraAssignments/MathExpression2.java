/*John Sfara
  CSC.201.DL03
  MathExpression2.java
  This program takes as input a Fahrenheit temperature value from user, and then outputs the Celsius conversion. */
  
import java.text.DecimalFormat;
import java.util.Scanner;

public class MathExpressions2 {

	public static void main(String[] args) {	    
            Scanner fromKey = new Scanner(System.in);
	    DecimalFormat df = new DecimalFormat("###.##");
            char degree = 176; //ASCII value for the degree symbol.
        
            System.out.print("Enter a temperature in Celsius: ");
            double cTemp = Double.valueOf(fromKey.nextLine());
            double fTemp = ((9.0 / 5) * cTemp) + 32;
	
            System.out.println("Temperature in Celsius: " +df.format(cTemp) +degree +"C");
	    System.out.println("Temperature in Fahrenheit: " +df.format(fTemp) +degree +"F");
	    fromKey.close();
	}

}
