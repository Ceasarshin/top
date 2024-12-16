package lesson_59_60;

import java.util.List;
import java.util.Map;

/**
 * Основной класс программы.
 */
public class Main {
    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        Library library = new Library();

        /* Создание книг: */
        library.addBook(new Book(1, "Java. Полное руководство, Десятое издание.",
                "Герберт Шилдт", true));
        library.addBook(new Book(2, "Java. Библиотека профессионала.",
                "Кей С. Хорстманн, Гари Корнелл", false));
        library.addBook(new Book(3, "Java. Эффективное программирование, Второе издание.",
                "Джошуа Блох", true));
        library.addBook(new Book(4, "Чистый код. Создание, анализ и рефакторинг.",
                "Роберт Мартин", false));
        library.addBook(new Book(5, "Философия Java.",
                "Брюс Эккель", true));
        library.addBook(new Book(6, "Java. Эффективное программирование, Третье издание.",
                "Джошуа Блох", false));
        library.addBook(new Book(7, "Java. Полное руководство, Девятое издание.",
                "Герберт Шилдт", false));
        library.addBook(new Book(8, "Java для чайников",
                "Барри Берд", false));

        System.out.println("№1.Получение одной книги по ID: ");
        System.out.println("ID книги 4: " + library.getBookById(4));

        // Проверка метода partitioningBy
        System.out.println("\n№2.Сортировка книг по доступности:");
        Map<Boolean, List<Book>> partitionedBooks = library.getBooksPartitionedByAvailability();
        partitionedBooks.forEach((isAvailable, books) -> {
            String availability = isAvailable ? "+ Доступные" : "- Недоступные";
            System.out.printf("%s: Всего- %d шт.\n", availability, books.size());
            books.forEach(System.out::println);
        });

        // Проверка метода groupingBy
        System.out.println("\n№3.Группировка книг по авторам:");
        Map<String, List<Book>> groupedBooks = library.getBooksGroupedByAuthor();
        groupedBooks.forEach((author, books) -> {
            System.out.printf("Автор: %s ; Всего книг данного автора: %d шт.\n", author, books.size());
            books.forEach(System.out::println);
        });
    }
}

