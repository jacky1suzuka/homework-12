public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Author author1 = new Author("George", "Orwell");

        Book book = new Book("Anna Karenina", author, 1878);
        Book book1 = new Book("1984", author1, 1949);

        book.setYearPublishing(1950);
        System.out.println(book1.getAuthor());
        System.out.println(book.getAuthor());

    }
}