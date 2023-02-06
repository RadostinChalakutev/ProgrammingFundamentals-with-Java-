package Methods.Lab;

import java.io.PrintStream;
import java.util.Scanner;

public class Orders05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int inputInt = Integer.parseInt(scanner.nextLine());
        products(inputString,inputInt);
    }
    public static void products(String product, int quantity ) {
        double price=0.0;
        switch (product) {

            case "coffee":
                price = 1.50 * quantity;
                break;
            case "water":
                price = 1.00 * quantity;
                break;
            case "coke":
                price = 1.40 * quantity;
                break;
            case "snacks":
                price = 2.00 * quantity;
                break;
        }
        System.out.printf("%.2f",price);


        //coffee – 1.50 water – 1.00 coke – 1.40 snacks – 2.00
    }
}
