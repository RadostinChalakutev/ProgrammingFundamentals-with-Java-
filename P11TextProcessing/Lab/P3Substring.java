package P11TextProcessing.Lab;

import java.util.Scanner;

public class P3Substring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String textToRemove=scanner.nextLine();
        String text=scanner.nextLine();
        int index=text.indexOf(textToRemove);
        while(index!=-1){
            text=text.replace(textToRemove, "");
            index=text.indexOf(textToRemove);

        }
        System.out.println(text);
    }
}
