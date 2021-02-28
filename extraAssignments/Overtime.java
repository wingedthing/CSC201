import java.util.Scanner;
public class Overtime {
	static Scanner fromKey = new Scanner(System.in);
	public static void main(String[] args) {
		final double RATE = 35.00;
		final int WORK_WEEK = 40;
		final double OVERTIME = 1.5;
		final String QUIT = "ZZZ";	
		String name = housekeeping(OVERTIME, WORK_WEEK, QUIT);		
		
		if(!name.equals("ZZZ")) {
			detailLoop(WORK_WEEK,RATE,OVERTIME,name,QUIT);				
		}
		
		finish();
	}
	
	public static String housekeeping(Double OVERTIME, int WORK_WEEK, String QUIT) {
		System.out.println("This program computes payroll based on overtime rate of " +OVERTIME +" after " +WORK_WEEK +" hours.");
		System.out.print("Enter employee name or " +QUIT +" to quit >>");		
		String name = fromKey.nextLine();							
		return name;
	}
	
	public static void detailLoop(int WORK_WEEK, double RATE, double OVERTIME, String name, String QUIT) {		
		while(!name.equals("ZZZ")) {
			System.out.print("Enter hours worked >> ");
			double hours = Double.valueOf(fromKey.nextLine());
			double pay;	
			if(hours > WORK_WEEK) {
				pay = (WORK_WEEK * RATE) + (hours - WORK_WEEK) * RATE * OVERTIME;
			}else
				pay = hours * RATE;
		
			System.out.println("Pay for " +name +" is $" +String.format("%.2f",pay));
			System.out.print("Enter employee name or " +QUIT +" to quit >>");
			name = fromKey.nextLine();
		}
			
	}
	
	public static void finish() {
		System.out.println("Overtime pay calulations complete");	
	}
	

}
