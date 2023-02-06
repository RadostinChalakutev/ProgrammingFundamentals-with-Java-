package Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int absoluteNumber=Math.abs(number);
        int oddSum=getOddSum(absoluteNumber);
        int evenSum=getEvenSum(absoluteNumber);
        int multiplyer=oddSum*evenSum;
        System.out.println(multiplyer);

    }
    public static int getEvenSum(int n){
        int evenSum=0;
        while(n>0){


            int ostatak=n%10;
            n/=10;

            if (ostatak%2==0){
                evenSum=evenSum+ostatak;
            }

        }
        return evenSum;
    }
    public static int getOddSum(int n){
        int oddSum=0;
        while(n>0){
            int ostatak=n%10;
            n/=10;
            if (ostatak%2==1){
                oddSum=oddSum+ostatak;
            }
        }
        return oddSum;
    }
}
