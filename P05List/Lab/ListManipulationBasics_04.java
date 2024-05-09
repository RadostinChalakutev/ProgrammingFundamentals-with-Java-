package P05List.Lab;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ListManipulationBasics_04 {
    ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.прочитане на лист с числа от конзолата
        List<Integer> numbers = (Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        //2.въвеждане на команди, докато не се получи "End"
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            //3. проверяваме дали командата e равна на исканите команди и изпълняваме съответните действия

            if (command.contains("Add")) {
                int elementToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(elementToAdd);
            } else if (command.contains("RemoveAt")) {
                String elementswithText = command.split(" ")[0];
                int elementToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(elementToRemove);
                //  Remove {number}: remove a number from the list

            } else if (command.contains("Remove")) {
                int elementToRemoveAt = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(elementToRemoveAt));
            } else if (command.contains("Insert")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbers.add(index, number);

            }


            command = scanner.nextLine();

        }
        for (int number : numbers) {
            System.out.print(number + " ");

        }

    }
}



