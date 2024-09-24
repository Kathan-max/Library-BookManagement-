package libManagementSystem;

import java.util.*;

public class User {
    private String name;
    private int ID;
    List<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int ID, List<Book> borrowedBooks) {
        this.name = name;
        this.ID = ID;
        this.borrowedBooks = borrowedBooks;
    }
}
