import java.util.Arrays;
public class InterleaveArrays {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(interleaveArrays(new int [] {1,3,5}, new int [] {2,4,6})));
		System.out.println(Arrays.toString(interleaveArrays(new int [] {10,20,30,40,50,60,70,80}, new int[] {2,4,6,8})));
		System.out.println(Arrays.toString(interleaveArrays(new int [] {1,3,5}, new int[] {2,4,6,8,10})));
		System.out.println(Arrays.toString(interleaveArrays(new int [] {2,5,8}, new int[] {10,4,7})));
		System.out.println(Arrays.toString(interleaveArrays(new int [] {6,3,1}, new int[] {8,7,6})));
	}
	public static int[] interleaveArrays(int [] list1, int [] list2) {
        int min = Math.min(list1.length, list2.length);
        int [] result = new int[2 * min];
        for (int i = 0; i < min; i++) {
            result[2 * i] = list1[i];
            result[2 * i + 1] = list2[i];
	
        }
        return result;
}
}
