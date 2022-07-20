import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		int number = input.nextInt();
		
		for (int i = 0; i <= number; i++) {
			for(int num = 1; num < number - i; num++) {
				System.out.print("  ");
			}
			for (int num = 0; num < i; num++) {
				System.out.printf("%4d", (int) Math.pow(2, num));
			}
			for (int num = i - 2; num >= 0; num--) {
				System.out.printf("%4d", (int) Math.pow(2, num));
			}
			System.out.println();
	    }
        input.close();
	}
}

