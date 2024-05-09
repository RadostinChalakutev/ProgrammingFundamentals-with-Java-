package P03Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]Array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <=Array.length-1 ; index++) {
            int currentElement=Array[index];
            int leftSum=0;
            int rightSum=0;
            for (int leftIndex = 0; leftIndex <index ; leftIndex++) {
                leftSum+=Array[leftIndex];
            }
            for (int rightIndex = index+1; rightIndex <=Array.length-1 ; rightIndex++) {
                rightSum+=Array[rightIndex];
            }

            if (rightSum==leftSum){
                System.out.println(index);
                return;
            }
        }
        System.out.println("no ");
    }
}
