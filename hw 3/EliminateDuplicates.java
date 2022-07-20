public class EliminateDuplicates {

	public static void main(String[] args) {
		System.out.println(eliminateDuplicates("abracadabra"));
		System.out.println(eliminateDuplicates("Stony Brook University"));
		System.out.println(eliminateDuplicates("This is a test sentence"));
		System.out.println(eliminateDuplicates("Hello there TA."));
		System.out.println(eliminateDuplicates("I love to eat good food."));
	}
	public static String eliminateDuplicates(String str) {
		char[] str1 = str.toCharArray();
		String str2 = "";
		for (char value: str1) {
			if (str2.indexOf(value) == -1) {
				str2 += value;
			}
		}
		return str2;
	}
}
