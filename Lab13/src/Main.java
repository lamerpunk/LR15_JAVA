import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Book findBook(List<Book> books, String title) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        throw new BookNotFoundException("Книга с названием «" + title + "» не найдена в библиотеке!");
    }

    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();

        // 1. Проверка создания и сеттера с ошибкой ISBN
        try {
            library.add(new Book("Война и мир", "Лев Толстой", "978-5-17-090123-4", 1225, true));
            library.add(new Book("Мастер и Маргарита", "Михаил Булгаков", "978-5-699-12345-6", 480, false));

            // Демонстрация InvalidISBNException через сеттер/конструктор:
            // library.add(new Book("Тест", "Автор", "", 100, true));
        } catch (InvalidISBNException e) {
            System.out.println("Ошибка валидации ISBN: " + e.getMessage());
        }

        System.out.println("=== СПИСОК БИБЛИОТЕКИ ===");
        library.forEach(System.out::println);

        System.out.println("\n=== ОПЕРАЦИИ ВЫДАЧИ И ВОЗВРАТА ===");
        if (library.size() > 1) {
            try {
                library.get(1).borrow();
            } catch (BookNotAvailableException e) {
                System.out.println("Ошибка выдачи: " + e.getMessage());
            }

            library.get(1).returnBook();

            try {
                library.get(1).borrow();
            } catch (BookNotAvailableException e) {
                System.out.println("Ошибка выдачи: " + e.getMessage());
            }
        }

        System.out.println("\n=== ПОИСК КНИГИ ===");
        try {
            Book found = findBook(library, "Несуществующая книга");
            System.out.println("Найдена: " + found);
        } catch (BookNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }
    }
}