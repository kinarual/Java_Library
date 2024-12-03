import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        books = new ArrayList<>();
        readers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void registerReader(Reader reader) {
        readers.add(reader);
    }

    public void unregisterReader(Reader reader) {
        readers.remove(reader);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public Book findByTitleAndAvailable(String title) {
        return books.stream().filter(b -> b.getTitle().equals(title)&&b.isAvailable()).findFirst().orElseThrow(RuntimeException::new);
    }

    public Reader findReaderById(String readerId) {
        for (Reader reader : readers) {
            if (reader.getReaderId().equals(readerId)) {
                return reader;
            }
        }
        return null;
    }
}