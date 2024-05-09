package P11TextProcessing.excercise;

import java.util.Scanner;

public class P2CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        String firstWord = data[0];
        String secondWord = data[1];

        int minLength = Math.min(firstWord.length(), secondWord.length());
        int maxLength = Math.max(firstWord.length(), secondWord.length());
        int sum = 0;

        for (int index = 0; index < minLength; index++) {
            sum += firstWord.charAt(index) * secondWord.charAt(index);
        }
        if (minLength == maxLength) {
            System.out.println(sum);
            return;
        }
        sum=string1(firstWord,maxLength,minLength,secondWord,sum);
        System.out.println(sum);
    }

    public static int string1(String firstWord, int maxLength, int minLength, String secondWord,int sum) {

        if (maxLength == firstWord.length()) {
            //първия текст ми е по-дълъг -> взимам останалите символи
            for (int index = minLength; index < firstWord.length(); index++) {
                sum += firstWord.charAt(index);
            }
        } else {
            //втория текст ми е по-дълъг -> взимам останали символи
            for (int index = minLength; index < secondWord.length(); index++) {
                sum += secondWord.charAt(index);
            }
        }
        return sum;
    }
}
