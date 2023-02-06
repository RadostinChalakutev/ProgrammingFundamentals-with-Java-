package Methods.Excercise;

import java.util.Scanner;

public class MiddleCharacters06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //1. създаване на метод, който принтира средния символ
        printMiddleCharacters(text);


    }

    public static void printMiddleCharacters(String text) {
        //нечетна дължина-> 1 среден символ
        if (text.length() % 2 != 0) {
           int indexOfMiddleCharacter=text.length()/2;
            System.out.println(text.charAt(indexOfMiddleCharacter));

        } else  {
            int indexOfFirstMiddleCharacter=text.length()/2;
            int indexOfSecondMiddleCharacter=indexOfFirstMiddleCharacter-1;
            System.out.print(text.charAt(indexOfSecondMiddleCharacter));
            System.out.print(text.charAt(indexOfFirstMiddleCharacter));


        }
        //четна дължина-> 2 четни симовола
    }
}
