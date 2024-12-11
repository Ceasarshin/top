package lesson_57_58.Task_1_Printer;

/**
 * Демонстрация реализации Printer с использованием лямбда-выражения.
 */
public class MainLambdaPrinter {
    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        Printer printer = System.out::println;
        printer.print("Сообщение через лямбду");
    }
}

