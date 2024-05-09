package P01BasicSyntaxConditionalStatementsandLoops.Lab;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //English is spoken in England and USA;
        // Spanish is spoken in Spain, Argentina, and Mexico;
        // for the others, we should print "unknown".
        String languages=scanner.nextLine();
        switch (languages){
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            case "England":
            case "USA":
                System.out.println("English");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
