
package Day_7;

public class Two_Dimentional {

    public static void main(String[] args) {

    	
    	//Task1
        int[] numbers = {12, 7, 24, 9, 15, 30, 18, 5};

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++) 
        {

            if (numbers[i] % 2 == 0) 
            {
                evenCount++;
            } else 
            {
                oddCount++;
            }
        }

        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);
        
        
        
        
        //Task2
        int[] rollNumbers = {101, 102, 103, 104, 105, 106};
        int searchNumber = 104;
        boolean found = false;

        for (int i = 0; i < rollNumbers.length; i++) {

            if (rollNumbers[i] == searchNumber) 
            {
                System.out.println("Roll Number Found");
                System.out.println("Position: " + (i + 1));
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("Roll Number Not Found");
        }
    }
}
