package P02DataTypesandVariables.moreExcercise;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int numberOfLines=Integer.parseInt(scanner.nextLine());

        int countOpenBrackets=0;
        int countClosingBrackets=0;

        for (int i = 0; i <numberOfLines ; i++) {

            String input=scanner.nextLine();

            String openBracket= "(";
            String closedBracket= ")";


            if(input.contains(openBracket)){

                countOpenBrackets++;
            }

            if (input.contains(closedBracket)){
               countClosingBrackets++;
               if (countOpenBrackets-countClosingBrackets!=0){
                   break;
               }
            }
        }
        if(countOpenBrackets==countClosingBrackets){

            System.out.println("BALANCED");

        }else {

            System.out.println("UNBALANCED");
        }
        
    }
}
