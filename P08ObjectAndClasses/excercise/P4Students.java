package P08ObjectAndClasses.excercise;

import java.util.*;

public class P4Students {

    public static  class Student{
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName,String lastName,double grade){
            this.firstName=firstName;
            this.lastName=lastName;
            this.grade=grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public double getGrade() {
            return this.grade;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Student>studentList=new ArrayList<>();
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String command=scanner.nextLine();
            String[]commandData=command.split("\\s+");
            String firstName=commandData[0];
            String lastName=commandData[1];
            double grade=Double.parseDouble(commandData[2]);
            Student currentStudent=new Student(firstName,lastName,grade);
            studentList.add(currentStudent);

        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student:studentList) {
            System.out.printf("%s %s: %.2f%n",student.getFirstName(),student.getLastName(),student.getGrade());

        }
    }

}
