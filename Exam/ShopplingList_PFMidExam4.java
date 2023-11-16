package Exam;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShopplingList_PFMidExam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shopList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String input=scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String[] commandData = input.split(" ");
            String currentCommand = commandData[0];
            switch (currentCommand) {
                case "Urgent":
                    String item = commandData[1];
                    if (!shopList.contains(item)) {
                        shopList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    String deletedItem = commandData[1];
                    shopList.remove(deletedItem);
                    break;
                case "Correct":
                    String oldItem = commandData[1];
                    String newItem = commandData[2];
                    if (shopList.contains(oldItem)) {
                        int oldIndex = shopList.indexOf(oldItem);
                        shopList.remove(oldItem);
                        shopList.add(oldIndex, newItem);
                    }
                    break;
                case "Rearrange":
                    String rearrangeItem = commandData[1];
                    if (shopList.contains(rearrangeItem)) {
                        shopList.remove(rearrangeItem);
                        shopList.add(rearrangeItem);
                    }
                    break;
            }
            input = scanner.nextLine();

        }
        System.out.println(String.join(", ", shopList));
    }
}
