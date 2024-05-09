package P04Methods.Excercise;

import java.util.Scanner;

public class VowelsCount02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int count=0;
        printVowelsCount(input,count);
    }
    public static void printVowelsCount(String text,int count){
        //a,o,e,i,A,O,E,I,U,u
        for (char symbol:text.toLowerCase().toCharArray()) {
            if (symbol=='a'
            || symbol=='o'
            || symbol=='e'
            ||symbol=='i'
            ||symbol=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
