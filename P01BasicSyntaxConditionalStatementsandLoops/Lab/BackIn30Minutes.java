package P01BasicSyntaxConditionalStatementsandLoops.Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initHours = Integer.parseInt(scanner.nextLine());
        int initMinutes = Integer.parseInt(scanner.nextLine());
        int allMinutes = (initHours * 60) + initMinutes + 30;
        int hours = allMinutes / 60;
        int minutes = allMinutes % 60;

        if (hours > 23) {
            hours = 0;
        }
        System.out.printf("%d:%02d",hours,minutes);


    }
}
