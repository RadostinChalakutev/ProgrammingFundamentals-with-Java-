import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class DemoJava {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*1. Kaкво искам да прави програмата:
        да изчислява какъв е шансът за победа на потребителя спрямо предварително зададени данни от програмата
        коефицент за победа
        Лацио 8,50 Равен 5,00 Милан 1,22
        Потребител: залага 20 лв. при победа за лацио 20*8,50 и т.н
        Рандом генератор с три опции W D L
        Няколко мача 8 Текст Текст HashMap<int(номер на мача)5, List<<String>, <String>>

         */

        String team1=scanner.nextLine();
        String team2=scanner.nextLine();
        HashMap<String, String> pointsMap= new HashMap<>();
        pointsMap.put(team1,team2);







    }
}
