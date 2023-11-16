package List.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ListOfProduct {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String>inputProducts= new ArrayList<>();

        int n=Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <n ; i++) {
            String currentProduct=scanner.nextLine();
            inputProducts.add(currentProduct);

            int order=i+1;


        }
        Collections.sort(inputProducts);

        for (int i = 0; i <inputProducts.size() ; i++) {
            System.out.printf("%d.%s%n",i+1,inputProducts.get(i));


        }
    }
}
