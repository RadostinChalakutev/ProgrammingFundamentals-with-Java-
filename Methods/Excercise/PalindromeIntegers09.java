package Methods.Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number=scanner.next();//"123" число под формата на текст
        while (!number.equals("END")){
            //prowerka dali e palindrome -> String, който независимо от коя страна , се чете е едно и също
            if (isPalindrome(number)){
                System.out.println("true");

            }else {
                System.out.println("false");
            }



            number=scanner.next();
        }

    }
    public static boolean isPalindrome(String text){
        
        String reversedText="";

        for (int index = text.length()-1; index >=0 ; index--) {
            reversedText+=text.charAt(index);

        }


      return  text.equals(reversedText);
    }
}
