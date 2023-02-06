package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] modifiedArr = new int[originalArr.length];
        String command = scanner.nextLine();


        while (!command.equals("end")) {
            String[] input = command.split("\\s+"); // razdelqne na teksta ot chislata
            String token=input[0];
            //"swap {index1} {index2}" takes two elements and swap their places.
            // "multiply {index1} 1{index2}" takes the element at the 1st index and multiplies it with the element at 2nd index. Save the product at the 1st index.
            // "decrease" decreases all elements in the array with 1.
            if (token.equals("swap")) {
                int firstNum = Integer.parseInt(command.split(" ")[1]);
                int secondNum = Integer.parseInt(command.split(" ")[2]);
                int number1 = originalArr[firstNum];
                int number2 = originalArr[secondNum];
                originalArr[firstNum] = number2;
                originalArr[secondNum] = number1;

            } else if (token.equals("multiply")) {
                int firstNum = Integer.parseInt(input[1]);
                int secondNum = Integer.parseInt(input[2]);
                if (firstNum >= 0 && firstNum < originalArr.length &&  secondNum >= 0 &&  secondNum < originalArr.length){
                    int temp = originalArr[ firstNum] * originalArr[ secondNum];
                    originalArr[firstNum] = temp;
                }
            } else if (token.equals("decrease")) {
                for (int i = 0; i <originalArr.length ; i++) {
                    int temp=originalArr[i]-1;
                    originalArr[i]=temp;
                }
            }
            command=scanner.nextLine();
        }
        for (int i = 0; i <originalArr.length ; i++) {
            int currentElement=originalArr[i];
            System.out.print(currentElement);
            if (i < originalArr.length - 1){
                System.out.print(", ");
            }

        }
    }
}

