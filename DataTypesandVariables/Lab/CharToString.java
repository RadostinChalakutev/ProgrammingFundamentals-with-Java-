package DataTypesandVariables.Lab;

import java.util.Scanner;

public class CharToString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String chars="" ;
        for (int i = 0; i <3 ; i++) {
            char symbol=scanner.nextLine().charAt(0);
            chars+=symbol;

        }
        System.out.println(chars);
    }
}
