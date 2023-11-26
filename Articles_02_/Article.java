package Articles_02_;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;

    }



    public void setContent(String content) {

        this.content = content;
    }

    public void edit (String newContent ){
        this.content = newContent;
    }

    public void changeAuthor (String newAuthor){

        this.author = newAuthor;
    }

    public  void rename (String newTitle){
        this.title = newTitle;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public String getContent() {
        return content;
    }
}
