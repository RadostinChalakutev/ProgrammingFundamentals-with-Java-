package P04Methods.Excercise;

import java.util.Scanner;

public class PasswordValidator04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //6 – 10 characters (inclusive);
        //· Consists only of letters and digits;
        //· Have at least 2 digits.
        String input = scanner.nextLine();
        boolean isValidLength=isValidLength(input);
        if (!isValidLength){
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isOnlyDigitsAndLetters=isConsistOnlyOfDigitsAndLetters(input);
        if (!isOnlyDigitsAndLetters){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isHave2Digits=isValidCountDigits(input);
        if (!isHave2Digits){
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidLength&&isOnlyDigitsAndLetters&&isHave2Digits){
            System.out.println("Password is valid");
        }


    }

    public static boolean isValidLength(String password) {
        boolean is10To6Characters = false;
        return (password.length() <= 10 && password.length() >= 6);
    }

    public static boolean isConsistOnlyOfDigitsAndLetters(String password) {
        boolean isTrue = false;
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;

    }
    public static boolean isValidCountDigits(String password){
        int countDigits=0;// count of numbers in password
        for (char symbol:password.toCharArray()) {
            if (Character.isDigit(symbol)){
                countDigits++;
            }

        }
        return countDigits>=2;

    }
}
