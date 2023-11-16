package List.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                List<Integer> firstHandOfCards = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> secondHandOfCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //ако първия има по-голяма карта на една и съща позиция от втория-> слага картата победената карта и печелившата
        //на последни позиции. Победената карта се премахва само от тестето на победения.
        //ако картите на една и съща позиция са равни-> премахваме и двете карти
        //ако втория има по-голяма карта на една и съща позиция спрямо първия -> слага  победената карта и печелившата
        //на последни позиции. Победената карта се премахва само от тестето на победения.
        while(firstHandOfCards.size()!=0 && secondHandOfCards.size() !=0){
            int firstHandCard=firstHandOfCards.get(0);
            int secondHandCard=secondHandOfCards.get(0);
            firstHandOfCards.remove(0);
            secondHandOfCards.remove(0);

            if (firstHandCard > secondHandCard) {
                firstHandOfCards.add(firstHandCard);
                firstHandOfCards.add(secondHandCard);

            }else if (secondHandCard>firstHandCard){
                secondHandOfCards.add(secondHandCard);
                secondHandOfCards.add(firstHandCard);

            }
        }
        if (firstHandOfCards.size() == 0) {
            System.out.printf("Second player wins! Sum: %d",getCardSum(secondHandOfCards));
        } else if (secondHandOfCards.size()==0) {
            System.out.printf("First player wins! Sum: %d",getCardSum(firstHandOfCards));
        }


    }
    public static int getCardSum(List<Integer>list){
        int sum=0;
        for (int card:list) {
            sum+=card;
        }
        return sum;
    }
}
