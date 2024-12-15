package lesson_57_58.Task_2_Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Сортировка списка строк с использованием лямбда-выражения.
 */
public class MainLambdaSorted {
    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Анна", "Дмитрий", "Виктор", "Ольга");
        names.sort(Comparator.reverseOrder());
        System.out.println(names);
    }
}

