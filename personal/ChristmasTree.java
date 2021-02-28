import java.util.Scanner;
public class ChristmasTree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of your tree >> ");
		int numStars = Integer.valueOf(scan.nextLine());
		christmasTree(numStars);
		scan.close();
	}

	public static void printStars(int number) {
		while (number > 0) {
			System.out.print("*");
			number--;
		}
		
		System.out.println("");
	}

	public static void printSpaces(int number) {
		while (number > 0) {
			System.out.print(" ");
			number--;
		}

	}

	public static void christmasTree(int height) {
		int space = height - 1;
		int star = 1;
		if (height == 1) {
			printSpaces(1);
			printStars(1);
		} else {
			while (space >= 0) {
				printSpaces(space);
				printStars(star);
				star += 2;
				space--;

			}
		}
		
		for (int i = 0; i < 2; i++) {
			printSpaces(height - 2);
			printStars(3);
		}

	}

}
