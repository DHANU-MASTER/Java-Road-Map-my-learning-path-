package JavaRoadMap;

import java.util.Scanner;
import java.util.Random; 

public class MyThirdProgram {
    public static void main(String[] args) {
        
        Scanner keyboardEar = new Scanner(System.in);
        Random number = new Random(); 
        System.out.println("Welcome to the World of Java Quiz!");
        System.out.println("Enter your name: ");
        System.out.println("Hello " + keyboardEar.nextLine() + "! Let's start the quiz.");
        
        System.out.println("Just predict one number from 1 to 10. Good Luck!");
        
        int secretNumber = number.nextInt(10) + 1;
        
        int guessedNumber = keyboardEar.nextInt();
        
        while (guessedNumber != secretNumber) {
            System.out.println("Not quite! Try another number: ");
            
            guessedNumber = keyboardEar.nextInt(); 
        }
        System.out.println("Amazing! You got it right. The number was " + secretNumber);
        System.out.println("Thank you for playing the quiz! Goodbye!");
    }
}
/*Output:Welcome to the World of Java Quiz!
Enter your name: 
tejas
Hello tejas! Let's start the quiz.
Just predict one number from 1 to 10. Good Luck!
2
Not quite! Try another number: 
5
Not quite! Try another number: 
9
Amazing! You got it right. The number was 9
Thank you for playing the quiz! Goodbye!
*/
        
        /*System.out.println("Welcome to the World of Java Quiz!");
        System.out.println("Enter your name: ");
        System.out.println("Hello " + keyboardEar.nextLine() + "! Let's start the quiz.");
        
        System.out.println("Just predict one number from 1 to 10. Good Luck!");
        System.out.println("lets start the quiz");
        
        int secretNumber = number.nextInt(10) + 1;
        
        int guessedNumber = keyboardEar.nextInt();
        
        if (guessedNumber == secretNumber) {
            System.out.println("Amazing! Your predicted number is correct!");
        } else {
            System.out.println("Your predicted number is not correct. Try again!");
        }
        
        System.out.println("The correct number was: " + secretNumber);
        System.out.println("Thank you for playing the quiz! Goodbye!");
    }
}*/

/* Output:Welcome to the World of Java Quiz!
Enter your name: 
Dhanu
Hello Dhanu! Let's start the quiz.
Just predict one number from 1 to 10. Good Luck!
lets start the quiz
5
Your predicted number is not correct. Try again!
The correct number was: 10
Thank you for playing the quiz! Goodbye!*/