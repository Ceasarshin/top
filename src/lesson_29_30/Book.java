package lesson_29_30;

/**
 * Класс Book представляет книгу с заголовком, автором и годом выпуска.
 */
public class Book {
    private String title;
    private Author author;
    private Integer year;

    /**
     * Пустой конструктор
     */
    public Book() {

    }

    /**
     * Конструктор
     *
     * @param title  Название книги
     * @param author Данные автора
     * @param year   Год выпуска
     */
    public Book(String title, Author author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

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
    public Author getAuthor() {
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
    public void setAuthor(Author author) {
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
     * Возвращает полную информацию о книге, включающую название,автора  и год выпуска.
     * Метод toString()
     */
    @Override
    public String toString() {
        return "Название книги: '" + title + "', Автор книги: " + author.toString() + ", Год выпуска: " + year;
    }
}
