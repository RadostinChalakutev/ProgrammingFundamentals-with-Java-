package ObjectAndClasses.excercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P6OrderedByAge {
    public static class Person {
        String name;
        String ID;
        int age;

        public Person(String name,String ID,int age){
            this.name=name;
            this.ID=ID;
            this.age=age;
        }

        public String getName() {
            return this.name;
        }

        public String getID() {
            return this.ID;
        }

        public int getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandData = command.split(" ");
            String name = commandData[0];
            String ID = commandData[1];
            int age = Integer.parseInt(commandData[2]);
            Person currentPerson=new Person(name,ID,age);
            personList.add(currentPerson);
            command=scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person:personList) {
            System.out.printf("%s with ID: %s is %d years old.%n",person.getName(),person.getID(),person.getAge());
        }
    }
}
