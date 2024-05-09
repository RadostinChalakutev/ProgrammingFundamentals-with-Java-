package P06ExamPreparationMidTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        String input = scanner.nextLine();
        int count = 0;
        while (!input.equals("end")) {
            count++;
            String[] token = input.split("\\s+");
            int firstIndex = Integer.parseInt(token[0]);
            int secondIndex = Integer.parseInt(token[1]);
            if (cheat(firstIndex, secondIndex, numbers)) {
                System.out.println("Invalid input! Adding additional elements to the board");
                numbers.add(numbers.size() / 2, String.format("-%da", count));
                numbers.add(numbers.size() / 2, String.format("-%da", count));
            } else {
                String firstElement = numbers.get(firstIndex);
                String secondElement = numbers.get(secondIndex);

                if (firstElement.equals(secondElement)) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", firstElement);
                    numbers.remove(firstElement);
                    numbers.remove(secondElement);
                } else {
                    System.out.println("Try again!");
                }
            }
            if (numbers.isEmpty()) {
                break;
            }
            input = scanner.nextLine();
        }
        if (numbers.isEmpty()) {
            System.out.printf("You have won in %d turns!%n", count);

        } else {
            System.out.println("Sorry you lose :(");
            for (String number : numbers
            ) {
                System.out.print(number + " ");

            }
        }
    }

    public static boolean cheat(int firstIndex, int secondIndex, List<String> numbers) {
        if (firstIndex == secondIndex || isInvalidIndex(firstIndex, numbers) || isInvalidIndex(secondIndex, numbers)) {
            return true;
        }
        return false;

    }


    public static boolean isInvalidIndex(int Index, List<String> numbers) {
        if (Index < 0 || Index >= numbers.size()) {
            return true;
        }
        return false;
    }
}


