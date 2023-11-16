package MIdRetakeExam;

import java.util.*;
import java.util.stream.Collectors;

public class SpiceShelf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> spiceList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        List<String> toAdd = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("done")) {
            String[] token = command.split(" ");
            if (command.contains("AddSpice")) {
                String spice = token[1];
                if (!spiceList.contains(spice)) {
                    spiceList.add(spice);
                }
            } else if (command.contains("AddManySpices")) {

                int index = Integer.parseInt(command.split(" ")[1]);
                String spices = command.split(" ")[2];
                List<String> manySpices = Arrays.stream(spices.split("\\|")).collect(Collectors.toList());

                for (int i = 0; i < manySpices.size(); i++) {
                    String currentSpice = manySpices.get(i);
                    if (!spiceList.contains(currentSpice)) {
                        toAdd.add(currentSpice);
                    }
                }
                spiceList.addAll(index, toAdd);

            } else if (command.contains("SwapSpices")) {
                String spiceOne = token[1];
                String spiceTwo = token[2];
                if (spiceList.contains(spiceOne)) {
                    int index1 = spiceList.indexOf(spiceOne);
                    spiceList.set(index1, spiceTwo);

                    int index2 = spiceList.indexOf(spiceTwo);
                    spiceList.set(index2, spiceOne);
                }

            } else if (command.contains("ThrowAwaySpices")) {
                String spice = token[1];
                int removeN = Integer.parseInt(token[2]);
                int startIndex = spiceList.indexOf(spice);
                for (int i = startIndex; i < startIndex + removeN; i++) {
                    String currentSpice = spiceList.get(startIndex);
                    if (spiceList.contains(currentSpice)) {

                        spiceList.remove(currentSpice);
                    }
                }

            } else if (command.contains("Arrange")) {
                Collections.sort(spiceList);

            }
            command = scanner.nextLine();
        }
        for (String spice : spiceList) {
            System.out.print(spice + " ");
        }
    }
}
