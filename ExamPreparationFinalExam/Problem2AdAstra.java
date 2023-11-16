package ExamPreparationFinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "\"(?<symbols>[#\\|])(?<name>[A-za-z\\s]+)(\\1)(?<date>[0-9]{2}[\\/][0-9]{2}[\\/]" +
                "[0-9]{2})(\\1)(?<calories>[\\d]{1,5})(\\1)\"";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        //1. проверяваме дали са във валиден формат
        //2. събираме calories на всички валидни храни в Map
        // 3.правим Map, в който да съхраняваме валидните храни заедно с тяхното име и срок на годност
        // 4. пресмятаме калориите на всички валидни храни
        //5. общ брой калории/2000-> брой дни, които ще издържим с тези храни

        List<String> items = new LinkedList<>();
        int sumOfCalories = 0;
        while (matcher.find()) {
            String foodName = matcher.group("food");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            sumOfCalories += calories;


            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d", foodName, date, calories));
        }

        System.out.printf("You have food to last you for: %d days!%n", sumOfCalories / 2000);
        items.forEach(System.out::println);

    }
}

