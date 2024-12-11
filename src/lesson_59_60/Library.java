package lesson_59_60;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Класс, представляющий библиотеку.
 */
public class Library {
    private final Map<Integer, Book> books = new HashMap<>();

    /**
     * Добавляет книгу в библиотеку.
     *
     * @param book добавляемая книга.
     */
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    /**
     * Получает книгу по ID.
     *
     * @param id идентификатор книги.
     * @return объект книги или null, если книга не найдена.
     */
    public Book getBookById(int id) {
        return books.get(id);
    }

    /**
     * Получает список всех книг, отсортированных в соответствии с компаратором.
     *
     * @param comparator компаратор для сортировки.
     * @return список книг
     */
    public List<Book> getBooks(Comparator<Book> comparator) {
        return books.values().stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    /**
     * Получает список доступных или недоступных книг.
     *
     * @param isAvailable фильтр по доступности.
     * @param comparator  компаратор для сортировки.
     * @return список книг
     */
    public List<Book> getBooks(boolean isAvailable, Comparator<Book> comparator) {
        return books.values().stream()
                .filter(book -> book.isAvailable() == isAvailable)
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    /**
     * Получает общее количество книг.
     *
     * @return количество всех книг.
     */
    public long getTotalBooksCount() {
        return books.size();
    }

    /**
     * Получает количество доступных или недоступных книг.
     *
     * @param isAvailable фильтр по доступности.
     * @return количество книг.
     */
    public long getBooksCount(boolean isAvailable) {
        return books.values().stream()
                .filter(book -> book.isAvailable() == isAvailable)
                .count();
    }

    /**
     * Получает список уникальных авторов, отсортированных по алфавиту.
     *
     * @return список авторов.
     */
    public List<String> getAuthors() {
        return books.values().stream()
                .map(Book::getAuthor)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}

