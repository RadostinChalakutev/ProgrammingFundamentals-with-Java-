package ExamPreparationFinalExam;

import java.util.*;

public class P3ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pieceOfCollection = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> piecesMap = new LinkedHashMap<>();
        for (int i = 1; i <= pieceOfCollection; i++) {
            String dataSong = scanner.nextLine();//{piece}|{composer}|{key}"
            //съхраняваме първоначалните мелодии в листа
            String piece = dataSong.split("\\|")[0];
            String composer = dataSong.split("\\|")[1];
            String key = dataSong.split("\\|")[2];
            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(key);
            piecesMap.put(piece, pieceInfo);
        }
        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            if (command.contains("Add")) {
                String piece = command.split("\\|")[1];
                String composer = command.split("\\|")[2];
                String key = command.split("\\|")[3];
                if (piecesMap.containsKey(piece)) {//вече съществува
                    System.out.printf("%s is already in the collection!%n",piece);
                } else {//не съествува и добавяме
                    String pieceName = command.split("\\|")[1];
                    String composerName = command.split("\\|")[2];
                    String keyName = command.split("\\|")[3];
                    List<String> pieceList = new ArrayList<>();
                    pieceList.add(composerName);
                    pieceList.add(keyName);
                    piecesMap.put(pieceName, pieceList);
                    System.out.printf("%s by %s in %s added to the collection!%n",pieceName,composerName,keyName);

                }

            } else if (command.contains("Remove")) {
                String pieceName = command.split("\\|")[1];
                if (piecesMap.containsKey(pieceName)) {//ако е валиден
                    piecesMap.remove(pieceName);
                    System.out.printf("Successfully removed %s!%n",pieceName);

                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceName);
                }

            } else if (command.contains("ChangeKey")) {
                String pieceName = command.split("\\|")[1];
                String newKey = command.split("\\|")[2];

                if (piecesMap.containsKey(pieceName)) {
                    List<String> pieceInfo = piecesMap.get(pieceName);
                    pieceInfo.set(1, newKey);
                    piecesMap.put(pieceName, pieceInfo);
                    System.out.printf("Changed the key of %s to %s!%n",pieceName,newKey);

                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceName);
                }

            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : piecesMap.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(),
                    entry.getValue().get(0), entry.getValue().get(1));

        }

    }
}
