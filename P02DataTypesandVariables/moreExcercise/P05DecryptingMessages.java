package P02DataTypesandVariables.moreExcercise;

import java.util.Scanner;

public class P05DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n =Integer.parseInt(scanner.nextLine());
        String decryptedWord="";

        for (int i = 0; i <n ; i++) {
            char currentChar=scanner.nextLine().charAt(0);
            String newString=Character.toString(currentChar+key);
            decryptedWord+=newString;
        }
        System.out.println(decryptedWord);
    }
}
