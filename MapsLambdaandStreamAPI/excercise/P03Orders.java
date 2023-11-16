package MapsLambdaandStreamAPI.excercise;

import java.util.*;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();


        LinkedHashMap<String, Integer> productQuantity = new LinkedHashMap<>();
        LinkedHashMap<String,Double>productPrice=new LinkedHashMap<>();

        while (!data.equals("buy")) {
            String product = data.split(" ")[0];
            double price = Double.parseDouble(data.split(" ")[1]);
            int quantity = Integer.parseInt(data.split(" ")[2]);

            if (!productQuantity.containsKey(product)){
                productQuantity.put(product,quantity); //product with its quantity
            }else{
              int currentQuantity=productQuantity.get(product);
              productQuantity.put(product,quantity+currentQuantity);
            }
            productPrice.put(product,price);
            data = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : productQuantity.entrySet()) {
            String productName=entry.getKey();
            double finalSum=productQuantity.get(productName)*productPrice.get(productName);
            System.out.printf("%s -> %.2f%n",productName,finalSum);
        }

    }
}
