package lesson_53_54;

import java.util.TreeSet;
/**
 * Класс для работы с TreeSet.
 * Предназначен для поиска ближайших меньшего и большего элементов относительно заданного числа.
 */
public class TreeSetExample {

    /**
     * Находит ближайшие меньший и больший элементы относительно целевого числа.
     * Используется TreeSet для автоматической сортировки элементов.
     *
     * @param numbers массив целых чисел
     * @param target целевое число, относительно которого ведется поиск
     * @return массив из двух чисел: [ближайший меньший, ближайший больший]
     * @throws IllegalArgumentException если массив пуст или не содержит элементов
     */
    public static int[] findClosestNumbers(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым.");
        }

        TreeSet<Integer> sortedNumbers = new TreeSet<>();
        for (int number : numbers) {
            sortedNumbers.add(number);
        }

        Integer lower = sortedNumbers.lower(target);
        Integer higher = sortedNumbers.higher(target);

        return new int[]{lower != null ? lower : Integer.MIN_VALUE,
                higher != null ? higher : Integer.MAX_VALUE};
    }
    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        int[] numbers = {20, 70, 30, 60, 10};
        int target = 35;
        int[] result = findClosestNumbers(numbers, target);
        System.out.printf("Ближайший меньший: %d, ближайший больший: %d%n", result[0], result[1]);

    }
}
