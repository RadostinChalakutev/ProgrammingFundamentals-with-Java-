package TextProcessing.excercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigInteger firsNumber=new BigInteger(scanner.nextLine());
        BigInteger secondNumber=new BigInteger(scanner.nextLine());

        System.out.println(firsNumber.multiply(secondNumber));

    }
}
