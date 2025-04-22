import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<Article> articleList2 = new ArrayList<>();
        articleList2.add(new Article("MacBook Pro", 2499.99, 4.8, 10));
        articleList2.add(new Article("MacBook Air", 1199.99, 4.9, 4));
        articleList2.add(new Article("Asus ZenBook", 1000.00, 4.7, 20));
        articleList2.add(new Article("MSI Gaming x", 3499.99, 4.3, 5));
        articleList2.add(new Article("Acer P1 pro 1", 1499.99, 4.1, 300));
        articleList2.add(new Article("MacBook ProMax", 3499.99, 4.8, 8));

        System.out.println("-------------- print 2 --------------");
        print2(articleList2);


    }

    //-------------------------Methods-------------------------------------

    public static <T> void print2(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static List<Article> filterBy(List<Article> list, Filter filter) {
        List<Article> result = new ArrayList<>();
        for (Article element : list) {
            if (filter.test(element)) {
                result.add(element);
            }
        }
        return result;
    }


}
