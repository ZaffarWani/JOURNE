class Library {
    String[] books;
    int NoOFBooks;

    Library() {
        this.books = new String[100];
        this.NoOFBooks = 0;
    }

    void addBook(String book) {
        this.books[NoOFBooks] = book;
        NoOFBooks++;
        System.out.println(book + " -- Has Been Added!");
    }

    void showAvailableBooks() {
        System.out.println("Available Books Are");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }

    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {

            if (this.books[i].equals(book)) {
                System.out.println("Book Is Issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("Book Doesnt Exit");

    }

    void returnBook(String book) {
        addBook(book);
    }
}

public class Ex_Library {
    public static void main(String[] args) {
        Library centrLibrary = new Library();
        centrLibrary.addBook("Think And Go Rich");
        centrLibrary.addBook("DSA");
        centrLibrary.addBook("Java");
        centrLibrary.addBook("Castle");
        centrLibrary.addBook("Bingo");
        centrLibrary.showAvailableBooks();
        centrLibrary.issueBook("Java");
        centrLibrary.showAvailableBooks();
        centrLibrary.returnBook("Java");
        centrLibrary.showAvailableBooks();

    }

}
