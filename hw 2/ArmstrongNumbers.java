import java.util.Scanner; 

public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the lower limit: ");
		int lowLimit = input.nextInt();
		
		System.out.print("Enter the upper limit: ");
		int upLimit = input.nextInt();
		
		System.out.print("The Armstrong numbers between " + lowLimit + " and " + upLimit + " are: ");
		
		for (int number = lowLimit + 1; number < upLimit; ++number) {
			int digits = 0;
			int results = 0;
			int inputNumber = number;
			
			while (inputNumber != 0) {
				inputNumber /= 10;
				++ digits;
		}
	
			inputNumber = number;
		
	while (inputNumber != 0) {
		int remainder = inputNumber % 10;
		results += Math.pow(remainder, digits);
		inputNumber /=10;
	}
		if (results == number) {
			System.out.print(number + " ");
		}
	}
input.close();
}
	
}