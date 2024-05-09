package P08ObjectAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5Students {
    static class Student {
        String firstName;
        String lastName;
        String ages;
        String hometown;


        public Student(String firstName, String lastName, String ages, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.ages = ages;
            this.hometown = hometown;

        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAges() {
            return this.ages;
        }

        public String getHometown() {
            return this.hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> listName = new ArrayList<>();
        while (!input.equals("end")) {
            String[] commandData = input.split(" ");
            String firstName = commandData[0];
            String lastName = commandData[1];
            String ages = commandData[2];
            String hometown = commandData[3];


            Student currentStudents = new Student(firstName, lastName, ages, hometown);
            listName.add(currentStudents);


            input = scanner.nextLine();
        }
        String hometown=scanner.nextLine();
        for (Student student:listName) {
            if (hometown.equals(student.getHometown())){
                System.out.printf("%s %s is %s years old%n",student.getFirstName(),student.getLastName(),student.getAges());
            }
        }

    }
}