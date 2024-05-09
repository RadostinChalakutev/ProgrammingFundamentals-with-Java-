package P07MidExam;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double totalPrice = 0;//обща цена без такси


        while (!command.equals("special") && !command.equals("regular")) {
            double price = Double.parseDouble(command);
            if (price < 0) {//invalid price
                System.out.println("Invalid price!");
            } else if (price == 0) {//invalid order
                System.out.println("Invalid order!");
            } else {//valid price
                totalPrice += price;
            }
            command = scanner.nextLine();
        }
        double taxes = totalPrice * 0.20;
        double sumWithTaxes = taxes + totalPrice;
        double discount = 0.0;
        if (command.equals("special")) {
            discount = sumWithTaxes - (sumWithTaxes * 0.10);
        } else {
            discount = sumWithTaxes;
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPrice);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", discount);

        }
    }
}

