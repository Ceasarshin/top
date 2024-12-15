package lesson_57_58.Task_1_Printer;

/**
 * Демонстрация реализации Printer с использованием лямбда-выражения с модифицированным выводом.
 */
public class MainModifiedLambdaPrinter {
    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        Printer printer = message -> {
            System.out.println(message);
            System.out.printf("Длина сообщения: %d символов.%n", message.length());
        };
        printer.print("Сообщение с дополнительной информацией");
    }
}

