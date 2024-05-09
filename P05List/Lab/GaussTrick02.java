package P05List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer>modifiedNumbers=Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sizeList=modifiedNumbers.size();
        for (int i = 0; i <sizeList/2; i++) {
            int firstNum=modifiedNumbers.get(i);
            int secondNum=modifiedNumbers.get(modifiedNumbers.size()-1);

            modifiedNumbers.set(i,firstNum+secondNum);

            modifiedNumbers.remove(modifiedNumbers.size()-1);
        }
        for (int elements:modifiedNumbers) {
            System.out.print(elements+ " ");
        }
    }
}

