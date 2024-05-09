package P09MapsLambdaandStreamAPI.excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        boolean isWin = false;
        Map<String, Integer> junks = new LinkedHashMap<>();
        while (!isWin) {
            String command = scanner.nextLine();
            String[] commandData = command.split(" ");

            for (int index = 0; index <= commandData.length - 1; index += 2) {// за да мога да си взема индексите
                int quantity = Integer.parseInt(commandData[index]);
                String material = commandData[index + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    //"shards: {numberOfShards} fragments: {numberOfFragments} motes: {numberOfMotes}"
                    int currentQuantity = materials.get(material);
                    materials.put(material, quantity + currentQuantity);

                } else {
                    // в случай, че е боклук
                    if (!junks.containsKey(material)) {
                        junks.put(material, quantity);
                    } else {
                        int currentQuantity = junks.get(material);
                        junks.put(material, quantity + currentQuantity);

                    }
                }
                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments")-250);
                    isWin = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes")-250);
                    isWin = true;
                    break;
                }
            }
            if (isWin){
                break;
            }
        }
       materials.entrySet().forEach(entry -> System.out.println(entry.getKey()+": " +entry.getValue()));
        junks.entrySet().forEach(entry-> System.out.println(entry.getKey() + ": " +entry.getValue()));

    }
}
