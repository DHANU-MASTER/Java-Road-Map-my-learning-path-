package JavaRoadMap;

import java.util.Scanner;

public class MyFourthProgram {
    public static void main(String[] args) {
        Scanner keyboardEar = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("======== Welcome to the Number Collector! ====================");
        System.out.println("Please enter 5 numbers, one at a time:");
        System.out.println("==============================================================");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = keyboardEar.nextInt();
        }
        
        System.out.println("==============================================================");
        System.out.println("You entered the following numbers:");
        System.out.println("==============================================================");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
        
        System.out.println("==============================================================");
        System.out.println("Thank you for using the Number Collector! Goodbye!");
    }
}
/*Output:======== Welcome to the Number Collector! ====================
Please enter 5 numbers, one at a time:
==============================================================
Enter number 1: 
9
Enter number 2: 
8
Enter number 3: 
7
Enter number 4: 
6
Enter number 5: 
5
==============================================================
You entered the following numbers:
==============================================================
Number 1: 9
Number 2: 8
Number 3: 7
Number 4: 6
Number 5: 5
==============================================================
Thank you for using the Number Collector! Goodbye!
*/