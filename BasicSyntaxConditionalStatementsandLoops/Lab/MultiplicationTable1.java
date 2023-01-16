package BasicSyntaxConditionalStatementsandLoops.Lab;

import java.util.Scanner;

public class MultiplicationTable1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int multiplication=0;
        for (int i=1;i<=10;i++){
            multiplication=n*i;

            System.out.printf("%d X %d = %d%n",n,i,multiplication);
        }
    }
}
