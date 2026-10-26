package Day_7;

import java.util.Arrays;
public class Array_8 {

	public static void main(String[] args) {
		 int[] arr = {45, 12, 78, 23, 9};

	        int max = Arrays.stream(arr).max().getAsInt();
	        int min = Arrays.stream(arr).min().getAsInt();

	        System.out.println("Maximum: " + max);
	        System.out.println("Minimum: " + min);

	}

}
