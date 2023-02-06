package Methods.Lab;


import java.util.Scanner;

public class GreaterOfTwoValues09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type) { //int, char of String
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(Integer(firstNum, secondNum));
                break;
            case "char":
                char firstCharacter = scanner.nextLine().charAt(0);
                char secondCharacter = scanner.nextLine().charAt(0);
                System.out.println(charMethod(firstCharacter,secondCharacter));
                break;
            case "string":
                String first = scanner.nextLine();
                String second = scanner.nextLine();
                System.out.println((stringMethod(first, second)));
                break;
        }


    }

    public static int Integer(int firstNum, int secondNum) {

        if (firstNum > secondNum) {
            return firstNum;
        } else {
            return secondNum;
        }
    }

    public static char charMethod(char firstChar, char secondChar) {


        if (firstChar > secondChar) {
            return firstChar;
        } else {
            return secondChar;

        }


    }

    public static String stringMethod(String first, String second) {


        if (first.compareTo(second)>0) {
            return first;
        } else {
            return second;
        }

    }
}
