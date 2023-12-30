import java.util.ArrayList;

public class Library {
    //dynamic arraylist of books
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);}
    public void removeBook(Book book) {
        books.remove(book);}
    public void listBooks() {
        for (Book book : books) {
            book.displayInformation();
        }
    }
}
