package P04Methods.Lab;

import java.util.Scanner;

public class RepeatString07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        int count=Integer.parseInt(scanner.nextLine());
        getString(input,count);
    }
    public static void getString(String any,int end){
        for (int i = 0; i <end ; i++) {
            System.out.print(any);

        }
    }
}
