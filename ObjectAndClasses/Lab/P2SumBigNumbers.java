package ObjectAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class P2SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BigInteger firstNum=new BigInteger(scanner.nextLine());
        BigInteger secondNum= new BigInteger(scanner.nextLine());

        BigInteger sum=firstNum.add(secondNum);
        System.out.println(sum);

    }
}
