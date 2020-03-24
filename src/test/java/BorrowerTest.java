import org.junit.Before;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void setUp(){
        borrower = new Borrower(1234, "Paul");
        library = new Library(100);
        book1 = new Book("Da Vinci Code", "Dan Brown", "Thriller");
        book2 = new Book("Harry Potter 1", "JK Rowling", "Fantasy");
        book3 = new Book("Harry Potter 2", "JK Rowling", "Fantasy");
        book4 = new Book("Harry Potter 3", "JK Rowling", "Fantasy");
    }
}
