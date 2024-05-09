package P05List.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesandReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer>numbers= new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList()));
        numbers.removeIf(n->n<0);
        Collections.reverse(numbers);


        if (numbers.isEmpty()){
            System.out.println("empty");
        }else {
            for (int number:numbers) {
                System.out.print(number+" ");
            }
        }
    }
}
