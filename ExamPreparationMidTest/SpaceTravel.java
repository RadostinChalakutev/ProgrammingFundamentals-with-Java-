package ExamPreparationMidTest;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> commandList = Arrays.stream(scanner.nextLine().split("\\||s+")).collect(Collectors.toList());

        int amountOfFuel = Integer.parseInt(scanner.nextLine()); //starting amount of fuel
        int amountOfAmmunition = Integer.parseInt(scanner.nextLine()); // starting amount of ammunition

        for (String currentCommand : commandList) {
            String[] arrCommand = currentCommand.split(" ");
            String command = arrCommand[0];

            switch (command) {
                case "Travel" -> {
                    int currentFuel = 0;
                    int lightYears = Integer.parseInt(arrCommand[1]);
                    for (int i = 0; i < lightYears; i++) {
                        amountOfFuel--;

                    }
                    System.out.printf("The spaceship travelled %d light-years.%n", lightYears);
                }
                case "Enemy" -> {
                    int enemyArmor = Integer.parseInt(arrCommand[1]);
                    for (int i = 0; i < enemyArmor; i++) {
                        amountOfAmmunition--;
                    }
                    
                    if (amountOfAmmunition >= enemyArmor) {
                        System.out.printf("An enemy with %d armour is defeated.%n", enemyArmor);
                        //win
                    } else {
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", enemyArmor);

                        //run away
                    }
                }
                case "Repair" -> {
                    int addedFuelandArmor = Integer.parseInt(arrCommand[1]);
                    amountOfFuel = amountOfFuel + addedFuelandArmor;
                    int addedArmor = addedFuelandArmor * 2;
                    amountOfAmmunition = amountOfAmmunition + addedArmor;

                    System.out.printf("Ammunitions added: %d.%n", addedArmor);
                    System.out.printf("Fuel added: %d.%n", addedFuelandArmor);
                }
                case "Titan" -> {
                    if (amountOfAmmunition >= 0 && amountOfFuel >= 0) {
                        System.out.println("You have reached Titan, all passengers are safe.");
                    } else {
                        System.out.println("Mission failed");
                    }
                }
            }
        }
    }
}