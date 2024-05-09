package P01BasicSyntaxConditionalStatementsandLoops.Excercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        double TotalPrice = 0;
        double currentSum = 0;

        for (int i = 1; i <= N; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());


            TotalPrice = (days * capsulesCount) * pricePerCapsule;

            currentSum += TotalPrice;


            System.out.printf("The price for the coffee is: $%.2f%n", TotalPrice);
            TotalPrice = 0;
        }
        System.out.printf("Total: $%.2f", currentSum);
    }
}
