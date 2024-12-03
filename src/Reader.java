import java.util.ArrayList;
import java.util.List;

class Reader {
    private String name;
    private String readerId;
    private List<Book> borrowedBooks;

    public Reader(String name, String readerId) {
        this.name = name;
        this.readerId = readerId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        book.borrowBook();
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        book.returnBook();
        borrowedBooks.remove(book);
    }
}
