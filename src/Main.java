import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Article> articleList = new ArrayList<>();
        articleList.add(new Article("MacBook Pro", 2499.99, 4.8, 100));
        articleList.add(new Article("MacBook Air", 1199.99, 4.9, 100));
        articleList.add(new Article("Asus ZenBook", 1000.00, 4.7, 100));
        articleList.add(new Article("MSI Gaming x", 3499.99, 4.3, 100));
        articleList.add(new Article("Acer P1 pro 1", 1499.99, 4.1, 100));
        articleList.add(new Article("MacBook ProMax", 3499.99, 4.8, 100));

        printList(articleList);


    }

    public static <T> void printList (List<T> list ) {
        for (T item : list) {
            System.out.println(item);
        }
    }
}