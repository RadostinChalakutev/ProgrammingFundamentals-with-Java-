package P01BasicSyntaxConditionalStatementsandLoops.Lab;

import java.util.Scanner;

public class RefactorSumofOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int currentNum = 1;
        for (int i = n; i > 0; i++) {
            sum += currentNum;
            System.out.println(i);
            currentNum += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
