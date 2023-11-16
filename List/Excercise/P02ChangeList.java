package List.Excercise;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>numbers=Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command=scanner.nextLine();

        while(!command.equals("end")){
            if (command.contains("Delete")){
                int elements=Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(elements));

            }else {
                int element =Integer.parseInt(command.split(" ")[1]);
                int index=Integer.parseInt(command.split(" ")[2]);
                numbers.add(index,element);
            }
            command=scanner.nextLine();
        }


            //Delete {element} - delete all elements in the array which are equal to the given element
            // Insert {element} {position} - insert element at the given position
        for (int number:numbers) {
            System.out.print(number+" ");

        }
    }
}
