package assignment_III;
/*
* Write a lambda expression that accepts seven string arguments and returns a
* string in upper case concatenated from all of them (in the order of arguments).
* */
import java.util.ArrayList;
import java.util.Scanner;

public class StringOperationUsingLambdaExpressions {
    public static void main(String[] args)
    {
        ArrayList<String> listOfString = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the seven strings (one by one in new line): ");
        String setOfString;
        // Taking input as  strings from User
        for (int index = 0; index < 7; index++) {
            setOfString = scan.nextLine();
            listOfString.add(setOfString);
        }
        // Performing String operations (concatenation & uppercase).
        StringOperation stringOperation = (ArrayList<String> statement) -> {
            String afterConcatUppercase = String.join("", statement).toUpperCase();
            return afterConcatUppercase;
        };

        String result = stringOperation.listOfStrings(listOfString);
        System.out.println(result);

    }
}
