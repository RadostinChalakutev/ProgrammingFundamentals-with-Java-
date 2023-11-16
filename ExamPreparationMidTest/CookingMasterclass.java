package ExamPreparationMidTest;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.nextLine());
        double priceEgg = Double.parseDouble(scanner.nextLine());
        double priceApron = Double.parseDouble(scanner.nextLine());

        double sumFor1Person = priceApron * 1 + priceEgg * 10 + priceFlour * 10;
        System.out.println();

        if (budget<sumFor1Person){
            System.out.println("Items purchased for 34.00$.");
        }else{
            System.out.println("410.00$ more needed.");
        }


    }


}


