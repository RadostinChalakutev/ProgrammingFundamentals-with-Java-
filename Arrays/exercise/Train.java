package Arrays.exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countOfWagon=Integer.parseInt(scanner.nextLine());
        int sum=0;

        for (int i = 0; i <countOfWagon ; i++) {
            int currentNum=Integer.parseInt(scanner.nextLine());
            sum+=currentNum;
            System.out.print(currentNum+ " ");

        }
        System.out.println();
        System.out.println(sum);
    }
}
