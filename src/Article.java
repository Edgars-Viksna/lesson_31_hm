public class Article {

    private String title;
    private Double price;
    private Double rating;
    private int balance;

    public Article(String title, Double price, Double rating, int balance) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.balance = balance;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public Double getRating() {
        return rating;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Article " +
                "title " + title +
                ",        price " + price +
                ",     rating " + rating +
                ",     balance " + balance;
    }

}
