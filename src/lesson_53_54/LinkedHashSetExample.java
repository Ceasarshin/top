package lesson_53_54;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 * Пример использования LinkedHashSet для работы с уникальными строками.
 */
public class LinkedHashSetExample {

    /**
     * Возвращает множество уникальных строк из массива с сохранением порядка их появления.
     * Используется LinkedHashSet, который сохраняет порядок добавления.
     *
     * @param words массив строк, из которого извлекаются уникальные значения
     * @return множество уникальных строк с сохранением порядка
     */
    public static Set<String> getOrderedUniqueElements(String[] words) {
        Set<String> orderedUniqueElements = new LinkedHashSet<>();
        boolean b = orderedUniqueElements.addAll(Arrays.asList(words));
        return orderedUniqueElements;
    }
    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "bird", "cat", "dog", "fish"};
        Set<String> result = getOrderedUniqueElements(words);
        System.out.println("Уникальные строки с порядком: " + result);
    }
}
