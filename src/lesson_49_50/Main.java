package lesson_49_50;

import lesson_49_50.Task1.CharactersPerLine;
import lesson_49_50.Task2.WordInLine;
import lesson_49_50.Task3.MapInverter;
import lesson_49_50.Task4.AgeComparator;
import lesson_49_50.Task4.CustomClass;
import lesson_49_50.Task4.NameComparator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Основной класс для запуска программы.
 */
public class Main {

    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        // Задача 1
        String input1 = "java is fun and java is powerful";
        System.out.println("Задача №1:");
        System.out.println("Строка для поиска значений: " + input1);
        System.out.println();
        System.out.println("1. Количество вхождений каждого символа (Без учета пробелов): "
                + CharactersPerLine.characterCounterPerLine(input1));
        System.out.println("2. Есть ли в строке уникальные буквы (которые встречаются только один раз): "
                + CharactersPerLine.hasUniqueCharacters(input1));
        System.out.println("3. Среднее количество символов: " + CharactersPerLine.averageCharacterCounter(input1));
        System.out.println();

        // Задача 2
        String input2 = "!!! Java is Fun and java IS powerful !!!";
        System.out.println("Задача №2:");
        System.out.println("Строка для поиска слов: " + input2);
        System.out.println("1. Количество вхождений каждого слова в строке (Без учета пробелов): " + WordInLine.wordCountPerLine(input2));
        System.out.println();

        // Задача 3
        // Исходная мапа:
        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "C");
        originalMap.put(2, "B");
        originalMap.put(3, "A");

        // Инверсия мапы:
        Map<String, Integer> invertedMap = MapInverter.invertMap(originalMap);

        System.out.println("Задача №3:");
        System.out.println("Исходная мапа: " + MapInverter.mapToString(originalMap));
        System.out.println("Результат: " + MapInverter.mapToString(invertedMap));
        System.out.println();

        // Задача 4
        List<CustomClass> list = new ArrayList<>();
        list.add(new CustomClass("Анна", 25));
        list.add(new CustomClass("Сергей", 20));
        list.add(new CustomClass("Владимир", 30));

        System.out.println("Задача №4:");
        System.out.println("Исходный лист: " + list);

        list.sort(new NameComparator());
        System.out.println("Сортировка по имени: " + list);

        list.sort(new AgeComparator());
        System.out.println("Сортировка по возрасту: " + list);
    }
}
