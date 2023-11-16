package RegularExpressions.Lab;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1MatchFullName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String regex="\\b[A-Z][a-z]+ [A-Z][a-z]+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);

        while(matcher.find()){
            String fullName=matcher.group();
            System.out.print(fullName+ " ");
        }
    }
}
