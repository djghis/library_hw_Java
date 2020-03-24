import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;
    private int cardNumber;
    private String name;

    public Borrower(int cardNumber, String name){
        this.borrowedBooks = new ArrayList<Book>();
        this.cardNumber = cardNumber;
        this.name = name;
    }

    public int bookCount() {
        return borrowedBooks.size();
    }

    public void borrowBookFromLibrary(Library library) {
        Book book = library.lendBook();
        this.borrowedBooks.add(book);
    }
}
