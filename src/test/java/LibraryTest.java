import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void setUp(){
        library = new Library();
        book1 = new Book("Da Vinci Code", "Dan Brown", "Thriller");
        book2 = new Book("Harry Potter 1", "JK Rowling", "Fantasy");
        book3 = new Book("Harry Potter 2", "JK Rowling", "Fantasy");
        book4 = new Book("Harry Potter 3", "JK Rowling", "Fantasy");
    }

    @Test
    public void libraryStartEmpty(){
        assertEquals(0, library.bookCount());
    }
}
