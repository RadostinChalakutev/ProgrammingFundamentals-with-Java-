package DataTypesandVariables.Excercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int total = 0;//kolko woda izhwyrlqme


        int tankCapacity = 255;
        for (int i = 1; i <= numberOfLines; i++) {
            int pourWater = Integer.parseInt(scanner.nextLine());
            total = total + pourWater;
            //izhwurlqne na woda
            if (total>tankCapacity) {//ako 255 e po-malko ili ravno na sumata na izhwurlenata woda togava printirame
                System.out.println("Insufficient capacity!");
                total-=pourWater;
            }

            if (numberOfLines==i){
                System.out.println(total);

            }




        }
    }
}
