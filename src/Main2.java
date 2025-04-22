import java.util.*;

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


        //-------------------------user interface-------------------------------------

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("How would you like to sort the articles?");
            System.out.println("by price press 1");
            System.out.println("by rating press 2");
            System.out.println("by balance press 3");
            System.out.println("to end the programm press 0");

            int userChoice = scanner.nextInt();


            if ( userChoice < 0 || userChoice > 3) {
                System.out.println("please enter valid number");
            }


            if (userChoice == 0) {
                System.out.println("das Programm ist beendet");
                return;
            }
            if (userChoice == 1) {
                Collections.sort(articleList2, (Article a, Article b) -> {
                    return a.getPrice().compareTo(b.getPrice());
                });
            }


            if (userChoice == 2) {
                Collections.sort(articleList2, (Article a, Article b) -> {
                    return a.getRating().compareTo(b.getRating());
                });
            }

            if (userChoice == 3) {
                Collections.sort(articleList2, (Article a, Article b) -> {
                    return Integer.compare(a.getBalance(), b.getBalance());
                });
            }
            print2(articleList2);
        }

    }


//  Collections.sort(result, tComparator);


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




