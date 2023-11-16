package List.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String[]specialCharacters=scanner.nextLine().split(" ");

       String bombNumber=specialCharacters[0];
       int power=Integer.parseInt(specialCharacters[1]);

        while (numbers.contains(bombNumber)) {

            int numberIndex=numbers.indexOf(bombNumber);
            int leftNum=Math.max(0,numberIndex-power);
            int rightNum=Math.min(numberIndex+power,numbers.size()-1);

            for (int i = rightNum; i >=leftNum ; i--) {
                numbers.remove(i);
                
            }
        }
        System.out.println(numbers.stream().mapToInt(Integer::parseInt).sum());


    }
}
