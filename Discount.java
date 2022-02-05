import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class Discount {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter the fixed price and number of games bought.
		System.out.print("Enter the fixed price: $");
		double fixedprice = input.nextDouble();
		
		System.out.print("Enter the quantity of games bought: ");
		int gamesbought = input.nextInt();
		
		// write code for if no discount applies
		if (gamesbought < 10) {
			var totalpriceless10 = fixedprice * gamesbought;
			System.out.println("Discount: None");
			System.out.println("Total price: $" + totalpriceless10 + df.format(totalpriceless10));
		}
		
		// write code for discounts
		if (gamesbought >= 100) {
			double discountedprice = (fixedprice * .50);
			double totalprice = discountedprice * gamesbought;
			System.out.println("Discount: 50%");
			System.out.println("Discounted Price: " + df.format(discountedprice));
			System.out.println("Discounted amount per unit: $" + df.format(fixedprice * .50));
			System.out.println("Total price: $" + df.format(discountedprice) + " * " + gamesbought + " = $" + df.format(totalprice));
		}
		
		else if (gamesbought >= 50 && gamesbought <= 99) {
			double discount = (fixedprice * .40);
			double discountedprice = fixedprice - discount;
			double totalprice = discountedprice * gamesbought;
			System.out.println("Discount: 40%");
			System.out.println("Discounted Price: " + df.format(discountedprice));
			System.out.println("Discounted amount per unit: $" + df.format(fixedprice * .40));
			System.out.println("Total price: $" + df.format(discountedprice) + " * " + gamesbought + " = $" + df.format(totalprice));
		}
		
		else if (gamesbought >= 20 && gamesbought <= 49) {
			double discount = (fixedprice * .30);
			double discountedprice = fixedprice - discount;
			double totalprice = discountedprice * gamesbought;
			System.out.println("Discount: 30%");
			System.out.println("Discounted Price: " + df.format(discountedprice));
			System.out.println("Discounted amount per unit: $" + df.format(fixedprice * .30));
			System.out.println("Total price: $" + df.format(discountedprice) + " * " + gamesbought + " = $" + df.format(totalprice));
		}
		
		else if (gamesbought >= 10 && gamesbought <= 19) {
			double discount = (fixedprice * .20);
			double discountedprice = fixedprice - discount;
			double totalprice = discountedprice * gamesbought;
			System.out.println("Discount: 20%");
			System.out.println("Discounted Price: " + df.format(discountedprice));
			System.out.println("Discounted amount per unit: $" + df.format(fixedprice * .20));
			System.out.println("Total price: $" + df.format(discountedprice) + " * " + gamesbought + " = $" + df.format(totalprice));
		}
		
		} 
		
			
		
			
		
		
	}


