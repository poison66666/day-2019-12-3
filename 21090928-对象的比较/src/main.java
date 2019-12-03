
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("9787201151304", "从一到无穷大", "[美] 乔治·伽莫夫", 1600, 400, 26));
        books.add(new Book("9787020147465", "应物兄", "李洱", 7900, 1668, 300));
        books.add(new Book("9787220107085", "如何写甲骨文", "日本文字文化机构", 8800, 23, 6));
        books.add(new Book("9787521706635", "敌人与邻居", "[英]伊恩·布莱克", 10800, 3, 0));
        books.add(new Book("9787301280751", "法国大革命 (第2版)", "布兰宁(T.C.W.Blanning)", 4500, 1993, 188));
        List<Book> copy;

        System.out.println("按ISBN排序");
        copy = new ArrayList<>(books);
        Sort.sort(copy);
        System.out.println(copy);

        System.out.println("按书名排序");
        copy = new ArrayList<>(books);
        Sort.sort(copy,new TitleComparator());
        System.out.println(copy);

        System.out.println("按价格排序-从小到大");
        copy = new ArrayList<>(books);
        Sort.sort(copy,new pricecomparator(true));
        System.out.println(copy);

        System.out.println("按价格排序-从大到小");
        copy = new ArrayList<>(books);
        Sort.sort(copy,new pricecomparator(false));
        System.out.println(copy);

        System.out.println("按销售量排序");
        copy = new ArrayList<>(books);
        Sort.sort(copy,new SalesComparator());
        System.out.println(copy);

        System.out.println("按评论数排序");
        copy = new ArrayList<>(books);
        Sort.sort(copy,new ReviewComparator());
        System.out.println(copy);
        /*Book a = new Book();
        a.ISBN = 1;a.name = "as";a.author = "aaa";a.price = 100;a.sales = 1000;a.review = 200;
        Book b = new Book();
        b.ISBN = 2;b.name = "abc";b.author = "ccc";b.price = 200;b.sales = 1100;b.review = 300;

        System.out.println("按ISBN排序");
        int r = a.compareTo(b);
        if(r < 0){
            System.out.println("a小于b");
        }else if(r == 0){
            System.out.println("a等于b");
        }else{
            System.out.println("a大于b");
        }
        System.out.println("============");

        System.out.println("按书名排序");
        Comparator<Book> comparator = new BookName();
        int v = comparator.compare(a,b);
        if(v < 0){
            System.out.println("a小于b");
        }else if(v == 0){
            System.out.println("a等于b");
        }else{
            System.out.println("a大于b");
        }
        System.out.println("============");

        System.out.println("按作者排序");
        comparator = new BookAuthor();
        int n = comparator.compare(a,b);
        if(n < 0){
            System.out.println("a小于b");
        }else if(n == 0){
            System.out.println("a等于b");
        }else{
            System.out.println("a大于b");
        }
        System.out.println("============");

        System.out.println("按价格排序");
        comparator = new BookPrice();
        int m = comparator.compare(a,b);
        if(m < 0){
            System.out.println("a小于b");
        }else if(m == 0){
            System.out.println("a等于b");
        }else{
            System.out.println("a大于b");
        }
        System.out.println("============");

        System.out.println("按销量排序");
        comparator = new BookAuthor();
        int x = comparator.compare(a,b);
        if(x < 0){
            System.out.println("a小于b");
        }else if(x == 0){
            System.out.println("a等于b");
        }else{
            System.out.println("a大于b");
        }
        System.out.println("============");

        System.out.println("按评论数排序");
        comparator = new BookAuthor();
        int z = comparator.compare(a,b);
        if(z < 0){
            System.out.println("a小于b");
        }else if(z == 0){
            System.out.println("a等于b");
        }else{
            System.out.println("a大于b");
        }
        System.out.println("============");

        Book[] book = {new Book(),new Book()};
        Arrays.sort(book,new BookAuthor());*/
    }
}
