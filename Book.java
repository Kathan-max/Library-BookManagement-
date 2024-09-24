package libManagementSystem;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int bookId;
    private Boolean isBorrowed;

    public Book(String title, String author, String ISBN, int bookId, Boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.bookId = bookId;
        this.isBorrowed = isBorrowed;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public Boolean isBorrowed() {
        return this.isBorrowed;
    }

    public void borrow() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }

    public Integer getbookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

}
