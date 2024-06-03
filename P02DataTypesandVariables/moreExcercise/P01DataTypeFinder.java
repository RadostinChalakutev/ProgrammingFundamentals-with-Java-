package P02DataTypesandVariables.moreExcercise;

import java.util.Scanner;

public class P01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String input=scanner.nextLine();



        while(!input.equals("END")){
            if (input.matches("([+-]?)[0-9]{0,}")){
                System.out.println(input+" is integer type");

            }else if(input.matches("([-+]?)[0-9]{0,}\\.([0-9]{0,})")){
                System.out.println(input+" is floating point type");

            }else if (input.length()==1){
                System.out.println(input+ " is character type");


            } else if (input.equalsIgnoreCase("true")||input.equalsIgnoreCase("false")) {
                System.out.println(input +" is boolean type");
                
            }else {
                System.out.println(input+" is string type");
            }
            input =scanner.nextLine();
        }
    }
}
