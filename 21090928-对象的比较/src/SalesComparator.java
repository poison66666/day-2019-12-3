import java.util.Comparator;

public class SalesComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.sales - o2.sales;
    }
}
