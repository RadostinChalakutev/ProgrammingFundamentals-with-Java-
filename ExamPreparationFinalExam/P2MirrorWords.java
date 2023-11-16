package ExamPreparationFinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2MirrorWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(#|@)(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        int counter = 0;
        List<String>validPairs = new ArrayList<>();

        while(matcher.find()){
            String firstWord = matcher.group("first");
            String secondWord = matcher.group("second");
            String secondTextReverted = new StringBuilder(secondWord).reverse().toString();
            counter++;//брояч на двойките
            //проверяваме дали е валидно условието първия
            // текст да е равен на втория в обърнат вариант


            if (secondTextReverted.equals(firstWord)){
                //ако е валидно ги добавяме към лист
                validPairs.add(firstWord+ " <=> " +secondWord);
            }
        }
        if (counter==0){
            System.out.println("No word pairs found!");//ако не намерим  двойки думи  в текста
        }else {
            System.out.println( counter+" word pairs found!");// брой на откритите  двойки думи
        }

        if (validPairs.size()==0){
            System.out.println("No mirror words!");
        }else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ",validPairs));
        }



    }
}
