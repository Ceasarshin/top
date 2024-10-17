package lesson_29_30;

/**
 * Главный класс Main для демонстрации работы с классами Book и Author.
 * Создает несколько объектов книг и выводит информацию о них.
 */
public class Main {
    /**
     * Главный класс.
     * Создает объекты: авторов и книг, задает их параметры, и выводит информацию о книгах.
     *
     * @param args аргументы.
     */
    public static void main(String[] args) {
        // Создаем авторов:
        Author author = new Author("Дмитрий", "Лепехо");
        Author author2 = new Author("Джошуа", "Блох");

        // Создаем книги:
        Book book = new Book("Язык программирования Java", author, 2024);
        Book book2 = new Book("Java эффективное программирование", author2, 2019);

        // Вывод информации о книгах с помощью метода toString():
        System.out.println(book);
        System.out.println(book2);

        // Изменение информации о книгах применяя сеттеры:
        book.setTitle("Чистый код");
        book.setYear(2023);

        Author newAuthorBook2 = new Author("Владислав", "Матвеев");
        book2.setAuthor(newAuthorBook2);

        // Получение и вывод всех полей книг с помощью геттеров:
        System.out.println("\nИнформация по первой книге после редактирования:");
        System.out.printf("Название книги: '%s', Автор книги: %s, Год выпуска: %d%n",
                book.getTitle(), book.getAuthor(), book.getYear());

        System.out.println("\nИнформация по первой книге после редактирования:");
        System.out.printf("Название книги: '%s', Автор книги: %s, Год выпуска: %d%n",
                book2.getTitle(), book2.getAuthor(), book2.getYear());
    }
}
