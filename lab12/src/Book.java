import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String author;
    private int popularity;
    private List<Integer> readerRatings;

    public Book(int id, String title, String author, int popularity, List<Integer> readerRatings) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.popularity = popularity;
        this.readerRatings = new ArrayList<>(readerRatings);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public List<Integer> getReaderRatings() {
        return readerRatings;
    }

    public double getAverageRating() {
        if (readerRatings == null || readerRatings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int rating : readerRatings) {
            sum += rating;
        }
        return (double) sum / readerRatings.size();
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Название: %s | Автор: %s | Популярность: %d | Средний рейтинг: %.2f",
                id, title, author, popularity, getAverageRating());
    }
}