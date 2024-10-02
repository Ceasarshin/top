package lesson_19_20;

import java.util.Arrays;

public class ArraysMethods {  // Переименуем класс
    public static void main(String[] args) {
        // 1. Вывод среднего значения:
        int[] intArray = {10, 20, 30, 40, 50};
        int average = findingTheAverage(intArray);
        System.out.println("1. Среднее значение элементов: " + average);

        // 2. Вывод минимального и максимального значений:
        double[] doubleArray = {3.5, 5.2, -1.4, 7.8, 2.2};
        double[] minMax = findMinMax(doubleArray);
        System.out.println("2.1 Минимальное значение: " + minMax[0]);
        System.out.println("2.2 Максимальное значение: " + minMax[1]);

        // 3. Вывод количества гласных:
        char[] chars = {'a', 'B', 'i', 't', 'E', 'r'};
        int vowel = numberVowels(chars);
        System.out.println("3. Количество гласных: " + vowel);

        // 4. Вывод метода замены пробелов:
        String str = "Hello World This Is Java";
        String replacedStr = replacingSpaces(str);
        System.out.println("4. Строка после замены пробелов: " + replacedStr);

        // 5. Вывод результата метода разделения строки на части для занесения в массив:
        String fruit = "apple,banana,grape,orange";
        String[] parts = splitStringIntoParts(fruit);
        System.out.print("5. Вывод результата в виде массива: ");
        System.out.print(Arrays.toString(parts));
    }

    // 1. Метод для поиска среднего значения:
    public static int findingTheAverage(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j; // Складываем все элементы
        }
        return sum / array.length; // Возвращаем среднее значение
    }

    // 2. Метод для поиска минимального и максимального значений:
    public static double[] findMinMax(double[] array) {
        double min = array[0];
        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return new double[]{min, max};
    }

    // 3. Метод для подсчета количества гласных:
    public static int numberVowels(char[] array) {
        int count = 0;
        for (char c : array) {
            // Преобразуем символ в нижний регистр и проверяем, является ли он гласной:
            char lowerCaseChar = Character.toLowerCase(c);
            if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' ||
                    lowerCaseChar == 'o' || lowerCaseChar == 'u') {
                count++;
            }
        }
        return count;
    }

    // 4. Метод для замены пробелов символами подчеркивания:
    public static String replacingSpaces(String str) {
        char[] charArray = str.toCharArray(); // Преобразуем строку в массив символов

        // Заменяем пробелы на подчеркивания
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                charArray[i] = '_';
            }
        }
        // Возвращаем результат в виде строки
        return new String(charArray);
    }

    // 5. Метод для разделения строки на части
    public static String[] splitStringIntoParts(String str) {
        // Разделяем строку запятой:
        return str.split(",");
    }
}
