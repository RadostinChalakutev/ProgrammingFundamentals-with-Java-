package P03Arrays.Labs;

import java.util.Arrays;
import java.util.Scanner;

public class EvenandOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[]numbersArr= Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int evenSum=0;
        int oddSum=0;

        for (int i = 0; i <numbersArr.length ; i++) {
            int currentElements=numbersArr[i];
            if (currentElements%2 ==0){ //znachi e even i dobawqme stojnostta kum evenSum
                evenSum+=currentElements;
            }else {
                oddSum+=currentElements;

            }
        }
        System.out.println(evenSum-oddSum);
    }
}
