import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        List<Article> articleList2 = new ArrayList<>();
        articleList2.add(new Article("MacBook Pro", 2499.99, 4.8, 10));
        articleList2.add(new Article("MacBook Air", 1199.99, 4.9, 4));
        articleList2.add(new Article("Asus ZenBook", 1000.00, 4.7, 20));
        articleList2.add(new Article("MSI Gaming x", 3499.99, 4.3, 5));
        articleList2.add(new Article("Acer P1 pro 1", 1499.99, 4.1, 300));
        articleList2.add(new Article("MacBook ProMax", 3499.99, 4.8, 8));

        System.out.println("-------------- print 2 --------------");
        Main2.print2(articleList2);


        //-------------------------user interface-------------------------------------

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("How would you like to filter articles?");
            System.out.println("price higher than 2000.00 press 1");
            System.out.println("rating higher then 4.5 press 2");
            System.out.println("balance less then 10 press 3");
            System.out.println("to end the programm press 0");

            int userChoice = scanner.nextInt();
            if (userChoice < 0 || userChoice > 3) {
                System.out.println("please enter valid number");
            }


            List<Article> result = new ArrayList<>();

            switch (userChoice) {
                case 1:
                    result = filterBy(articleList2, (Article article) -> {
                        return article.getPrice() > 2000.00;
                    });
                    break;
                case 2:
                    result = filterBy(articleList2, (Article article) -> {
                        return article.getRating() > 4.5;
                    });
                    break;
                case 3:
                    result = filterBy(articleList2, (article -> article.getBalance() < 10));
                    break;
                case 0:
                    System.out.println("das Programm ist beendet");
                    return;
            }

            print2(result);


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

    public static <T> void print2(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }
}
