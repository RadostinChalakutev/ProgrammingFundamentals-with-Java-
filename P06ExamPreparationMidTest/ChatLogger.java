package P06ExamPreparationMidTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<String>chats=new ArrayList<>();

        String input=scanner.nextLine();

        while(!input.equals("end")){
            List<String> commandData= List.of(input.split(" "));

            String command=commandData.get(0);
            //"Chat {message}"
            //"Delete {message}"
            //"Edit {message} {editedVersion}"
            //"Pin {message}"
            //"Spam {message1} {message2} {messageN}"


            switch (command){

                case "Chat":
                    String message=commandData.get(1);
                    chats.add(message);
                    break;
                case "Delete":
                    String deleteMessage=commandData.get(1);
                    if (chats.contains(deleteMessage)){
                        chats.remove(deleteMessage);
                    }
                    break;
                case "Edit":
                    String messages=commandData.get(1);
                    String editedMessage=commandData.get(2);
                    int position=chats.indexOf(messages);
                    chats.remove(messages);
                    chats.add(position,editedMessage);
                    break;
                case "Pin":
                    String pinMessage=commandData.get(1);
                    if (chats.contains(pinMessage)) {
                        chats.remove(pinMessage);
                        chats.add(chats.size(), pinMessage);

                    }

                    break;
                case "Spam":

                    for (String index:commandData) {

                        chats.add(index);
                        chats.remove("Spam");

                    }
                    break;
            }



            input=scanner.nextLine();
        }
        for (String messages:chats) {
            System.out.println(messages);
        }
    }
}
