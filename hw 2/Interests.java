import java.util.Scanner; 

public class Interests {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of years: ");
		int years = input.nextInt();
		
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		
		for (double annualInterestRate= 5.0; annualInterestRate <= 8.0; annualInterestRate += 0.125) {
			System.out.printf("%-5.3f", annualInterestRate);
			System.out.print("%           ");
			double monthlyInterestRate = annualInterestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), years * 12)));
			System.out.printf("%-19.2f", monthlyPayment);
			System.out.printf("%-8.2f\n", (monthlyPayment * 12) * years);
			
		}
		input.close();
	}

}
