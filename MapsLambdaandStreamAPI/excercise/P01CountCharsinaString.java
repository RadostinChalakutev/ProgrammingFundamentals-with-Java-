package MapsLambdaandStreamAPI.excercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Map<Character, Integer> characterCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if (symbol == ' '){
                continue;
            }

            if (characterCount.containsKey(symbol)){
                int currentCount = characterCount.get(symbol);
                characterCount.put(symbol, currentCount+1);

            }else{
                characterCount.put(symbol, 1);

            }
        }
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            System.out.println(entry.getKey()+ " -> " + entry.getValue());
        }

    }
}
