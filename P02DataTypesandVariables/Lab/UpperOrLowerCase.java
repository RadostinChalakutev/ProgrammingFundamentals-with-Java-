package P02DataTypesandVariables.Lab;

import java.util.Scanner;

public class UpperOrLowerCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char word=scanner.nextLine().charAt(0);
       if (Character.isUpperCase(word)){
           System.out.println("upper-case");
       }else {
           System.out.println("lower-case");
       }
    }
}
