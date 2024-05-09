package P07MidExam;

import java.util.Scanner;

public class P01GuineaPig_PFMIdExam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //On the first line – quantity food in kilograms - a floating-point number in the range [0.0 – 10000.0]
        // On the second line – quantity hay in kilograms - a floating-point number in the range [0.0 – 10000.0]
        // On the third line – quantity cover in kilograms - a floating-point number in the range [0.0 – 10000.0]
        // On the fourth line – guinea's weight in kilograms - a floating-point number in the range [0.0 – 10000.0]

        double quantityOfFoodGr = Double.parseDouble(scanner.nextLine()) * 1000;//10 covert to grams 10000
        double quantityHayGr = Double.parseDouble(scanner.nextLine()) * 1000;//5 5000
        double quantityCoverGr = Double.parseDouble(scanner.nextLine()) * 1000;//5.2 5200
        double guineaWeightGr = Double.parseDouble(scanner.nextLine()) * 1000;//1 1000
        int days = 1;

        while (days <= 30) {
            quantityOfFoodGr -= 300;

            if (days % 2 == 0) {// every second day
                quantityHayGr -= (quantityOfFoodGr * 5) / 100;// 5/100-> 5%
            }
            if (days % 3 == 0) {
                quantityCoverGr -= guineaWeightGr * 0.3333;
            }
            days++;
        }


        if (quantityOfFoodGr<=0||quantityHayGr<=0||quantityCoverGr<=0){ //недостатъчни продукти
            System.out.println("Merry must go to the pet store!");
        }else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f."
                    ,quantityOfFoodGr/1000,quantityHayGr/1000,quantityCoverGr/1000);
        }

    }
}
