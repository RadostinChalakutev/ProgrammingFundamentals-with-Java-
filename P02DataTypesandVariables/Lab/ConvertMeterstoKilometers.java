package P02DataTypesandVariables.Lab;

import java.util.Scanner;

public class ConvertMeterstoKilometers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double meters=Double.parseDouble(scanner.nextLine());
        double km=meters/1000;
        System.out.printf("%.2f",Math.abs(km));
    }
}
