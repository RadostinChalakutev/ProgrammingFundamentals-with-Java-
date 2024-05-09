package P10RegularExpressions.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03MatchDates {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String regex="\\b(?<date>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<years>\\d{4})\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        while(matcher.find()){

            String data=matcher.group("date");
            String month=matcher.group("month");
            String year=matcher.group("years");

            System.out.printf("Day: %s, Month: %s, Year: %s%n",data,month,year);
        }


    }
}
