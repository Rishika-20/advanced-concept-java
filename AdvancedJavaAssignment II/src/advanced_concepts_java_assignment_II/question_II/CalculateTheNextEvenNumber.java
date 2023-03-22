package advanced_concepts_java_assignment_II.question_II;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateTheNextEvenNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("Please enter the number:");
            long number = scan.nextLong();

            //finding the next even number using lambdas expression.
            EvenNumber evenNumber = (long newNumber) -> {
                if (newNumber == 0) {
                    newNumber = +2;
                    System.out.println("Next even number is: " + newNumber);
                }
                else if (newNumber % 2 == 0) {
                    newNumber = +2;
                    System.out.println("Next even number is: " + newNumber);
                }
                else if (newNumber < 0) {
                    newNumber--;
                    System.out.println("Next even number is: " + newNumber);
                } else {
                    newNumber++;
                    System.out.println("Even number is: " + newNumber);
                }
            };
            evenNumber.evenNumber(number);
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input!! Please enter valid number.");
        }
    }
}
