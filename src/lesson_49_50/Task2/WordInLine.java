package lesson_49_50.Task2;

import java.util.Map;
import java.util.TreeMap;

/**
 * Класс для подсчета вхождений слов в строке.
 */
public class WordInLine {

    /**
     * Подсчитывает количество вхождений каждого слова в строке.
     * Строка очищается от лишних символов, приводится к нижнему регистру,
     * и лишние пробелы исключаются.
     *
     * @param input строка для анализа.
     * @return карта, где ключ - слово, значение - количество его вхождений.
     */
    public static Map<String, Integer> wordCountPerLine(String input) {
        Map<String, Integer> wordCountMap = new TreeMap<>();

        // Убираем лишние символы, приводим к нижнему регистру и удаляем лишние пробелы
        String cleanedInput = input.replaceAll("[^a-zA-Z ]", "").toLowerCase().trim();

        // Разбиваем строку на слова, учитывая возможные двойные пробелы
        String[] words = cleanedInput.split("\\s+");

        // Считаем вхождения слов
        for (String word : words) {
            if (!word.isEmpty()) { // Исключаем пустые строки на случай ошибки
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordCountMap;
    }
}
