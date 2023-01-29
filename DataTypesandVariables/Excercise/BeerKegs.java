package DataTypesandVariables.Excercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kegsCount = Integer.parseInt(scanner.nextLine());
        String biggestKegModel=" ";
        double biggestKegVolume=0;

       while(kegsCount>0){
           String currentModel=scanner.nextLine();
           double radius=Double.parseDouble(scanner.nextLine());
           int height=Integer.parseInt(scanner.nextLine());
           double currentVolume=Math.PI*radius*radius*height;

           if (currentVolume>biggestKegVolume){
               biggestKegVolume=currentVolume;
               biggestKegModel=currentModel;
           }
           kegsCount--;
        }
        System.out.println(biggestKegModel);
    }
}
