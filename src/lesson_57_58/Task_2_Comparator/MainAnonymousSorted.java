package lesson_57_58.Task_2_Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Сортировка списка строк с использованием анонимного класса.
 */
public class MainAnonymousSorted {
    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Анна", "Борис", "Виктор", "Галина");
        names.sort(new java.util.Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(names);
    }
}

