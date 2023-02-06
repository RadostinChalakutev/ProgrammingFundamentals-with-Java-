package Methods.Excercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        char firstChar = first.charAt(0);
        char secondChar = second.charAt(0);
        getChar(firstChar, secondChar);
    }

    public static void getChar(char first, char second) {
        while (first != second) {
            if (first > second) {
                second++;
                if (second == first) {
                    break;
                }
                System.out.print(second + " ");
            } else {
                first++;
                if (first == second) {
                    break;
                }
                System.out.print(first + " ");
            }

        }

    }
}
