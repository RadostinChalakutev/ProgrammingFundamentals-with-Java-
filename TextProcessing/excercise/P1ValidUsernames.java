package TextProcessing.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(", ");

        for (String currentWord : inputArr) {
            List<String> ValidUsernameList = new ArrayList<>();
            if (isValid(currentWord)){
                System.out.println(currentWord);
            }

        }
    }

    public static boolean isValid(String currentWord) {
        if (currentWord.length()<3|| currentWord.length()>16){
            return false;
        }

        //валиден-> letters(а,А), numbers(1), hyphens(-), and underscores(_).
        for (char symbol : currentWord.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                //invalid username
                return false;

            }

        }
        //ako не влезе във if проверката-> valid username
        return true;

    }
}
