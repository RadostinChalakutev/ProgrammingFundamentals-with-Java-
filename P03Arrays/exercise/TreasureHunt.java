package P03Arrays.exercise;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] loots = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {// Loot Drop Steal
                case "Loot":
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(commandParts[1]);
                    if (dropIndex < 0 || dropIndex >= commandParts.length - 1) {// invalid index
                        break;
                    } else {
                        String currentLoot = loots[dropIndex];
                        for (int leftIndex = dropIndex; leftIndex < loots.length - 1; leftIndex++) {
                            loots[leftIndex] = loots[leftIndex + 1];
                        }
                        loots[loots.length - 1] = currentLoot;
                    }
                    break;
                case "Steal":
                    int countSteal = Integer.parseInt(commandParts[1]);

                    break;
            }


            command = scanner.nextLine();
        }

    }
}
