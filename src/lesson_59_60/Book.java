package lesson_59_60;

/**
 * Класс, представляющий книгу.
 */
public class Book {
    private final int id; // Уникальный идентификатор книги.
    private String title; // Название книги.
    private String author; // Автор книги.
    private boolean isAvailable; // Доступность книги.

    /**
     * Конструктор класса Book.
     *
     * @param id          уникальный идентификатор книги
     * @param title       название книги
     * @param author      автор книги
     * @param isAvailable доступность книги
     */
    public Book(int id, String title, String author, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    /**
     * @return возвращает индификатор книги (геттер).
     */
    public int getId() {
        return id;
    }

    /**
     * @return возвращает название книги (геттер).
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return возвращает автора книги (геттер).
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return возвращает доступность книги.
     */
    public boolean isAvailable() {
        return isAvailable;
    }


    /**
     * @param title задает название книги (сеттер).
     */
    public void setTitle(String title) {

        this.title = title;
    }

    /**
     * @param author задает автора книги (сеттер).
     */
    public void setAuthor(String author) {

        this.author = author;
    }

    /**
     * @param available задает доступность книги (сеттер).
     */
    public void setAvailable(boolean available) {

        isAvailable = available;
    }

    @Override
    public String toString() {
        return String.format("Книга {id = %d, Название = '%s', Автор = '%s', Доступность = %b}", id, title, author, isAvailable);
    }
}
