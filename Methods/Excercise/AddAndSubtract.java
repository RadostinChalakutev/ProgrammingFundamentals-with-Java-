package Methods.Excercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());

        int third = Integer.parseInt(scanner.nextLine());
        Add(first,third);
    }

    public static int Add(int first,  int third) {


         int AddSum = first + third;
        int subtractSum=AddSum-third;

        System.out.println(subtractSum);
        return subtractSum;

    }

}



