package TextProcessing.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       String input=scanner.nextLine();

       while(!input.equals("end")){
        String reversedText="";
           for (int i = input.length()-1; i >=0; i--) {
               char currentSymbol=input.charAt(i);
               reversedText=reversedText+currentSymbol;


           }
           System.out.printf("%s = %s%n",input,reversedText);
           input=scanner.nextLine();
       }

    }
}
