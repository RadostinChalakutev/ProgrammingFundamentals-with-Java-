package MIdRetakeExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GeneratingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] token = input.split(" ");
            if (input.contains("add to start")) {
                int endedIndex = 3;
                for (int i = token.length - 1; i >= endedIndex; i--) {
                    int currentElement = Integer.parseInt(token[i]);
                    numbers.add(0, currentElement);
                }
            } else if (input.contains("remove greater than")) {
                int greaterNumber = Integer.parseInt(token[3]);
                for (int number : numbers) {
                    if (number >= greaterNumber) {
                        numbers.remove(number);
                    }
                }
            } else if (input.contains("replace")) {
                int value = Integer.parseInt(token[1]);
                int replacement = Integer.parseInt(token[2]);
                if (numbers.contains(value)) {
                    int index = numbers.indexOf(value);
                    numbers.remove(index);
                    numbers.add(index, replacement);

                }

            } else if (input.contains("remove at index")) {
                int index = Integer.parseInt(token[1]);
                numbers.remove(index);
            } else if (input.contains("find even")) {
                for (int number : numbers) {
                    if (number % 2 == 0) {
                        System.out.print(number + " ");
                    }
                }

            } else if (input.contains("find odd")) {
                for (int number : numbers) {
                    if (number % 1 == 0) {
                        System.out.print(number + " ");
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (
                int number : numbers) {
            System.out.print(number + ", ");
        }
    }
}
