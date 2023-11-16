package ObjectAndClasses.Lab;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class P1RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        String[] wordRandom=input.split(" ");
        Random randomGenerator=new Random();

        for (int i = 0; i <wordRandom.length ; i++) {
            int indexX=randomGenerator.nextInt(wordRandom.length);
            int indexY=randomGenerator.nextInt(wordRandom.length);

            String oldWordX=wordRandom[indexX];
            wordRandom[indexX]=wordRandom[indexY];
            wordRandom[indexY]=oldWordX;
        }
        System.out.println(String.join(System.lineSeparator(),wordRandom));

    }
}
