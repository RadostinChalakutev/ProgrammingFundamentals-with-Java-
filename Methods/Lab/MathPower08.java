package Methods.Lab;

import javax.swing.plaf.synth.SynthStyle;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double input=Double.parseDouble(scanner.nextLine());
        int count=Integer.parseInt(scanner.nextLine());


        mathPower(input,count);
        System.out.println(new DecimalFormat("0.####").format(mathPower(input,count)));


    }
    public static double mathPower(double number,int power){

        double result=Math.pow(number,power);

        return result;

    }
}
