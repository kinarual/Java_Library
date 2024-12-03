import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        this.available = false;
    }

    public void returnBook() {
        this.available = true;
    }
}

class PrintedBook extends Book {
    private int numberOfPages;

    public PrintedBook(String title, String author, String isbn, int numberOfPages) {
        super(title, author, isbn);
        this.numberOfPages = numberOfPages;
    }
}

class EBook extends Book {
    private int fileSize;

    public EBook(String title, String author, String isbn, int fileSize) {
        super(title, author, isbn);
        this.fileSize = fileSize;
    }
}