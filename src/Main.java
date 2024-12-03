//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new PrintedBook("Евгений Онегин", "Пушкин А.С.", "123456", 300);
        Book book2 = new EBook("Проектирование API", "Bob Ross", "654321", 500);
        Book book3 = new PrintedBook("Капитанская дочка", "Пушкин А.С.", "789123", 200);
        Book book4 = new PrintedBook("Герой нашего времени", "Лермонтов М.Ю.", "673849", 250);
        Book book5 = new EBook("Скандинавский дизайн", "Мумий Тролль", "357483", 300);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        Reader reader1 = new Reader("Алиса", "001");
        Reader reader2 = new Reader("Петя", "002");

        library.registerReader(reader1);
        library.registerReader(reader2);

        reader1.borrowBook(book1);
        reader1.borrowBook(book4);

        System.out.println("Книги, которые у " + reader1.getName() + ":");
        for (Book book : reader1.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }

        reader1.returnBook(book1);

        Book foundBook = library.findBookByTitle("Капитанская дочка");
        if (foundBook != null) {
            System.out.println("Найденные книги: " + foundBook.getTitle() +
                    " " + foundBook.getAuthor() + " " + foundBook.getIsbn() );
        }

        Reader foundReader = library.findReaderById("002");
        if (foundReader != null) {
            System.out.println("Найдены читатели: " + foundReader.getName());
        }
    }
}