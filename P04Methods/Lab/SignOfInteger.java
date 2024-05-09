package P04Methods.Lab;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=Integer.parseInt(scanner.nextLine());
        logic(input);
    }
    public static void logic(int number){

        if (number>0){
            System.out.printf("The number %d is positive.",number);
        } else if (number==0) {
            System.out.println("The number 0 is zero.");


        }else {
            System.out.printf("The number %d is negative.",number);
        }

    }
}
