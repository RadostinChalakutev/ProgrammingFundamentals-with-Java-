package P01BasicSyntaxConditionalStatementsandLoops.Excercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int startNumber=number;
        int sum=0;
        int SumFact=0;
        while(number>0){
            int LastDigit= number%10;
            sum=sum+LastDigit;
            int fact=1;
            for (int i = 1; i <=LastDigit ; i++) {
                fact=fact*i;
                
            }
            SumFact=SumFact+fact;
            number=number/10;
        }
        if (SumFact==startNumber){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
