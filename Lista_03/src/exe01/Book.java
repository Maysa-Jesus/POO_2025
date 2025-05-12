package exe01;

public class Book {
    private int id;
    private String author, title;

    public Book() {
        this.author = "Indefinido";
        this.title = "Indefinido";
    }
    public Book(int id, String author, String title) {
        this.setId(id);
        this.setAuthor(author);
        this.setTitle(title);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "Book{" +
                "id=" + this.id +
                ", author='" + this.author + '\'' +
                ", title='" + this.title + '\'' +
                '}';
    }
}
