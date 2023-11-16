package ExamPreparationMidTest;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int daysOfPlunder=Integer.parseInt(scanner.nextLine());
        int plunderPerDay=Integer.parseInt(scanner.nextLine());
        double expectedPlunder=Double.parseDouble(scanner.nextLine());
        double totalPLunders=0;

        for (int day = 1; day <=daysOfPlunder ; day++) {
            totalPLunders+=plunderPerDay;

            if (day%3==0){
                double extraPlunder=0.5*plunderPerDay;
                totalPLunders=totalPLunders+extraPlunder;
            }
            if (day%5==0){
              totalPLunders=totalPLunders-(totalPLunders*0.3);



            }
        }
        if (totalPLunders>=expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.",totalPLunders);
        }else{
            double percentage=(totalPLunders/expectedPlunder)*100;
            System.out.printf("Collected only %.2f%% of the plunder.",percentage);
        }

    }
}
