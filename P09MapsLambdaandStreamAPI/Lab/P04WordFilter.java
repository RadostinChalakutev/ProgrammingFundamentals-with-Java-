package P09MapsLambdaandStreamAPI.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]words= Arrays.stream(scanner.nextLine().split(" "))
                .filter(w-> w.length() %2==0).toArray(String[]::new); //филтрираме по дължината на
                                                                     // думата от масива words

        for (String word:words) {
            System.out.println(word);
        }
    }
}
