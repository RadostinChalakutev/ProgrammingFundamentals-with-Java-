package ObjectAndClasses.excercise;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P3OpinionPoll {
    public static class Person{
        String name;
        String age;

        public Person(String name,String age){
            this.name=name;
            this.age=age;
        }
        public String getName(){
            return this.name;
        }
        public String getAge(){
            return this.age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Person> personList=new ArrayList<>();
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String command=scanner.nextLine();
            String[]commandData=command.split(" ");
            String name=commandData[0];
            int age=Integer.parseInt(commandData[1]);
            Person currentPerson= new Person(name, String.valueOf(age));

            if (age>30){
                personList.add(currentPerson);

            }
        }
        for (Person person:personList) {
            System.out.println(person.getName()+" - "+person.getAge());
        }
    }
}
