package P06ExamPreparationMidTest;

import java.util.Scanner;

public class Problem1SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstEmployee=Integer.parseInt(scanner.nextLine());
        int secondEmployee=Integer.parseInt(scanner.nextLine());
        int thirdEmployee=Integer.parseInt(scanner.nextLine());
        int studentsCount= Integer.parseInt(scanner.nextLine());
        int hourCounter=0;
        int answerPerHour=firstEmployee+secondEmployee+thirdEmployee;
        while(studentsCount>0) {
            studentsCount -= answerPerHour;

            hourCounter++;
            if (hourCounter%4==0){
                hourCounter++;
            }
        }
        System.out.println("Time needed: "+hourCounter + "h.");
    }
}
