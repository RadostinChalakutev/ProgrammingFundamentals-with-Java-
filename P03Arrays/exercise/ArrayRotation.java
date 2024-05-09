package P03Arrays.exercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String elements=scanner.nextLine();
        String []elementsArr=elements.split(" ");
        int countRotation=Integer.parseInt(scanner.nextLine());


        for (int rotation = 1; rotation <=countRotation; rotation++) {

            String firstElement=elementsArr[0];

            for (int index = 0; index < elementsArr.length-1 ; index++) {
                elementsArr[index]=elementsArr[index+1];
            }
            elementsArr[elementsArr.length-1]=firstElement;
        }
        for (String otherElements:elementsArr) {
            System.out.print(otherElements+ " ");
            
        }

    }
}
