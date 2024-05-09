package P03Arrays.Labs;

import java.util.Scanner;

public class ReverseArrayToString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] symbol= scanner.nextLine().split(" ");
        for (int i = 0; i <symbol.length/2 ; i++) {
            String oldElements=symbol[i];
            symbol[i]= symbol[symbol.length-1-i];
            symbol[symbol.length-1-i]=oldElements;

        }
        System.out.printf(String.join(" ",symbol));


    }
}
