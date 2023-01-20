package DataTypesandVariables.Lab;

import java.util.Scanner;

public class ConcatName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        String lastName=scanner.nextLine();
        String delimiter=scanner.nextLine();
        String result=name+delimiter+lastName;
        System.out.println(result);
    }
}
