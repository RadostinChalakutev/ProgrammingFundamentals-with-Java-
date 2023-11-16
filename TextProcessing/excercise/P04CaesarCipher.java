package TextProcessing.excercise;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        StringBuilder sb=new StringBuilder();
        for (char symbol:text.toCharArray()) {
            char encryptedSymbol=(char)(symbol+3);
            sb.append(encryptedSymbol);
        }
        System.out.println(sb);
    }
}
