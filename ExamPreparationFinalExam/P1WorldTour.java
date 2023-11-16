package ExamPreparationFinalExam;

import java.util.Scanner;

public class P1WorldTour {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String allStop = scanner.nextLine();
        String input=scanner.nextLine();//Hawai::Cyprys-Greece
        StringBuilder stopsBuilder = new StringBuilder(allStop);


        while(!input.equals("Travel")){

            if (input.contains("Add Stop")){
                int index = Integer.parseInt(input.split(":")[1]);
                String addedStop = input.split(":")[2];

                if(isValid(index,stopsBuilder)){
                    stopsBuilder.insert(index,addedStop);
                }
            } else if (input.contains("Remove Stop")) {//Remove Stop:11:16
                int startIndex = Integer.parseInt(input.split(":")[1]);
                int endIndex = Integer.parseInt(input.split(":")[2]);

                if (isValid(startIndex,stopsBuilder)&&isValid(endIndex,stopsBuilder)){
                    stopsBuilder.delete(startIndex,endIndex+1);
                }
            } else if (input.contains("Switch")) {//Switch:Hawai:Bulgaria
                String oldStop = input.split(":")[1];
                String newStop = input.split(":")[2];
                if (stopsBuilder.toString().contains(oldStop)){
                    String updatedText = stopsBuilder.toString().replace(oldStop,newStop);
                    stopsBuilder=new StringBuilder(updatedText);
                }
            }
            System.out.println(stopsBuilder);
            input=scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",stopsBuilder);
    }
    public static boolean isValid(int index, StringBuilder builder){

        return index>=0&&index<=builder.length()-1;

    }
}
