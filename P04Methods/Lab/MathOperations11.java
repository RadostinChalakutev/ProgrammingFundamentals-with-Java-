package P04Methods.Lab;

import java.util.Scanner;

public class MathOperations11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double firstNum=Double.parseDouble(scanner.nextLine());
        char operator=scanner.nextLine().charAt(0);
        double secondNum=Double.parseDouble(scanner.nextLine());

        switch (operator){ //  / ;+ ;- ;* ;
            case '/':
                System.out.printf("%.0f",divide(firstNum,secondNum));
                break;
            case '*':
                System.out.printf("%.0f",multiply(firstNum,secondNum));
                break;
            case '+':
                System.out.printf("%.0f",add(firstNum,secondNum));
                break;
            case '-':
                System.out.printf("%.0f",subtract(firstNum,secondNum));
                break;
        }
    }
    public static double divide(double a,double b){
       double result =0.0;

       result=a/b;
        return result;
    }
    public static double multiply(double a,double b){
        double result=0.0;
        result=a*b;
        return result;
    }
    public static double subtract(double a,double b){
        double result=0.0;
        result=a-b;
        return result;
    }
    public static double add (double a, double b){
        double result=0.0;
        result=a+b;
        return result;
    }
}
