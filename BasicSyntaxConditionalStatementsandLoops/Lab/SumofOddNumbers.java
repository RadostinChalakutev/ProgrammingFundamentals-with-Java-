package BasicSyntaxConditionalStatementsandLoops.Lab;

import java.util.Scanner;

public class SumofOddNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int oddNumbersCount=Integer.parseInt(scanner.nextLine());
        int sum=0;
        int currentNum=1;
        for(int i=oddNumbersCount;i>0;i--){
            sum +=currentNum;
            System.out.println(currentNum);
            currentNum+=2;
        }
        System.out.printf("Sum: %d",sum);
    }
}
