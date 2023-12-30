public class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.yearOfPublication = 0;
    }

    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void displayInformation(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year of publication: " + this.yearOfPublication);
    }
}
//new subclass novel
class Novel extends Book {
    private String genre;

    public Novel(String title, String author, int yearOfPublication, String genre) {
        super(title, author, yearOfPublication);
        this.genre = genre;
    }
    public Novel(){
        super();
        this.genre = "Unknown";
    }

    public String getGenre() {
        return this.genre;
    }

    public void displayInformation(){
        super.displayInformation();
        System.out.println("Genre: " + this.genre);
    }

}
//new subclass textbook
class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, int yearOfPublication, String subject) {
        super(title, author, yearOfPublication);
        this.subject = subject;
    }
    public Textbook(){
        super();
        this.subject = "Unknown";
    }

    public String getSubject() {
        return this.subject;
    }

    public void displayInformation(){
        super.displayInformation();
        System.out.println("Subject: " + this.subject);
    }

}
