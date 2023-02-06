package Methods.Excercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Matrix(n);

    }
    public static void Matrix(int number){
        for (int i = 0; i <number ; i++) {
            for (int j = 0; j <number ; j++) {
                System.out.print(number+ " ");

            }
            System.out.println();
            
        }

    }
}
