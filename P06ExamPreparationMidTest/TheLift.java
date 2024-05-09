package P06ExamPreparationMidTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        List<Integer> liftState = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int wagon = 0; wagon <=liftState.size()-1 ; wagon++) {

            if (waitingPeople>0){
                int currentWagon=liftState.get(wagon);//1 wagon 2wagon 3wagon ...
                while(liftState.get(wagon)<4){
                    if (waitingPeople<=0){
                        break;
                    }
                    currentWagon++;
                    liftState.set(wagon,currentWagon);
                    waitingPeople--;

                }
                if (waitingPeople<=0&&liftState.get(liftState.size()-1)<4){
                    System.out.println("The lift has empty spots!");
                } else if (waitingPeople>0) {
                    System.out.printf("There isn't enough space! %d people in a queue!",waitingPeople);
                    
                }
                System.out.println(liftState.toString()
                        .replace("[","")
                        .replace("]","")
                        .replace(",",""));
            }

            
        }
    }
}
