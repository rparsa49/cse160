import java.util.Scanner;
public class MultiplyMatrices {

	public static void main(String[] args) {
		
		double[][] a = getMatrix(1);
		double[][] b = getMatrix(2);
		
		double[][] c = multiplyMatrices(a, b);
		
		printMatrices(a, b, c);
		
	}
	
	public static double[][] getMatrix(int n) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter matrix" + n + ": ");

		double[][] m = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				m[i][j] = input.nextDouble();
		}
        input.close();
		return m;
	}
	
	
	public static double [][] multiplyMatrices(double [][] a, double [][] b) {
		double[][] c = new double[3][3];
		
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				for(int h=0; h<c.length; h++) {
					c[i][j] += a[i][h] * b[h][j];
				}
			}
		}
		return c;
	}

	public static void printRows(double[][] m, int r) {
		for(int j=0; j < m[r].length; j++) {
			System.out.printf("%5.1f", m[r][j]);
		}
	}
	
	public static void printMatrices(double[][] m1, double[][]m2, double[][]m3) {
		System.out.println("The multiplied matrices result as ");
		
		for(int i=0; i < 3; i++) {
			printRows(m1, i);
			System.out.print((i == 1 ? "   * " : "    "));
			printRows(m2, i);
			System.out.print((i == 1 ? "   = " : "    "));
			printRows(m3, i);
			System.out.println();
		}
	}
	
}