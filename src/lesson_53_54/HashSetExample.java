package lesson_53_54;

import java.util.HashSet;
import java.util.Set;
/**
 * Класс для работы с HashSet.
 * Предназначен для получения уникальных целых чисел из массива.
 */
public class HashSetExample {

    /**
     * Возвращает множество уникальных целых чисел из массива.
     * Используется HashSet, который не гарантирует порядок элементов.
     *
     * @param numbers массив целых чисел, из которого извлекаются уникальные значения
     * @return множество уникальных целых чисел
     */
    public static Set<Integer> getUniqueElements(int[] numbers) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int number : numbers) {
            uniqueElements.add(number);
        }
        return uniqueElements;
    }
    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 7, 1, 9};
        Set<Integer> result = getUniqueElements(numbers);
        System.out.println("Уникальные элементы: " + result);
    }
}
