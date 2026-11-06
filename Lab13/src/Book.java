public class Book {
    private String title;
    private String author;
    private String isbn;
    private int pages;
    private boolean available;

    public Book(String title, String author, String isbn, int pages, boolean available) throws InvalidISBNException {
        this.title = title;
        this.author = author;
        setIsbn(isbn);
        this.pages = pages;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) throws InvalidISBNException {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new InvalidISBNException("ISBN не может быть пустым");
        }
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void borrow() throws BookNotAvailableException {
        if (!available) {
            throw new BookNotAvailableException("Книга «" + title + "» в данный момент недоступна.");
        }
        setAvailable(false);
        System.out.println("Вы успешно взяли книгу: " + title);
    }

    public void returnBook() {
        setAvailable(true);
        System.out.println("Вы успешно вернули книгу: " + title);
    }

    @Override
    public String toString() {
        return String.format("Название: %s | Автор: %s | ISBN: %s | Страниц: %d | Доступна: %s",
                title, author, isbn, pages, available ? "Да" : "Нет");
    }
}