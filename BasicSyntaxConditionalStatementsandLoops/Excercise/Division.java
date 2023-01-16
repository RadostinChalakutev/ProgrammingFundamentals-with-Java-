package BasicSyntaxConditionalStatementsandLoops.Excercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.входни данни
        int number=Integer.parseInt(scanner.nextLine());
        //2. Проверяваме дали числото се дели на 2,3,6,7,10
        //3. Трябва ни най-големия делител > започваме проверката от най- голямото число
        if (number%10==0) {
            System.out.println("The number is divisible by 10");
        } else if (number%7==0) {
            System.out.println("The number is divisible by 7");
        } else if (number % 6 ==0) {
            System.out.println("The number is divisible by 6");
        } else if (number %3==0) {
            System.out.println("The number is divisible by 3");
        }else if (number% 2==0){
            System.out.println("The number is divisible by 2");
        }else {
            System.out.println("Not divisible");
        }

    }
}
