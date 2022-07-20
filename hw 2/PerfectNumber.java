import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the upper limit: ");
		int n = input.nextInt();
		System.out.print("The perfect numbers below " + n + " are: ");
		for (int i=2; i<=n; i++) {
			int r = i - 1;
			for(int j=2; j<=i/2; j++)
				if(i%j == 0)
					r -= j;
				if(r == 0)
					System.out.print(i + " ");
		}
        input.close();
	}

}
