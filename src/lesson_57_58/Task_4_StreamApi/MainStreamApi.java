package lesson_57_58.Task_4_StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Работа со списком строк через Stream API.
 */
public class MainStreamApi {
    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");

        /* Преобразуем список в верхний регистр, фильтруем и сортируем: */
        List<String> result = words.stream()
                .map(String::toUpperCase)
                .filter(word -> word.length() > 4)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        /* Проверка на пустой результат: */
        if (result.isEmpty()) {
            System.out.println("Нет подходящих слов!");
        } else {
            result.forEach(System.out::println);
        }
    }
}

