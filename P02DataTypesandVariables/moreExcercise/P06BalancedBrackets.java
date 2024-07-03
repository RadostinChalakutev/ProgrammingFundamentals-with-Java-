package P02DataTypesandVariables.moreExcercise;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int numberOfLines=Integer.parseInt(scanner.nextLine());

        boolean isOpened=false;

        boolean isBalanced=true;

        for (int i = 0; i <numberOfLines ; i++) {

            String input=scanner.nextLine();

            if(input=="("){

                if (!isOpened){

                    isOpened=true;
                }else{

                    isBalanced=false;

                }
            }
            if (input==")"){
                if (isOpened){

                    isOpened=false;

                }else{

                    isBalanced=false;
                }
            }
        }
        if(isBalanced&&isOpened){

            System.out.println("BALANCED");

        }else {

            System.out.println("UNBALANCED");
        }
        
    }
}
