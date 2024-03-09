public class Main {
    public static void main(String[] args) {
        Author lovecraft = new Author("Howard", "Lovecraft");
        Author dick = new Author("Philip", "Dick");

        Book theBook = new Book("The Book", 1938, lovecraft);
        Book ubik = new Book("Ubik", 1966, dick);

        printBook(theBook);
        printBook(ubik);

        ubik.setYearPublished(1969);

        printBook(ubik);

    }

    public static void printBook(Book book) {
        System.out.println("-------------------------------------");
        System.out.println("Автор: " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год публикации: " + book.getYearPublished());
        System.out.println("-------------------------------------");
    }
}