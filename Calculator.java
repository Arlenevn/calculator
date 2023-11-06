import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * This program is a simple command-line calculator in Java.
 * It takes user input for two numbers and an operator (+, -, *, /),
 * This performs the calculation, and displays the result.
 */

//define code class
public class Calculator {
    public static void main(String[] args) {

        //Step 1: Set up user input
        Scanner userInput = new Scanner(System.in);

        // step 2: define variables
        double firstNumber, secondNumber, calculationResult;

        // Step 3: get the first number from the user
        System.out.println("Enter the first number: ");
        firstNumber = userInput.nextDouble();

        // Step 4: get the operator from the user
        System.out.println("Enter the desired operator (+, -, *, /): ");
        char operation = userInput.next().charAt(0);

        //Step 5: get the second number from the user
        System.out.println("Enter the second number: ");
        secondNumber = userInput.nextDouble();

        //Step 6:  perform the calculation based on the operator using switch case
        switch (operation) {
            case '+' :
                calculationResult = firstNumber + secondNumber;
                break;
            case '-':
                calculationResult = firstNumber - secondNumber;
                break;
            case '*':
                calculationResult = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    calculationResult = firstNumber / secondNumber;
                }else {
                    System.out.println("Error: Can not divide by zero :( ");
                    return;
                }
                break;
            default:
                System.out.println("OOPS! Operator is invalid");
                return;
            }

            //here display the result of the calculation
            System.out.println("Result: " + calculationResult);
    }
}
