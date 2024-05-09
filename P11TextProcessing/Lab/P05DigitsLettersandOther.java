package P11TextProcessing.Lab;

import java.util.Scanner;

public class P05DigitsLettersandOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sbDigit = new StringBuilder();
        StringBuilder sbLetter = new StringBuilder();
        StringBuilder sbOther = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
                sbDigit.append(currentChar);
            } else if (Character.isLetter(currentChar)) {
                sbLetter.append(currentChar);
            } else {
                sbOther.append(currentChar);
            }
        }
        System.out.println(sbDigit);
        System.out.println(sbLetter);
        System.out.println(sbOther);
    }
}
