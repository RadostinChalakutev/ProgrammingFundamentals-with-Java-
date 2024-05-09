package P04Methods.Excercise;

import java.util.Scanner;

public class FactorialDivision08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber=Double.parseDouble(scanner.nextLine());
        double secondNumber=Double.parseDouble(scanner.nextLine());
        double firstFactorial = getFirstFactorial(firstNumber);
        double secondFactorial = getSecondFactorial(secondNumber);

        double dividing=firstFactorial/secondFactorial;
        System.out.printf("%.2f",dividing);




    }

    public static double getFirstFactorial  (double number1) {
         double  factorial1=1;

        for (double i = 1; i <= number1; i++) {
            factorial1 = factorial1 * i;

        }
        return factorial1;
    }

    public static double getSecondFactorial(double number2 ) {
        double factorial2=1;
        for (int i = 1; i <= number2; i++) {
            factorial2 = factorial2 * i;

        }
        return factorial2;

    }
}
