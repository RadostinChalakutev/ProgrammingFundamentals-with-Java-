package P01BasicSyntaxConditionalStatementsandLoops.Excercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double SumCoin = 0;
        double TotalSumProductPrice = 0;

        while (input!="Start") {
            if (input.equals("Start")){
                break;
            }
            double coin=Double.parseDouble(input);


            switch (input) {

                case "0.1":
                    SumCoin+=coin;
                    break;
                case "0.2":
                    SumCoin+=coin;
                    break;
                case "0.5":
                    SumCoin+=coin;
                    break;
                case "1":
                    SumCoin+=coin;
                    break;
                case "2":
                    SumCoin+=coin;
                    break;
                default:
                    System.out.printf("Cannot accept %.2f%n", coin);
                    break;
            }
            input=scanner.nextLine();
        }
        String product = scanner.nextLine();
        double productPrice = 0;
        while (product != "End") {
            if (product.equals("End")){
                break;
            }
            switch (product) {
                case "Nuts":
                    productPrice = 2.0;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1.0;
                    break;
                default:
                    System.out.println("Invalid product%n");
                    break;
            }
            TotalSumProductPrice = TotalSumProductPrice + productPrice;

            if (SumCoin >= productPrice && SumCoin > 0 && productPrice > 0) {
                System.out.printf("Purchased %s%n", product);
                SumCoin = SumCoin - productPrice;
                productPrice = 0;
            } else if (productPrice > 0) {
                System.out.printf("Sorry,not enough money%n");
                productPrice = 0;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", SumCoin );

    }

}

