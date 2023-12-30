public class Student implements LibraryUser{
    private String firstName;
    private String lastName;
    private int id;

    private LibraryCard card;

    public Student(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.card = new LibraryCard(id,firstName, id);
    }

    public void borrowBook(Library library, Book book){
        library.removeBook(book);
    }
    public void returnBook(Library library, Book book){
        library.addBook(book);
    }

}
