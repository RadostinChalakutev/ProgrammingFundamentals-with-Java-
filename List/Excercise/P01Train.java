package List.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfWagons = (Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String output = scanner.nextLine();

        while (!output.equals("end")) {
            String[] commandData = output.split(" ");
            if (commandData[0].equals("Add")) {
                int passangers = Integer.parseInt(commandData[1]);
                listOfWagons.add(passangers);

            } else {
                int passengersToAdd = Integer.parseInt(commandData[0]);
                for (int index = 0; index < listOfWagons.size(); index++) {
                    int currentWagon = listOfWagons.get(index);
                    if (currentWagon + passengersToAdd <= maxCapacity) {
                        listOfWagons.set(index, currentWagon + passengersToAdd);


                        break;
                    }

                }
            }


            output = scanner.nextLine();
        }
        for (int listOfWagon : listOfWagons) {
            System.out.print(listOfWagon+" ");

        }
    }
}
