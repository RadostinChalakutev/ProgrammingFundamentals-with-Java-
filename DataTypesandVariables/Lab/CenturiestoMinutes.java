package DataTypesandVariables.Lab;

import java.util.Scanner;

public class CenturiestoMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
        double year = 100 * centuries;
        double days = year * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", centuries, year,
                days, hours, minutes);
    }
}
