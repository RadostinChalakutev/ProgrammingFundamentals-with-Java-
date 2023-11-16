package List.Lab;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer>list= (Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        String command=scanner.nextLine();

        //Contains {number} – check if the list contains the number. If yes,
        // print "Yes", otherwise, print "No such number"
        //Print even – print all the numbers that are even separated by a space
        //Print odd – print all the numbers that are oddly separated by a space
        //Get sum – print the sum of all the numbers
        //Filter {condition} {number} – print all the numbers that fulfill that condition.
        // The condition will be either '<', '>', ">=", "<=

        while(!command.equals("end")){
            if (command.startsWith("Contains")){
                int elementToAdd=Integer.parseInt(command.split(" ")[1]);
                printNumber(list,elementToAdd);
            } else if (command.equals("Print even")) {
                printEvenNumbers(list);
            } else if (command.equals("Print odd")) {
                printOddNumbers(list);
                
            } else if (command.equals("Get sum")) {
                getSum(list);
            } else if (command.startsWith("Filter")) {
                String condition=command.split(" ")[1];
                int numberToFilter=Integer.parseInt(command.split(" ")[2]);
                printFilteredNumbers(list,condition,numberToFilter);
            }
            command=scanner.nextLine();
        }
        System.out.println();
    }
    public static void printNumber(List<Integer> numbers,int numbersToCheck){
        //check if the list contains the number. If yes, print "Yes", otherwise, print "No such number"
        if (numbers.contains(numbersToCheck)){
            System.out.println("Yes");
        }else {
            System.out.println("No such number");
        }

    }
    public static void printEvenNumbers(List<Integer>numbers){
       //print all the numbers that are even separated by a space

        for (int checkedNumber: numbers) {
            if (checkedNumber%2==0){
                System.out.print(checkedNumber +" ");
            }
        }
        System.out.println();
    }
    public static void printOddNumbers(List<Integer>numbers){
        for (int checkedNUmbers:numbers) {
            if (checkedNUmbers%2!=0){
                System.out.print(checkedNUmbers+ " ");
            }
        }
        System.out.println();
    }
    public static void getSum(List<Integer>numbers){
        int sum=0;
        for (int number:numbers ) {
            sum+=number;
        }
        System.out.println(sum);
    }
    public static void printFilteredNumbers(List<Integer>numbers,String condition,int numberToFilter){
        //condition <,>,<=,>=
        switch (condition){
            case "<":
                for (int number:numbers) {
                    if (number<numberToFilter){
                        System.out.print(number+" ");
                    }
                }
                break;
            case ">":
                //отпечатваме всички числа от списъка numbers>numbersToFilter
                for (int number:numbers) {
                    if (number>numberToFilter){
                        System.out.print(number+ " " );
                    }
                }
                break;
            case "<=":
                for (int number:numbers) {
                    if (number<=numberToFilter){
                        System.out.print(number+ " ");
                    }
                }
                break;
            case ">=":
                for (int number:numbers) {
                    if (number>=numberToFilter){
                        System.out.print(number+ " ");
                    }
                }
                break;
        }
        System.out.println();
    }
}
