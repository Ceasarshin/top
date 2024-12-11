package lesson_57_58.Task_3_SortTasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Сортировка списка задач по имени и её приоритету.
 */
public class MainTasksSorted {
    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        List<Task> tasks = Arrays.asList(
                new Task("Приложить документацию.", 3),
                new Task("Написать код.", 1),
                new Task("Проверить код на уязвимость.", 2)
        );

        tasks.sort(Comparator.comparing(Task::getTaskPriority).thenComparing(Task::getTaskName));
        tasks.forEach(System.out::println);
    }
}

