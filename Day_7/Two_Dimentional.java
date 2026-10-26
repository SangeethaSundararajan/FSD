
package Day_7;

public class Two_Dimentional {

    public static void main(String[] args) {

        int[] numbers = {12, 7, 24, 9, 15, 30, 18, 5};

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);
    }
}
