import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter integer
		System.out.print("Please enter an integer: ");
		int num = input.nextInt();
		
		//results
		System.out.println("Is " + num + " divisible by 5 and 6? " + ((num % 5 == 0) && (num % 6 == 0)));
		System.out.println("Is " + num + " divisible by 5 or 6? " + ((num % 5 == 0) || (num % 6 == 0 )));
		System.out.println("Is " + num + " divisible by 5 or 6, but not both? " + ((num % 5 == 0) ^ (num % 6 == 0)));
	input.close();
    }    
}