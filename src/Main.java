import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Article> articleList = new ArrayList<>();
        articleList.add(new Article("MacBook Pro", 2499.99, 4.8, 10));
        articleList.add(new Article("MacBook Air", 1199.99, 4.9, 4));
        articleList.add(new Article("Asus ZenBook", 1000.00, 4.7, 20));
        articleList.add(new Article("MSI Gaming x", 3499.99, 4.3, 5));
        articleList.add(new Article("Acer P1 pro 1", 1499.99, 4.1, 300));
        articleList.add(new Article("MacBook ProMax", 3499.99, 4.8, 8));

        ListUtil.printList(articleList);

        System.out.println("---------- Sort by price------------");
        ListUtil.printList(sort(articleList, ListUtil.comparatorByPrice));
        System.out.println("---------- Sort by rating------------");
        ListUtil.printList(sort(articleList, ListUtil.comparatorByRating));
        System.out.println("---------- Sort by rating------------");
        ListUtil.printList(sort(articleList, ListUtil.comparatorByBalance));
        System.out.println("---------- Sort by price get comparator------------");
        ListUtil.printList(sort(articleList, ListUtil.getComparatorByPrice()));
        System.out.println("---------- Sort with <T> method sort by price with get comparator by price--");
        ListUtil.printList(sort1(articleList, ListUtil.getComparatorByPrice()));

        System.out.println("---------- Filter by price over 2000 ------------");
        ListUtil.printList(ListUtil.filterBy(articleList, ListUtil.priceOver2000));
        System.out.println("---------- Filter by price over balance under 10 ------------");
        ListUtil.printList(ListUtil.filterBy(articleList, ListUtil.balanceUnder10));
        System.out.println("---------- Filter by price over 2000 with lambda ------------");
        ListUtil.printList(ListUtil.filterBy(articleList, (Article element) -> {
            return element.getPrice() > 2000.00;
        }));
        System.out.println("---------- Filter by price over balance under 10 ------------");
        ListUtil.printList(ListUtil.filterBy(articleList, (Article article) -> {
            return article.getBalance() < 10;
        }));


    }
//--------------------------------- Methods ----------------------------------


    public static List<Article> sort(List<Article> articleList, Comparator<Article> comparator) {
        List<Article> result = new ArrayList<>(articleList);
        Collections.sort(result, comparator);
        return result;
    }

    public static <T> List<T> sort1(List<T> tList, Comparator<T> tComparator) {
        List<T> result = new ArrayList<>(tList);
        Collections.sort(result, tComparator);
        return result;
    }


}