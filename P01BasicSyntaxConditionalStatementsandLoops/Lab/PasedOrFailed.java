package P01BasicSyntaxConditionalStatementsandLoops.Lab;

import java.util.Scanner;

public class PasedOrFailed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3.00) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}

