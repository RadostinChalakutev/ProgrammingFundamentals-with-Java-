package P09MapsLambdaandStreamAPI.excercise;

import java.util.*;

public class P8CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, ArrayList<String>> data = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String[] token = input.split(" -> ");

            List<String> currentEmployee = data.get(token[0]);
            boolean containsID = currentEmployee != null && currentEmployee.contains(token[1]);

            if (!containsID) {
                data.putIfAbsent(token[0], new ArrayList<>());
                data.get(token[0]).add(token[1]);
            }


            input = scanner.nextLine();
        }

       data.entrySet().stream().forEach(entry-> {
           System.out.printf("%s%n",entry.getKey());
           entry.getValue().forEach(e-> System.out.printf("-- %s%n",e));
       });

    }
}
