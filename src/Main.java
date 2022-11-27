public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Author author1 = new Author("Lev", "Tolstoy");

        Book book = new Book("Anna Karenina", author, 1878);
        Book book1 = new Book("1984", author1, 1949);

        book1.setYearPublishing(1950);
        System.out.println(book1.getAuthor());
        System.out.println(book.getAuthor());
        System.out.println(book1);
        System.out.println(book.equals(book1));
        System.out.println(author.equals(author1));
        System.out.println(book.hashCode());

    }
}