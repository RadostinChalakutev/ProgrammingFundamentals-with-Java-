package P09MapsLambdaandStreamAPI.excercise;

import java.util.*;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, ArrayList<String>> registeredUsersMap = new LinkedHashMap<>();
        while (!command.equals("end")) {
            String courseName = command.split(" : ")[0];
            String studentName = command.split(" : ")[1];

            if (!registeredUsersMap.containsKey(courseName)) {
                registeredUsersMap.put(courseName, new ArrayList<>());
            }

                registeredUsersMap.get(courseName).add(studentName);

            command = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> stringArrayListEntry : registeredUsersMap.entrySet()) {
            System.out.println(stringArrayListEntry.getKey()+": " + stringArrayListEntry.getValue().size());
            stringArrayListEntry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        }

    }
}
