package Day_7;

import java.util.Arrays;
public class Array_5 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int [] copy = Arrays.copyOf(arr, 4);
		
		System.out.println(Arrays.toString(copy));
	}

}
