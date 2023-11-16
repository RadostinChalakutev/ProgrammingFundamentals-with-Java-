package MIdRetakeExam;

import java.util.Enumeration;
import java.util.Scanner;

public class GoogleSearches {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double moneyPerSearch = Double.parseDouble(scanner.nextLine());
        int users = Integer.parseInt(scanner.nextLine());//брой на потребителите
        int counter = 0;
        double totalMoney = 0;
        double tripleMoney = 0;
        for (int i = 0; i <users ; i++) {
            int numberOfSearches = Integer.parseInt(scanner.nextLine());

            counter++;
            if (numberOfSearches==1){
                totalMoney=totalMoney+0;
            }
            else if (counter%3==0){
                tripleMoney=moneyPerSearch*3*numberOfSearches;//на всеки трети user
                if (numberOfSearches>=5){
                    totalMoney = totalMoney+(numberOfSearches*moneyPerSearch*2);

                    ;//трплълваме парите

            }}else if (numberOfSearches>=5){
                totalMoney = totalMoney+(numberOfSearches*moneyPerSearch*2);
            }else{
                totalMoney=totalMoney+(numberOfSearches*moneyPerSearch);
            }



        }
        double totalPrice = totalMoney+tripleMoney;
        System.out.printf("Total money earned: %.2f",totalPrice);
    }
}
