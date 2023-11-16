package MapsLambdaandStreamAPI.excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String,String> registeredPersonMap=new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {
            String command = scanner.nextLine();

            if (command.startsWith("register")) {
                String username = command.split(" ")[1];
                String licensePlateNumber = command.split(" ")[2];
                if (registeredPersonMap.containsKey(username)) {
                    System.out.println(String.format("ERROR: already registered with plate number %s", licensePlateNumber));

                } else {
                    registeredPersonMap.put(username, licensePlateNumber);
                    System.out.println(String.format("%s registered %s successfully", username, licensePlateNumber));
                }


            } else if (command.startsWith("unregister")) {
                String username = command.split(" ")[1];

                if (!registeredPersonMap.containsKey(username)) {
                    System.out.println(String.format(" ERROR: user %s not found", username));
                } else {
                    registeredPersonMap.remove(username);
                    System.out.println(String.format("%s unregistered successfully", username));
                }

            }

        }
        registeredPersonMap.forEach((key, value) ->
                System.out.println(String.format("%s => %s", key, value)));


    }
}

