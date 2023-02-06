package Methods.Lab;

import java.util.Scanner;

public class CalculateRectangleArea06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum =Double.parseDouble(scanner.nextLine());
       double secondNum = Double.parseDouble(scanner.nextLine());
       double area=getRectangleArea(firstNum,secondNum);
        System.out.printf("%.0f",area);
    }
    public static double getRectangleArea(double a, double b) {
        return a*b;


    }

}
