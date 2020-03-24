import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void booksStartEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrowBook(){
        library.addbook(book1);
        library.addbook(book2);
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.bookCount());
     }

     @Test
    public void canBorrow2Books(){
        library.addbook(book1);
        library.addbook(book2);
        borrower.borrowBookFromLibrary(library);
        borrower.borrowBookFromLibrary(library);
        assertEquals(2, borrower.bookCount());
     }

     @Test
     //Should fail!
    public void cantBorrowMoreBooksThanOnShelves(){
        library.addbook(book1);
        library.addbook(book2);
        borrower.borrowBookFromLibrary(library);
        borrower.borrowBookFromLibrary(library);
        borrower.borrowBookFromLibrary(library);
        assertEquals(2, borrower.bookCount());
     }
}

