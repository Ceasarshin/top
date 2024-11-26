package lesson_49_50.Task3;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Класс для инверсии ключей и значений в карте.
 */
public class MapInverter {

    /**
     * Инвертирует ключи и значения в карте.
     * Учитывается, что значения в исходной мапе уникальны.
     *
     * @param originalMap исходная карта.
     * @return новая карта с инверсией ключей и значений.
     */
    public static Map<String, Integer> invertMap(Map<Integer, String> originalMap) {
        Map<String, Integer> invertedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : originalMap.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }
        return invertedMap;
    }

    /**
     * Преобразует карту в строковое представление.
     *
     * @param <K> тип ключей карты.
     * @param <V> тип значений карты.
     * @param map карта для преобразования.
     * @return строковое представление карты.
     */
    public static <K, V> String mapToString(Map<K, V> map) {
        return map.toString();
    }
}
