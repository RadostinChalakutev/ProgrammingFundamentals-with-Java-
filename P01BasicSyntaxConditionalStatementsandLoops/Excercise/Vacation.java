package P01BasicSyntaxConditionalStatementsandLoops.Excercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;
        double totalSum=0.0;
        switch (type) {
            case "Students":
                if (day.equals("Friday")) {
                    price = 8.45;
                } else if (day.equals("Saturday")) {
                    price = 9.80;
                } else if (day.equals("Sunday")) {
                    price = 10.46;
                }

                break;
            case "Business":
                if (day.equals("Friday")) {
                    price = 10.90;
                } else if (day.equals("Saturday")) {
                    price = 15.60;
                } else if (day.equals("Sunday")) {
                    price = 16;
                }

                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price = 15;
                } else if (day.equals("Saturday")) {
                    price = 20;
                } else if (day.equals("Sunday")) {
                    price = 22.50;
                }
                break;
        }
        totalSum=price*num;
        switch (type){
            case "Students":
                if (num>=30) {
                    totalSum=totalSum-(totalSum*0.15);
                }
                break;
            case "Business":
                if (num>=100){
                    totalSum=totalSum-(10*price);
                }
                break;
            case "Regular":
                if (num>=10&&num<=20){
                    totalSum=totalSum-(totalSum*0.05);
                }
                break;
        }
        System.out.printf("Total price: %.2f",totalSum);


    }
}
