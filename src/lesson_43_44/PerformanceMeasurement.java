package lesson_43_44;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Класс для тестирования производительности ArrayList и LinkedList.
 */
public class PerformanceMeasurement {
    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        // Замер времени добавления для ArrayList и LinkedList:
        long arrayListAddTime = elementAddPerformance(new ArrayList<>(), "ArrayList");
        long linkedListAddTime = elementAddPerformance(new LinkedList<>(), "LinkedList");

        // Сравнение времени добавления:
        if (arrayListAddTime < linkedListAddTime) {
            System.out.println("ArrayList добавляет быстрее LinkedList на " +
                    (linkedListAddTime - arrayListAddTime) + " ms");
        } else {
            System.out.println("LinkedList добавляет быстрее ArrayList на " +
                    (arrayListAddTime - linkedListAddTime) + " ms");
        }
        System.out.println();

        // Замер времени случайного доступа для ArrayList и LinkedList:
        long arrayListRandomAccessTime = randomSelectionPerformance(new ArrayList<>(), "ArrayList");
        long linkedListRandomAccessTime = randomSelectionPerformance(new LinkedList<>(), "LinkedList");

        // Сравнение времени случайного доступа:
        if (arrayListRandomAccessTime < linkedListRandomAccessTime) {
            System.out.println("ArrayList выбирает случайные элементы быстрее LinkedList на " +
                    (linkedListRandomAccessTime - arrayListRandomAccessTime) + " ms");
        } else {
            System.out.println("LinkedList выбирает случайные элементы быстрее ArrayList на " +
                    (arrayListRandomAccessTime - linkedListRandomAccessTime) + " ms");
        }
    }

    /**
     * Измеряет время добавления элементов в список.
     *
     * @param list     список, в который будут добавлены элементы.
     * @param listType тип списка для вывода.
     * @return время добавления элементов в миллисекундах.
     */
    private static long elementAddPerformance(List<Integer> list, String listType) {
        long startTime = System.nanoTime();
        addElements(list, 1_000_000);
        long endTime = System.nanoTime();
        long addTime = (endTime - startTime) / 1_000_000;
        System.out.println(listType + " - Время добавления 1 000 000 элементов: " + addTime + " ms");
        return addTime;
    }

    /**
     * Измеряет время случайного доступа к элементам списка.
     *
     * @param list     список, из которого будут выбираться элементы.
     * @param listType тип списка для вывода.
     * @return время случайного доступа к элементам в миллисекундах.
     */
    private static long randomSelectionPerformance(List<Integer> list, String listType) {
        addElements(list, 1_000_000);
        long startTime = System.nanoTime();
        getRandomElements(list, 100_000);
        long endTime = System.nanoTime();
        long randomAccessTime = (endTime - startTime) / 1_000_000;
        System.out.println(listType + " - Время выбора 100 000 случайных элементов: " + randomAccessTime + " ms");
        return randomAccessTime;
    }

    /**
     * Добавляет заданное количество элементов в список.
     *
     * @param list  список, в который будут добавлены элементы.
     * @param count количество элементов для добавления.
     */
    private static void addElements(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
    }

    /**
     * Выполняет случайный доступ к элементам списка указанное количество раз.
     *
     * @param list  список, из которого будут выбираться элементы.
     * @param count количество случайных выборов элемента.
     */
    private static void getRandomElements(List<Integer> list, int count) {
        Random random = new Random();
        int size = list.size();
        for (int i = 0; i < count; i++) {
            list.get(random.nextInt(size));
        }
    }
}
