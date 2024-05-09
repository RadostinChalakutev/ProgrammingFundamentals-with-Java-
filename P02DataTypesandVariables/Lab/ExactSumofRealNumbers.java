package P02DataTypesandVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumofRealNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        BigDecimal allSum=new BigDecimal(0);
        for (int i = 0; i <num ; i++) {
            BigDecimal currentNum=new BigDecimal(scanner.nextLine());
            allSum=allSum.add(currentNum);
        }
        System.out.println(allSum);

    }
}
