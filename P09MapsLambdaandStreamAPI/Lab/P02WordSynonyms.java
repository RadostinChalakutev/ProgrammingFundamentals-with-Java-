package P09MapsLambdaandStreamAPI.Lab;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> wordsMap =new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String word=scanner.nextLine();
            String synonym=scanner.nextLine();

            if (!wordsMap.containsKey(word)) { //cute
                wordsMap.put(word,new ArrayList<>()); //put word(which is key) to the wordsMap
            }
            wordsMap.get(word).add(synonym);// достъпваме по ключ и добавяме към ArrayList елемента
        }


        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ", entry.getValue()));
        }


    }
}
