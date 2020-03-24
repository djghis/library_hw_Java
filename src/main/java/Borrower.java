import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;
    private int cardNumber;
    private String name;

    public Borrower(int cardNumber, String name){
        this.borrowedBooks = ArrayList<Book>();
        this.cardNumber = cardNumber;
        this.name = name
    }
}
