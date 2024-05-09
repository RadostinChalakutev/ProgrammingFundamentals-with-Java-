package P02DataTypesandVariables.Excercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int courseElevator = Integer.parseInt(scanner.nextLine());
        int fullCourses = numberOfPeople / courseElevator;
        boolean remainder=numberOfPeople%courseElevator!=0;
        if (remainder){
            fullCourses+=1;

        }
        System.out.println(fullCourses);



    }
}
