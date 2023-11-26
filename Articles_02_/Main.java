package Articles_02_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Article> articleS = new ArrayList<>();
        String line = scanner.nextLine();

        String title = line.split(", ")[0];
        String content  = line.split(", ")[1];
        String author = line.split(", ")[2];

        Article article = new Article(title, content, author);
        articleS.add(article);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String command = scanner.nextLine();

            String order= command.split(": ")[0];
            String name = command.split(": ")[1];


            switch (order){
                case "Edit":
                    article.edit(name);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(name);
                    break;
                case "Rename":
                    article.rename(name);
                    break;
            }
        }

        System.out.printf("%s - %s: %s",article.getTitle(),article.getContent(), article.getAuthor());
    }
}
