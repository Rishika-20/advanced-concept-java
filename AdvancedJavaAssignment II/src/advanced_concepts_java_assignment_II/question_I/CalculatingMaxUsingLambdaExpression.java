package advanced_concepts_java_assignment_II.question_I;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculatingMaxUsingLambdaExpression {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double firstNumber = 0;
        double secondNumber = 0;
        try {
            System.out.println("Enter the first number:");
            firstNumber = scan.nextDouble();
            System.out.println("Enter the second number:");
            secondNumber = scan.nextDouble();
            //finding maximum of two number using lambdas expression.
            maximum max = (double firstNum, double secondNum) -> {
                if (firstNum > secondNum) {
                    System.out.println("The maximum of two numbers are : "+ firstNum);
                } else if (firstNum < secondNum) {
                    System.out.println("The maximum of two numbers are : "+ secondNum);
                } else {
                    System.out.println("You have entered the same numbers.");
                }
            };
            max.maximumOfTwoNumbers(firstNumber, secondNumber);
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input! Please enter the correct number.");
        }
    }
}
