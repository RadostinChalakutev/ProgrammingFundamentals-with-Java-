package ExamPreparationMidTest;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initEnergy = Integer.parseInt(scanner.nextLine());
        int totalEnergy = initEnergy;
        boolean isEnd=true;

        String command = scanner.nextLine();
        int wonBattlesCounter = 0;
        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);

           if (totalEnergy-distance<0){
              isEnd=false;
               break;
           }else {
               totalEnergy=totalEnergy-distance;
               wonBattlesCounter++;
               if (wonBattlesCounter%3==0){
                   totalEnergy+=wonBattlesCounter;
               }
           }

            command = scanner.nextLine();
        }
        if (!isEnd){
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",wonBattlesCounter,totalEnergy);
        }else {
            System.out.printf("Won battles: %d. Energy left: %d",wonBattlesCounter,totalEnergy);
        }

    }
}
