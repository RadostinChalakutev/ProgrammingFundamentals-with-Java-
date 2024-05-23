package P01BasicSyntaxConditionalStatementsandLoops.moreExcercise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();
        double spentMoney = 0;
        double gamePrice = 0;
        while (!game.equals("Game Time")) {


            switch (game) {
                case "OutFall 4":
                    gamePrice = 39.99;
                    if (budget < gamePrice) {
                        System.out.println("Too expensive");
                    } else {
                        budget -= gamePrice;
                        spentMoney += gamePrice;
                        System.out.println("Bought " + game);
                    }
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    if (budget < gamePrice) {
                        System.out.println("Too Expensive");
                    } else {
                        budget -= gamePrice;
                        spentMoney += gamePrice;
                        System.out.println("Bought " + game);
                    }
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    if (budget < gamePrice) {
                        System.out.println("Too Expensive");
                    } else {
                        budget -= gamePrice;
                        spentMoney += gamePrice;
                        System.out.println("Bought " + game);
                    }
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    if (budget < gamePrice) {
                        System.out.println("Too Expensive");
                    } else {
                        budget -= gamePrice;
                        spentMoney += gamePrice;
                        System.out.println("Bought " + game);
                    }
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    if (budget < gamePrice) {
                        System.out.println("Too Expensive");
                    } else {
                        budget -= gamePrice;
                        spentMoney += gamePrice;
                        System.out.println("Bought " + game);
                    }
                    break;
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    if (budget < gamePrice) {
                        System.out.println("Too Expensive");
                    } else {
                        budget -= gamePrice;
                        spentMoney += gamePrice;
                        System.out.println("Bought " + game);
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;

            }

            game = scanner.nextLine();
            if (budget <= 0) {
                System.out.println("Out of money!");
                break;
            }
            if (game.equals("Game Time")) {
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentMoney,budget);

            }
        }

    }
}
