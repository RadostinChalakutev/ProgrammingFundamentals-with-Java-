package ObjectAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P4Songs {
    static class Song {
        private String typeList;
        private  String name;
        private String time;


        public Song(String typeList, String name,String time) {
            this.typeList = typeList;
            this.name = name;
            this.time=time;
        }


        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSongs = Integer.parseInt(scanner.nextLine());
        List<Song> listOfSong = new ArrayList<>();

        for (int i = 1; i <= numSongs; i++) {

           String input=scanner.nextLine();
            String[] data =input.split("_");
            String typeListInput=data[0];
            String nameInput=data[1];
            String timeInput=data[2];




            Song song = new Song(typeListInput,nameInput,timeInput);
            listOfSong.add(song);
        }
        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song item : listOfSong) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : listOfSong) {
                if (item.getTypeList().equals(command)) {

                    System.out.println(item.getName());
                }
            }


        }
    }
}
