package P10RegularExpressions.Excercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P3SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);

        double totalPrice = 0.0;
        double sum = 0.0;


        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                double count = Double.parseDouble(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                sum = count * price;
                totalPrice += sum;
                System.out.printf("%s: %s - %.2f%n",name,product,sum);//George: Croissant - 20.60
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalPrice);
        //отпечатваме


    }
}
