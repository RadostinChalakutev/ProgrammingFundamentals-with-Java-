package ExamPreparationMidTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]   houses = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        int currentIndex = 0;
        while(!command.equals("Love")){
            String[] token = command.split("\\+s");
            int jumpLength = Integer.parseInt(token[1]);
            currentIndex+=jumpLength;
            if (currentIndex>=houses.length){
                currentIndex =0;
            }

            if (houses[currentIndex]!=0){
                houses[currentIndex]-=2;
                if (houses[currentIndex]==0){
                    System.out.printf("Place %d has Valentine's day.%n",currentIndex);
                }
            }else{
                System.out.printf("Place %d has Valentine's day.%n",currentIndex);
            }


            command=scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        boolean isSuccessful = true;
        for (int house : houses) {
            if (house != 0) {
                isSuccessful = false;
                break;
            }
        }
        int count = 0;
        for (int house : houses) {
            if (house != 0) {
                count++;
            }
        }
        if (isSuccessful) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", count);
        }
    }
}