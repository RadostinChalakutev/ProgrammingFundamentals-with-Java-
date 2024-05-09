package P11TextProcessing.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2RepeatString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] wordsArr=scanner.nextLine().split(" "); //hi abc add
        List<String> resultList=new ArrayList<>();

        for (int i = 0; i < wordsArr.length ; i++) {
            String currentWord=wordsArr[i]; //"hi"
            int length=currentWord.length();
            String repeatWords=getResult(length,currentWord);
            resultList.add(repeatWords);
        }
        System.out.println(String.join("",resultList));

    }
    public static String getResult(int count, String word){
        String result="";
        for (int i = 0; i <count ; i++) {
            result=result+word;

        }
        return result;
    }
}
