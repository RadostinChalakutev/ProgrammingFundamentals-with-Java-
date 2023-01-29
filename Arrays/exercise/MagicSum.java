package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[]numbersArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int equalNumber=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <=numbersArr.length-1 ; i++) {
            int firstNum=numbersArr[i];
            for (int j = i+1; j <=numbersArr.length-1 ; j++) {
                int secondNum=numbersArr[j];

                int sum=firstNum+secondNum;

                if (sum==equalNumber){
                    System.out.println(firstNum+" "+secondNum);

                }

            }
            
        }
    }
}
