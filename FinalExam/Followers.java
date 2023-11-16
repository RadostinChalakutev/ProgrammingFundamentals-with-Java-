package FinalExam;

import java.util.*;

public class Followers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command =scanner.nextLine();
        Map<String, List<Integer>>infoMap = new LinkedHashMap<>();


        while(!command.equals("Log out")){
            String[]commandData =command.split(":");
            if (command.contains("New follower")){
                String username = commandData[1];
                infoMap.put(username,new ArrayList<>());
            } else if (command.contains("Like")) {
                String username = commandData[1];
               int number =Integer.parseInt(commandData[2]);
                infoMap.get(username).add(number,0);
            }


            command =scanner.nextLine();
        }
    }
}
