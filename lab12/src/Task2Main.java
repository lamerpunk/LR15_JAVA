import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Task2Main {
    public static void printBooks(List<Book> books, int popularity) {
        System.out.println("Книги с популярностью " + popularity + ":");
        for (Book book : books) {
            if (book.getPopularity() == popularity) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();


        books.add(new Book(1, "Война и мир", "Лев Толстой", 3, Arrays.asList(5, 5, 4, 5)));
        books.add(new Book(2, "Евгений Онегин", "Александр Пушкин", 2, Arrays.asList(4, 4, 5, 4)));
        books.add(new Book(3, "Неудачный роман", "Неизвестный автор", 1, Arrays.asList(2, 2, 3, 2)));
        books.add(new Book(4, "Мастер и Маргарита", "Михаил Булгаков", 4, Arrays.asList(5, 5, 5, 5)));
        books.add(new Book(6, "астер и Маргарита", "Михаил Булгаков", 4, Arrays.asList(5, 5, 5, 5)));
        books.add(new Book(5, "Капитанская дочка", "Александр Пушкин", 3, Arrays.asList(5, 5, 4, 5)));
        System.out.println("=== ИСХОДНЫЙ СПИСОК КНИГ ===");
        books.forEach(System.out::println);

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getAverageRating() < 3.0) {
                iterator.remove();
            }
        }

        for (Book book : books) {
            if (book.getAverageRating() >= 4.0) {
                book.setPopularity(book.getPopularity() + 1);
            }
        }

        System.out.println("\n=== ПОСЛЕ УДАЛЕНИЯ (<3) И ПОВЫШЕНИЯ ПОПУЛЯРНОСТИ (>=4) ===");
        books.forEach(System.out::println);

        System.out.println("\n=== ПРОВЕРКА МЕТОДА printBooks (популярность = 4) ===");
        printBooks(books, 4);

        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                int ratingCompare = Double.compare(b2.getAverageRating(), b1.getAverageRating());
                if (ratingCompare != 0) {
                    return ratingCompare;
                }
                return b2.getTitle().compareTo(b1.getTitle());
            }
        });


        System.out.println("\n=== УПОРЯДОЧЕННЫЙ СПИСОК (ID, Название, Средний рейтинг) ===");
        for (Book book : books) {
            System.out.printf("ID: %d | Название: %-26s | Средний рейтинг: %.2f%n",
                    book.getId(), book.getTitle(), book.getAverageRating());
        }
    }
}