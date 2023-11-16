package MIdRetakeExam;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GenerateNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> toRemove = new ArrayList<>();
        String input = scanner.nextLine();
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        while (!input.equals("END")) {
            String[] token = input.split(" ");
            if (input.contains("add to start")) {
                int endIndex = 3;
                for (int i = token.length - 1; i >= endIndex; i--) {
                    int currentElement = Integer.parseInt(token[i]);
                    numbersList.add(0, currentElement);
                }
            } else if (input.contains("remove greater than")) {
                int greaterValue = Integer.parseInt(token[3]);
                for (int number : numbersList) {
                    if (number >= greaterValue) {
                        toRemove.add(number);
                    }
                }
                numbersList.removeAll(toRemove);
            } else if (input.contains("replace")) {
                int value = Integer.parseInt(token[1]);
                int replacement = Integer.parseInt(token[2]);
                int index = numbersList.indexOf(value);
                numbersList.remove(index);
                numbersList.add(index, replacement);
            } else if (input.contains("remove at index")) {
                int index = Integer.parseInt(token[3]);
                numbersList.remove(index);
            } else if (input.contains("find even")) {
                for (int number : numbersList) {
                    if (number % 2 == 0) {
                        evenList.add(number);
                    }
                }
                for (int i = 0; i < evenList.size(); i++) {
                    int currentElement = evenList.get(i);
                    if (i == evenList.size() - 1) {
                        System.out.print(currentElement);
                    } else {
                        System.out.print(currentElement + " ");
                    }
                }
                System.out.println();
            } else if (input.contains("find odd")) {
                for (int number : numbersList) {
                    if (number % 2 == 1) {
                        oddList.add(number);
                    }
                }
                for (int i = 0; i < oddList.size(); i++) {
                    int currentElement = oddList.get(i);
                    if (i == oddList.size() - 1) {
                        System.out.print(currentElement);
                    } else {
                        System.out.print(currentElement + " ");
                    }
                }
                System.out.println();
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numbersList.size(); i++) {
            int currentElement = numbersList.get(i);
            if (i == numbersList.size() - 1) {
                System.out.print(currentElement);
            } else {
                System.out.print(currentElement + ", ");
            }

        }

    }
}
