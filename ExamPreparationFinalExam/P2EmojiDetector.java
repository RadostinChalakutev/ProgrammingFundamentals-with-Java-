package ExamPreparationFinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        long coolTreshhold = 1;


        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {
                int number = Integer.parseInt(symbol + "");
                coolTreshhold *= number;

            }
        }
        System.out.println("Cool threshold: " + coolTreshhold);
        int emojiCounter = 0;
        String regex = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> coolEmojiList = new ArrayList<>();
        while (matcher.find()) {

            emojiCounter++;
            int coolLevelCurrentEmoji=0;
            String emoji = matcher.group("emoji");
            for (char symbol : emoji.toCharArray()) {
                coolLevelCurrentEmoji += (int) symbol;
            }
            if (coolLevelCurrentEmoji >= coolTreshhold) {
                coolEmojiList.add(matcher.group());

            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojiCounter);

        coolEmojiList.forEach(System.out::println);
    }
}
