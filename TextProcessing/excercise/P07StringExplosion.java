package TextProcessing.excercise;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input String-> abv>1>1>2>2asdasd
        String textInput = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(textInput);
        int totalStrength=0;
        for (int position = 0; position <= textBuilder.length() - 1; position++) {
            char currentSymbol = textBuilder.charAt(position);
            if (currentSymbol == '>') {//explosion
                int explosionStrength = Integer.parseInt(textBuilder.charAt(position+1) + "");
                totalStrength += explosionStrength;
            } else if (currentSymbol !='>'&& totalStrength>0) {
                textBuilder.deleteCharAt(position);
                totalStrength--;
                position--;
            }
        }
        System.out.println(textBuilder);
    }
}