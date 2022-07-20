import java.util.Scanner; 

public class Temperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter inputs
		System.out.print("Enter a temperature between -58 Fahrenheit and 41 Fahrenheit: ");
		Double temp = input.nextDouble();
		
		System.out.print("Enter a wind speed greater than or equal to 2: ");
		Double windSp = input.nextDouble();
		
		// compute wind chill temp
		double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSp, 0.16) + 0.4275 * temp * Math.pow(windSp, 0.16);
		
		// display wind chill
		System.out.print("The wind chill temperature is " + windChill);
	
		input.close();
		
		
	}

}
