import javax.print.attribute.standard.MediaSize;

public class Main {
    public static void main(String[] args) {
        Author lovecraft = new Author("Howard", "Lovecraft");
        Author dick = new Author("Philip", "Dick");

        Book theBook = new Book("The Book", 1938, lovecraft);
        Book ubik = new Book("Ubik", 1966, dick);
        Book galacticPotHealer = new Book("Galactic Pot-Healer", 1969, dick);

        System.out.println();
        System.out.println(theBook);
        System.out.println(ubik);

        System.out.println();
        ubik.setYearPublished(1969);
        System.out.println(ubik);

        System.out.println();
        System.out.println(ubik.equals(theBook));
        System.out.println(ubik.equals(galacticPotHealer));
        System.out.println(ubik.hashCode());

        System.out.println();
        printBook(theBook);
        printBook(ubik);
        printBook(galacticPotHealer);

        System.out.println();
        printHash(theBook);
        printHash(ubik);
        printHash(galacticPotHealer);
    }

    /**
     * Метод для визуального оформления вывода параметров объекта класса Book.
     * @param book объект, параметры которого необходимо представить в консоли.
     */
    public static void printBook(Book book) {
        System.out.println("-------------------------------------");
        System.out.println(book.toString());
        System.out.println("-------------------------------------");
    }

    /**
     * Метод для визуального оформления вывода хэш-кода.
     * @param book объект, хэш-код которого необходимо представить в консоли.
     */
    public static void printHash(Book book) {
        System.out.println("For book with title: " + book.getTitle());
        System.out.println("Hash code is: " + book.hashCode());
        System.out.println("___");
    }

}