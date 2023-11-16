package RegularExpressions.Excercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listOfRacersNames = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        //regex for letter
        String letterRegex = "[A-Za-z]";
        String decimalRegex = "[0-9]";
        Pattern letterPattern = Pattern.compile(letterRegex);
        Pattern decimalPattern = Pattern.compile(decimalRegex);


        Map<String, Integer> racersAndDistanceMap = new LinkedHashMap<>();
        listOfRacersNames.forEach(racer -> racersAndDistanceMap.put(racer, 0));
        while (!input.equals("end of race")) {
            Matcher letterMatcher = letterPattern.matcher(input);
            Matcher decimalMatcher = decimalPattern.matcher(input);
            StringBuilder nameBuilder = new StringBuilder();


            while (letterMatcher.find()) {
                nameBuilder.append(letterMatcher.group());
            }
            int distance = 0;
            while (decimalMatcher.find()) {
                distance += Integer.parseInt(decimalMatcher.group());
            }
            String racerName = nameBuilder.toString();

            if (listOfRacersNames.contains(racerName)) {
                int currentDistance = racersAndDistanceMap.get(racerName);
                racersAndDistanceMap.put(racerName, currentDistance + distance);
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i <racersAndDistanceMap.size() ; i++) {

            if (i==0){
                System.out.println("1st place: " +listOfRacersNames.get(i));
            } else if (i==1) {
                System.out.println("2nd place: "+listOfRacersNames.get(i));

            } else if (i==2) {
                System.out.println("3rd place: "+listOfRacersNames.get(i));

            }

        }
    }

}
