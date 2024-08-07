package P03Arrays.moreExcercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortandPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLength = Integer.parseInt(scanner.nextLine());

        String vowels = "AaEeOoIiUu";

        String[] sequenceOfStrings = new String[arrLength];
        int[] valueOfString = new int[arrLength];


        for (int i = 0; i < sequenceOfStrings.length; i++) {
            sequenceOfStrings[i] = scanner.nextLine();
            int sumVowels = 0;
            int sumCons = 0;
            char[] charArr = sequenceOfStrings[i].toCharArray();

            for (char index : charArr) {

                if (vowels.contains(String.valueOf(index))) {
                    sumVowels += (int) index * sequenceOfStrings[i].length();
                } else {
                    sumCons += ((int) index / sequenceOfStrings[i].length());
                }
            }
            int stringNum=sumVowels+sumCons;
            valueOfString[i]=stringNum;
        }
        Arrays.sort(valueOfString);
        for (int value:valueOfString){
            System.out.println(value);
        }
    }
}
