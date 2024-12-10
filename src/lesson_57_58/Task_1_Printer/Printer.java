package lesson_57_58.Task_1_Printer;

/**
 * Интерфейс для реализации метода печати сообщения.
 */
@FunctionalInterface
public interface Printer {
    /**
     * Печатает указанное сообщение.
     *
     * @param message сообщение для печати.
     */
    void print(String message);
}

