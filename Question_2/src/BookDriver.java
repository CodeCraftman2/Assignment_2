import java.util.ArrayList;
import java.util.List;

class Book {
    private final int bookId;
    private final String bookName;
    private final double price;

    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return "Book [ID: " + bookId + ", Name: " + bookName + ", Price: $" + price + "]";
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return bookId == other.bookId && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
                && bookName.equals(other.bookName);
    }
}
public class BookDriver {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book1", 20.99));
        books.add(new Book(2, "Book2", 15.99));
        Book book1 = books.get(0);
        Book book2 = books.get(1);
        if (book1.getPrice() > book2.getPrice()) {
            System.out.println(book1.getBookName() + " is more expensive than " + book2.getBookName());
        } else if (book1.getPrice() < book2.getPrice()) {
            System.out.println(book2.getBookName() + " is more expensive than " + book1.getBookName());
        } else {
            System.out.println("Both books have the same price.");
        }
        System.out.println("\nDetails of Book 1:");
        System.out.println(book1);
        System.out.println("\nDetails of Book 2:");
        System.out.println(book2);
        Book book3 = new Book(1, "Book1", 20.99);
        System.out.println("\nChecking equality of Book 1 and Book 3:");
        System.out.println(book1.equals(book3)); // Should print true
    }
}
