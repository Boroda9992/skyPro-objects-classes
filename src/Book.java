import java.util.Objects;

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

    /**
     * Метод возвращает конкатенацию параметров и строк, для читаемости.
     * @return String
     */
    @Override
    public String toString() {
        return "Название: " + title + " Автор: " + author + " Год публикации: " + yearPublished;
    }

    /**
     * Метод сначала проверяет неравенство хэш-кодов объектов, в остальном - действует стандартно.
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        //Если хэши не равны, то сравнивать дальше нет смысла.
        //Сравниваю через неравенство, т.к. равенство хэшей - не всегда означает равенство объектов.
        // Могут происходить коллизии, т.к. хэши выражаются числами в диапазоне значений int,
        // который не может вместить, потенциально, бесконечные вариации значений хэш-кода.
        if (this.hashCode() != o.hashCode()) return false;

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublished == book.yearPublished && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearPublished, author);
    }
}
