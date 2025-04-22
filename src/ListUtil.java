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

    //--------------------- Comparators ---------------------------

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

    public static Comparator<Article> getComparatorByPrice() {
        return new Comparator<Article>() {
            @Override
            public int compare(Article o1, Article o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        };
    }
    //----------------------- Filters ---------------------------------
/*
public static List<Article> costsMoreThen (List<Article> list, Double price){
        List<Article> result = new ArrayList<>();
        for (Article item : list){
            if (item.getPrice()>price){
                result.add(item);
            }
        } return result;
}

 */

//    public static <T> List<T> filterByT (List<T> list, Filter filter) {
//        List<T> result = new ArrayList<>();
//        for (T element : list) {
//            if (filter.test(element)) {
//                result.add(element);
//            }
//        }
//        return result;
//       }

    public static List<Article> filterBy(List<Article> list, Filter filter) {
        List<Article> result = new ArrayList<>();
        for (Article element : list) {
            if (filter.test(element)) {
                result.add(element);
            }
        }
        return result;
    }


    public static Filter priceOver2000 = new Filter() {
        @Override
        public boolean test(Article article) {
            return article.getPrice() > 2000;
        }
    };

    public static Filter balanceUnder10 = new Filter() {
        @Override
        public boolean test(Article article) {
            return article.getBalance() < 10;
        }
    };

}

