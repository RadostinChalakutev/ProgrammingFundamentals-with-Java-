package P01BasicSyntaxConditionalStatementsandLoops.Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int multiplication = 0;
        for (int i = x; i <= 100; i++) {
            multiplication = n * i;
            if (i>=10){
                System.out.printf("%d X %d = %d",n,i,multiplication);
                break;
            }

            System.out.printf("%d X %d = %d%n", n, i, multiplication);
        }
    }
}



