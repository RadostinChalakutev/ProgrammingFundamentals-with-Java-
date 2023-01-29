package Arrays.Labs;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scanner.nextLine().
                        split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().
                        split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int diffElements=-1;
        boolean isDiff=true;

        for (int i = 0; i < firstArr.length; i++) {
            int firstNum = firstArr[i];
            int secondNum = secondArr[i];

            if (firstNum == secondNum) {
                sum+=firstNum;


            }else {
                diffElements=i;
                isDiff=false;
                break;

            }
        }
        if (isDiff){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",diffElements);
        }

    }
}
