package P03Arrays.moreExcercise;

import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        for (long rows=0;rows<=n;rows++){
            long newNumber=1;

            for (long column=1;column<=rows;column++){
                System.out.print(newNumber+" ");
                newNumber= newNumber*(rows-column)/column;
            }
            System.out.println();
        }

    }
}
