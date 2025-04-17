import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListUtil {
    private ListUtil() {
    }

    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

//    Comparator<Article> comparatorByPrice0 = new Comparator<Article>() {
//        @Override
//        public int compare(Article o1, Article o2) {
//            return o1.getPrice().compareTo(o2.getPrice());
//        }
//    };  "The following method 'comparatorByPrice' was created from the text above,
//          simply by adding 'public static'."

    public static Comparator<Article> comparatorByPrice = new Comparator<Article>() {
        @Override
        public int compare(Article o1, Article o2) {
            return o1.getPrice().compareTo(o2.getPrice());
        }
    };

    public static Comparator<Article> comparatorByRating = new Comparator<Article>() {
        @Override
        public int compare(Article o1, Article o2) {
            return o1.getRating().compareTo(o2.getRating());
        }
    };

    public static Comparator<Article> comparatorByBalance = new Comparator<Article>() {
        @Override
        public int compare(Article o1, Article o2) {
            return Integer.compare(o1.getBalance(), o2.getBalance());
        }
    };


}
