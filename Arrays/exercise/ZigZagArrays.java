package Arrays.exercise;

import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[] firstArr=new int[n];
        int []secondArr=new int[n];

        for (int i = 0; i <n; i++) {
            String[]currNum=scanner.nextLine().split(" ");

            //ako index-> chetno chislo(i%2==0)
            if (i%2==0){
                firstArr[i]=Integer.parseInt(currNum[0]);
                secondArr[i]=Integer.parseInt(currNum[1]);

            }else {
                firstArr[i]=Integer.parseInt(currNum[1]);
                secondArr[i]=Integer.parseInt(currNum[0]);
                
            }
            }
        for (int j = 0; j <firstArr.length ; j++) {// za purviq array-> print all of the string in the Array
            int firstArrNumber=firstArr[j];
            System.out.print(firstArrNumber+" ");

        }
        System.out.println();
        for (int i = 0; i <secondArr.length ; i++) {
           int secondArrNumber=secondArr[i];
            System.out.print(secondArrNumber+ " ");

        }

    }
}
