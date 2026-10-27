package Day_7;

import java.util.Arrays;
public class Array_7 {

	public static void main(String[] args) {
		
		  int[] arr = {10, 20, 30, 40, 50};

	        int sum = Arrays.stream(arr).sum();

	        System.out.println("Sum: " + sum);
	}

}
