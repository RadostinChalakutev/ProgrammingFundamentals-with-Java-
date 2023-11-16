package List.Excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        int countOfCommands = Integer.parseInt(scanner.nextLine());


        for (int count = 1; count <= countOfCommands; count++) {
            String command = scanner.nextLine();
            List<String> commandParts = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String name = commandParts.get(0);
            //(name)is not going //4 elements


            if (commandParts.size() == 3) {
                //(name) is going->3 elements
                if (names.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    names.add(name);
                }
            } else if (commandParts.size() == 4) {
                if (names.contains(name)) {
                    names.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }


            }

        }

        for (String name : names) {
            System.out.println(name);

        }


    }
}
