package P02DataTypesandVariables.moreExcercise;

import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <number ; i++) {
            double leftNumber=Double.parseDouble(scanner.next());
            double rightNumber=Double.parseDouble(scanner.next());

            int sum=0;
            if (leftNumber>rightNumber){
                double numFirst=Math.abs(leftNumber);

                while(numFirst>0){

                    sum+=numFirst%10;
                    numFirst/=10;
                }
            }else {
                double numSecond=Math.abs(rightNumber);

                while(numSecond>0){
                    sum+=numSecond%10;
                    numSecond/=10;
                }
            }
            System.out.println(Math.abs(sum));
        }


    }
}
