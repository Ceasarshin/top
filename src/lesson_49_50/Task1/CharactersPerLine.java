package lesson_49_50.Task1;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс для анализа строк и подсчета символов.
 */
public class CharactersPerLine {

    /**
     * Подсчитывает количество вхождений каждого символа в строке (пробелы не учитываются).
     *
     * @param input строка для анализа.
     * @return карта, где ключ - символ, значение - количество его вхождений.
     */
    public static Map<Character, Integer> characterCounterPerLine(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
        return charCountMap;
    }

    /**
     * Проверяет, содержит ли строка уникальные символы (встречающиеся только один раз).
     *
     * @param input строка для анализа.
     * @return true, если есть уникальные символы, иначе false.
     */
    public static boolean hasUniqueCharacters(String input) {
        Map<Character, Integer> charCountMap = characterCounterPerLine(input);
        return charCountMap.containsValue(1);
    }

    /**
     * Вычисляет среднее количество вхождений символов в строке.
     *
     * @param input строка для анализа.
     * @return среднее значение количества символов.
     */
    public static double averageCharacterCounter(String input) {
        Map<Character, Integer> charCountMap = characterCounterPerLine(input);
        int totalOccurrences = charCountMap.values().stream().mapToInt(Integer::intValue).sum();
        return (double) totalOccurrences / charCountMap.size();
    }
}
