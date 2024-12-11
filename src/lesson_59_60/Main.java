package lesson_59_60;

import java.util.Comparator;

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
        library.addBook(new Book(1, "Java. Полное руководство", "Герберт Шилдт", true));
        library.addBook(new Book(2, "Java. Библиотека профессионала", "Кей С. Хорстманн, Гари Корнелл", false));
        library.addBook(new Book(3, "Java. Эффективное программирование", "Джошуа Блох", true));
        library.addBook(new Book(4, "Чистый код. Создание, анализ и рефакторинг", "Роберт Мартин", false));
        library.addBook(new Book(5, "Философия Java", "Брюс Эккель", true));

        System.out.println("ID книги 1: " + library.getBookById(1));

        System.out.println("\nСписок всех книг:");
        library.getBooks(Comparator.comparing(Book::getTitle)).forEach(System.out::println);

        System.out.println("\nСписок доступных книг:");
        library.getBooks(true, Comparator.comparing(Book::getTitle)).forEach(System.out::println);

        System.out.println("\nКоличество всех книг: " + library.getTotalBooksCount());
        System.out.println("Количество доступных книг: " + library.getBooksCount(true));

        System.out.println("\nСписок авторов:");
        library.getAuthors().forEach(System.out::println);
    }
}

