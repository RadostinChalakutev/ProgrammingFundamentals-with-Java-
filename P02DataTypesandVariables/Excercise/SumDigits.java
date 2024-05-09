package P02DataTypesandVariables.Excercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        int sum=0;

        for (int i = 0; num>0; i++) {
           int digit=num%10;


           sum=sum+digit;
           num=num/10;
        }
        System.out.println(sum);
    }
}
