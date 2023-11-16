package ObjectAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P6Students2 {
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

        public void setAges(String ages) {
            this.ages = ages;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
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


            if (isStudentExisted(listName, firstName, lastName)) {
                int index=isExistingIndex(listName,firstName,lastName);
                listName.get(index).setAges(ages);
                listName.get(index).setHometown(hometown);
            }else{
                Student currentStudent=new Student(firstName,lastName,ages,hometown);
                listName.add(currentStudent);
            }
            input = scanner.nextLine();
        }
        String hometown=scanner.nextLine();
        for (Student student:listName) {
            if (hometown.equals(student.getHometown())){
                System.out.printf("%s %s is %s years old%n",student.getFirstName(),student.getLastName(),student.getAges());
            }
        }
    }

    public static int isExistingIndex(List<Student> listName, String firstName, String lastName) {
        int index = -1;
        for (int i = 0; i < listName.size(); i++) {
            Student student = listName.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                index = i;
            }
        }
        return index;
    }

    public static boolean isStudentExisted(List<Student> listName, String firstName, String lastName) {
        for (Student student : listName) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
}
