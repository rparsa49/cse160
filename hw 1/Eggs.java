import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter number of eggs
		System.out.print("The number of eggs in the order (integer): ");
		int eggs = input.nextInt();
		
		// create variables for dozen eggs and loose eggs
		double dozen = (eggs / 12);
		double loose = (eggs % 12);
		
		//create prices
		double dozprice = (dozen * 3.25);
		double loosprice = (loose * 0.45);
		double total = (dozprice + loosprice);
		//create output statement
		System.out.print("You ordered " + eggs + " eggs." + "That's " + dozen + " dozen at $3.25 per dozen and " + loose + " loose eggs at 45 cents for a total of $" + total);
		
		input.close();
	}

}
