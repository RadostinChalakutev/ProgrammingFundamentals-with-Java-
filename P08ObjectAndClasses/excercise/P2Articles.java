package P08ObjectAndClasses.excercise;

import java.util.Scanner;

public class P2Articles {
        public static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void edit(String newContent) {
            this.content = newContent;
        }

        public void changedAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        public void rename(String newTitle) {
            this.title = newTitle;
        }
        @Override
        public String toString(){
            return String.format("%s - %s: %s",this.title,this.content,this.author);//better title - better content: better author
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String articlesData = scanner.nextLine();
        String[] articlePart = articlesData.split(", ");
        String title = articlePart[0];
        String content = articlePart[1];
        String author = articlePart[2];
        int n = Integer.parseInt(scanner.nextLine());
        Article article = new Article(title, content, author);

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            if (command.contains("Edit")) {
                String newContent = command.split(": ")[1];
                article.edit(newContent);
            } else if (command.contains("ChangeAuthor")) {

                String newAuthor = command.split(": ")[1];
                article.changedAuthor(newAuthor);
            } else if (command.contains("Rename")) {
                String newTitle = command.split(": ")[1];
                article.rename(newTitle);
            }
        }

        //принтиране на съдържанието

        System.out.println(article.toString());


    }
}
