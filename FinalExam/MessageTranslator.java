package FinalExam;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "([!])(?<command>[A-Z][a-z]{2,})\\1([:])([\\[])(?<message>[A-Za-z]{8,})([\\]])";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            //1. създаваме regex
            //2. създаваме matcher
            //3. ако текста е валиден-> принтираме
            //ако не е валиден->
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String command = matcher.group("command");
                String message = matcher.group("message");
                System.out.print(command+":");

                for (int ch:message.toCharArray()) {

                    System.out.print(" " +ch);

                }
            } else {
                System.out.println("The message is invalid");
            }
        }
    }

}

