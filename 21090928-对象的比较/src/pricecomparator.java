import java.util.Comparator;

public class pricecomparator implements Comparator<Book> {
    boolean asc;

    public pricecomparator(boolean asc) {
        this.asc = asc;
    }

    @Override
    public int compare(Book o1, Book o2) {
        if(asc) {
            return o1.price - o2.price;
        }else{
            return o2.price - o1.price;
        }
    }
}
