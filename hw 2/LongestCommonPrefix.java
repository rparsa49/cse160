import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();
		String s3 = longestPrefix(s1, s2);
		if(s3.equals(""))
			System.out.println(s1 + " and " + s2 + " have no common prefix.");
		else 
			System.out.println("The common prefix is: " + s3);
        input.close();
        }
	public static String longestPrefix(String s1, String s2) {
		String s3 = "";
		int min = s1.length();
		if (min > s2.length())
			min = s2.length();
		for(int i=0; i<min; i++)
			if(s1.charAt(i) == s2.charAt(i))
				s3 += s1.charAt(i);
			else 
				break;
		return s3;
	}
}