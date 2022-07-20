import java.util.Random;
public class ArrayUtils {
	public static void main(String[] args) {
		int array[] = new int[100];
		array = randomArray(100,21);
		print(array);
		double avg = (double)arraySum(array)/array.length;
		System.out.println("\naverage of array is: " + avg);
		System.out.println("contains function: " + contains(array,12));
		System.out.println("number of multiples of 7: " + countMultiplesOf(array,7));
	}
	
	 public static int[] randomArray(int size,int upLimit) {
	        int j[]=new int[size];
	        Random ran = new Random();
	        for(int i=0;i<size;i++)
	        {
	            j[i]=ran.nextInt(upLimit);
	        }
	        return j;
	    }
	 
	public static void print(int j[]) {
		for(int i = 0; i < j.length; i++) {
			System.out.print(j[i] + "");
		}
	}

	public static int arraySum(int j[]) {
		int sum = 0;
		for (int i = 0; i < j.length; i++) {
			sum = sum + j[i];
		}
		return sum;
	}
	
	 public static int contains(int j[],int x)
	    {  int a = -1;
	        for(int i = 0; i < j.length; i++)
	        {
	            if(j[i] == x)
	            {a = i;
	            break;
	            }
	        }
	        return a;
	    }
	
	public static int countMultiplesOf(int j[], int x) {
		int a = 0;
		for (int i = 0; i < j.length; i++) {
			if(div(j[i],x))
				a++;
		}
		return a;
	}
	public static boolean div(int i, int j) {
		if(i % j == 0) 
			return true;
			else
				return false;
		}
	}
