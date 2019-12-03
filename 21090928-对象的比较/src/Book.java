import java.util.Arrays;
import java.util.Comparator;


public class Book implements Comparable<Book> {
     String ISBN;
     String name;
     String author;
     int price;
     int sales;
     int review;

    public Book(String ISBN, String name, String author, int price, int sales, int review) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.price = price;
        this.sales = sales;
        this.review = review;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", review=" + review +
                '}';
    }


    @Override
    public int compareTo(Book o) {
        return ISBN.compareTo(o.ISBN);
    }

}
