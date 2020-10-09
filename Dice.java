import java.util.Scanner;
public class Dice
{
	public static void main(String[] args)
	{

		Scanner fromKey = new Scanner(System.in);
		System.out.print("Please enter dice type to be rolled (d4, d6, d8, d10, d12, d20) or 0 to quit :: ");
		String diceString = fromKey.next();
		String diceValue = diceString.replaceAll("[^0-9]" , ""); //Searches and removes any non-numeric values from the user entered data string using regex.
		int diceType = Integer.parseInt(diceValue);  // Converts the string numeric symbols into integers.

		while(diceType > 0) // while loop that repeats until the user enters 0.
		{
			switch(diceType) 
			{
				case 4:
					int d4 = (int)(Math.random()*4)+1; // math.random method takes a number and gives a random output from index 0 to number - 1.
					System.out.println("You rolled a " + d4);
					break;  // these breaks tell the switch to end and go back to the while loop logic
				case 6:
					int d6 = (int)(Math.random()*6)+1;
					System.out.println("You rolled a "+d6);
					break;
				case 8:
					int d8 = (int)(Math.random()*8)+1;
					System.out.println("You rolled a "+d8);
					break;
				case 10:
					int d10 = (int)(Math.random()*10)+1;
					System.out.println("You rolled a "+d10);
					break;
				case 12:
					int d12 = (int)(Math.random()*12)+1;
					System.out.println("You rolled a "+d12);
					break;
				case 20:
					int d20 = (int)(Math.random()*20)+1;
					System.out.println("You rolled a "+d20);
						if(d20 >18)
							System.out.println("Critical Hit!");
					break;
			}

			// taking over for the priming input so the program can keep running on additional user input.
			System.out.print("Please enter dice type to be rolled (d4, d6, d8, d10, d12, d20) or 0 to quit :: ");
			diceString = fromKey.next();
			diceValue = diceString.replaceAll("[^0-9]" , "");
			diceType = Integer.parseInt(diceValue);

		}

	System.out.println("End of Program");
	fromKey.close();

	}
}
