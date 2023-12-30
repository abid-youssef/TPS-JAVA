
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Test the Library
        Library library = new Library();
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997);
        Book book3 = new Book("The Little Prince", "Antoine de Saint-Exupery", 1943);
        Book book4 = new Book("A Tale of Two Cities", "Charles Dickens", 1859);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Test the Teacher
        Teacher teacher = new Teacher("John", "Smith", 1);
        teacher.borrowBook(library, book1);
        teacher.borrowBook(library, book2);
        teacher.borrowBook(library, book3);

        // Test the Student
        Student student = new Student("Mary", "Smith", 2);
        student.borrowBook(library, book4);

        // Test Bringing back books
        teacher.returnBook(library, book1);
        student.returnBook(library, book4);

        // Test the Library
        System.out.println("Books available in the library: ");
        library.listBooks();


        }
    }
