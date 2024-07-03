package P03Arrays.moreExcercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortandPrintArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbersOfArrays=Integer.parseInt(scanner.nextLine());
        int sum=0;


        for (int i = 0; i <numbersOfArrays ; i++) {
           String names=scanner.nextLine();
           String[] namesArr=names.split(" ");
            for (int j = 0; j < namesArr.length ; j++) {
                int value=Integer.parseInt(namesArr[i]);
                sum+=value;
            }


        }


    }
}
