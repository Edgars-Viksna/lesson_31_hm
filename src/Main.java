import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Article> articleList = new ArrayList<>();
        articleList.add(new Article("MacBook Pro", 2499.99, 4.8, 100));
        articleList.add(new Article("MacBook Air", 1199.99, 4.9, 100));
        articleList.add(new Article("Asus ZenBook", 1000.00, 4.7, 200));
        articleList.add(new Article("MSI Gaming x", 3499.99, 4.3, 500));
        articleList.add(new Article("Acer P1 pro 1", 1499.99, 4.1, 300));
        articleList.add(new Article("MacBook ProMax", 3499.99, 4.8, 400));

        ListUtil.printList(articleList);

        System.out.println("---------- Sort by price------------");
        ListUtil.printList(sort(articleList, ListUtil.comparatorByPrice));
        System.out.println("---------- Sort by rating------------");
        ListUtil.printList(sort(articleList, ListUtil.comparatorByRating));
        System.out.println("---------- Sort by rating------------");
        ListUtil.printList(sort(articleList, ListUtil.comparatorByBalance));


    }
//--------------------------------- Methods ----------------------------------


    public static List<Article> sort(List<Article> articleList, Comparator<Article> comparator) {
        List<Article> result = new ArrayList<>(articleList);
        Collections.sort(result, comparator);
        return result;
    }


}