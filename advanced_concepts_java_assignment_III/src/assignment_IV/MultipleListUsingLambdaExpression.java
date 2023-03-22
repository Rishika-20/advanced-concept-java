package assignment_IV;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MultipleListUsingLambdaExpression {
    public static void main(String[] args) {
        ArrayList<String> firstList = new ArrayList();
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter the total number of strings : ");
            int number = scan.nextInt();
            System.out.println("Please enter the strings: ");
            String setOfString;
            //Taking the number of string inputs from user.
            for (int index = 0; index <= number; index++) {
                setOfString = scan.nextLine();
                firstList.add(setOfString);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input.");
        }
        //Calculating distinct and sorted value from firstList and adding them into secondList or distinctList.
        DistinctValue distinctValue = (ArrayList<String> strings) -> {
            List<String> distinctList = firstList.stream().distinct().sorted().collect(Collectors.toList());
            return distinctList.toString();
        };
        String result = distinctValue.distinctStrings(firstList);
        System.out.println(result);
    }
}
