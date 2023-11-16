package ExamPreparationMidTest;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;
import java.util.stream.Collectors;

public class TreasureHuntwihtList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Yohoho!")) {
            List<String> commandList = Arrays.stream(input.split(" ")).collect(Collectors.toList());//Loot Wood Gold Coins
            String command = commandList.get(0);//Loot

            switch (command) {
                case "Loot":
                    List<String> loots = commandList.subList(1, commandList.size());
                    for (String loot : loots) {
                        if (!items.contains(loot)) {
                            items.add(0, loot);
                        }
                    }
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(commandList.get(1));
                    if (dropIndex >= 0 && dropIndex < items.size()) {// Valid index
                        String removedItem = items.get(dropIndex);
                        items.remove(removedItem);
                        items.add(removedItem);
                    }
                    break;
                case "Steal":
                    int stolenItems = Integer.parseInt(commandList.get(1));
                    int result = items.size() - stolenItems;
                    List<String> stealedItems = new ArrayList<>();
                    if (result >= 0) {
                        for (int removedIndex = result; removedIndex < items.size(); removedIndex++) {
                            String item = items.remove(removedIndex--);
                            stealedItems.add(item);

                        }

                    } else {
                        for (int i = 0; i < items.size(); i++) {
                            String item = items.remove(i--);
                            stealedItems.add(item);

                        }

                    }

                    System.out.println(String.join(", ", stealedItems));
                    break;
            }


            input = scanner.nextLine();
        }
        if(items.isEmpty()){
            System.out.println("Failed treasure hunt.");
        }else {
            double sum=0;
            for (String item:items) {
               sum=sum+item.length();

            }
            double average=sum/items.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.",average);
        }


    }
}
