package P09MapsLambdaandStreamAPI.excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String command=scanner.nextLine();
        LinkedHashMap<String,Integer>resourceMap=new LinkedHashMap<>();
        while(!command.equals("stop")){
            String key=command;//Gold
            int value=Integer.parseInt(scanner.nextLine());//150

            if (!resourceMap.containsKey(key)){
                resourceMap.put(key,value);
            }else {
                int currentQuantity = resourceMap.get(key);
                resourceMap.put(key, currentQuantity + value);
            }
            command=scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
