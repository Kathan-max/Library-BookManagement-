package libManagementSystem;

import java.util.*;

public class Library {
    private List<Book> books;
    private HashMap<String, Book> book_hash;

    public Library() {
        this.books = new ArrayList<>();
        this.book_hash = new HashMap<>();
    }

    public void sortBooks() {
        Collections.sort(this.books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b1.getbookId(), b2.getbookId());
            }
        });
    }

    public void addBook(Book book) {
        book.setBookId(this.books.size());
        this.books.add(book);
        this.book_hash.put(book.getTitle(), book);
        this.book_hash.put(book.getISBN(), book);
    }

    // O(n) search
    public Book searchBookbyAuthorLinear(String author) {
        for (Book book : this.books) {
            if (book.getAuthor() == author) {
                return book;
            }
        }
        return null;
    }

    // O(1) Search
    public Book searchConstantBytitle(String title) {
        if (this.book_hash.containsKey(title)) {
            return this.book_hash.get(title);
        }
        return null;
    }

    // O(1) search
    public Book searchBookbyId(Integer bookId) {
        return this.books.get(bookId);
    }

}
