package P11TextProcessing.excercise;

import java.util.Scanner;

public class P3ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int lastIndex=input.lastIndexOf("\\");
        String fullName=input.substring(lastIndex+1);

        int indexPoint=fullName.indexOf(".");
        String fileName=fullName.substring(0,indexPoint);
        String fileExtension=fullName.substring(indexPoint+1);

        System.out.println("File name: "+fileName);
        System.out.println("File extension: "+fileExtension);







    }


}

