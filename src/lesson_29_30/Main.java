package lesson_29_30;

/**
 * Главный класс Main для демонстрации работы с классами Book и Author.
 * Создает несколько объектов книг и выводит информацию о них.
 */
public class Main {
    /**
     * Главный класс.
     * Создает объекты авторов и книг, задает их параметры, и выводит информацию о книгах в консоль.
     *
     * @param args аргументы.
     */
    public static void main(String[] args) {
        Author author = new Author();
        author.setFirstName("Дмитрий");
        author.setLastName("Лепехо");

        Author author2 = new Author();
        author2.setFirstName("Джошуа");
        author2.setLastName("Блох");

        Book book = new Book();
        book.setTitle("Язык программирования Java");
        book.setAutor(author);
        book.setYear(2024);

        Book book2 = new Book();
        book2.setTitle("Java эффективное программирование");
        book2.setAutor(author2);
        book2.setYear(2019);

        System.out.println(book.bookInfo());
        System.out.println(book2.bookInfo());
    }
}
