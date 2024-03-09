/**
 * Класс, описывающий книгу.
 */
public class Book {

    private String title;
    private int yearPublished;
    private final Author author;

    public Book(String title, int yearPublished, Author author) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }
//SETTERS
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    //GETTERS

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public Author getAuthor() {
        return author;
    }
}
