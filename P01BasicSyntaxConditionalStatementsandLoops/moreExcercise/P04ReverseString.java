package P01BasicSyntaxConditionalStatementsandLoops.moreExcercise;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input =scanner.nextLine();
        String output="";

        for (int symbol = input.length()-1; symbol >-1 ; symbol--) {
            char lastDigit=input.charAt(symbol);
            output+=lastDigit;
        }
        System.out.println(output);
    }
}
