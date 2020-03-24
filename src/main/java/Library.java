import java.util.ArrayList;

public class Library {

    private  Integer capacity;
    private ArrayList<Book> bookCollection;

    public Library(Integer capacity){
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
    }


    public int bookCount() {
        return bookCollection.size();
    }

    public void addbook(Book book) {
    if (hasSpace()){
        this.bookCollection.add(book);
    }

    }

    public boolean hasSpace(){
       return this.capacity > bookCount();
    }
}
