package strings;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfTestCases = scan.nextInt();
        scan.nextLine();

        for (int i=0; i<numberOfTestCases; i++) {
            try {
                String regex = scan.nextLine();
                if (!regex.isEmpty()){
                    Pattern.compile(regex);
                    System.out.println("Valid");
                }

            } catch (PatternSyntaxException pe) {
                System.out.println("Invalid");
            }
        }


    }
}
