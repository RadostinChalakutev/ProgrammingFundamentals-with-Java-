package P11TextProcessing.Lab;


import java.util.Scanner;

public class P4TextFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] bannedWords=scanner.nextLine().split(", ");
        String text=scanner.nextLine();
        for (String banWord:bannedWords) {
            text=text.replace(banWord, repeatString(banWord.length()));

        }
        System.out.println(text);
    }
    public static String repeatString(int n){
        String result="";
        for (int i = 0; i <n ; i++) {
            result+="*";
        }
        return result;
    }
}
