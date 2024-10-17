package lesson_29_30;

/**
 * Класс Book представляет книгу с заголовком, автором и годом выпуска.
 */
public class Book {
    private String title;
    private Author author;
    private Integer year;

    /**
     * Возвращает заголовок книги.
     *
     * @return заголовок книги.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Возвращает автора книги.
     *
     * @return объект Author, представляющий автора книги.
     */
    public Author getAutor() {
        return author;
    }

    /**
     * Возвращает год выпуска книги.
     *
     * @return год выпуска книги.
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Устанавливает заголовок книги.
     *
     * @param title заголовок книги.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Устанавливает автора книги.
     *
     * @param author объект Author, представляющий автора книги.
     */
    public void setAutor(Author author) {
        this.author = author;
    }

    /**
     * Устанавливает год выпуска книги.
     *
     * @param year год выпуска книги.
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * Возвращает информацию о книге, включая заголовок, автора и год выпуска.
     *
     * @return строка, содержащая информацию о книге.
     */
    public String bookInfo() {
        return String.format("Название книги: '%s', Автор книги: %s, Год выпуска: %d", title, author.autorInfo(), year);
    }
}
