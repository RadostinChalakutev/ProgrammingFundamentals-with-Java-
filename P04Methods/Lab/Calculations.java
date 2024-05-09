package P04Methods.Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command=scanner.nextLine();
        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());
        switch (command){ //"add", "multiply", "subtract", "divide
            case "add":
                add(firstNum,secondNum);
                break;
            case "multiply":
                multiply(firstNum,secondNum);
                break;
            case "subtract":
                subtract(firstNum,secondNum);
                break;
            case "divide":
                divide(firstNum,secondNum);
                break;

        }
    }
    public static void add(int n1,int n2){
        System.out.println(n1+n2);
    }
    public static void multiply(int m1,int m2){
        System.out.println(m1*m2);
    }
    public static void subtract(int s1,int s2){
        System.out.println(s1-s2);

    }
    public static void divide(int d1,int d2){
        System.out.println(d1/d2);
    }
}
