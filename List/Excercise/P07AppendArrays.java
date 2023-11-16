package List.Excercise;

import java.util.*;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> listOfNumbers= Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        //create a list[1 2 3 |4 5 6 | 7 8]
        Collections.reverse(listOfNumbers);//reverse the numbers[ 1 2 3 |4, 5, 6 | 7 8]
        //print the listOfNumbers
        System.out.println(listOfNumbers.toString().replace("[", " ")
                .replace("]"," ")
                .trim()
                .replaceAll(" ",",")
                .replaceAll("\\s+"," "));
    }
}
