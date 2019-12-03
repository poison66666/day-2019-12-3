import java.util.List;
import java.util.Comparator;

public class Sort {
    public static void sort(List<Book> books) {
       for(int i = 1;i<books.size();i++){
           Book book = books.get(i);
           int j = i-1;
           for(;j>=0 && books.get(i).compareTo(book) >0;j--){
                 books.set(j+1,books.get(i));
           }
           books.set(j+1,book);
       }
    }

    public static void sort(List<Book> books,Comparator comparator) {
        for(int i = 1;i<books.size();i++){
            Book book = books.get(i);
            int j = i-1;
            for(;j>=0&&comparator.compare(books.get(j),book)>0;j--){
                books.set(j+1,books.get(j));
            }
            books.set(j+1,book);
        }
    }
}

