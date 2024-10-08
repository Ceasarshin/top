package lesson_21_22;

/**
 * Главный метод программы, демонстрирующий работу остальных методов.
 *
 * @param args массив аргументов.
 */
public class Methods {
    /**
     * Класс содержит методы для вывода вычислений квадрата числа,
     * работы с массивами строк, чисел и символов.
     *
     * @param args массив аргументов .
     */
    public static void main(String[] args) {
        /* 1. Вывод результата метода square(): */
        int[] numbers = {6, 10, 20};
        for (int numb : numbers) {
            System.out.println("Число: " + numb + " Его квадрат: " + square(numb));
        }

        /* 2. Вывод результата метода printFullName: */
        String person = printFullName("Владислав", "Матвеев");
        System.out.println(person);

        /* 3. Вывод результата метода cornerValuesArray типа String[]: */
        String[] strCornerValues = cornerValuesArray("TOP", "Academy", "Java", "Group");
        System.out.println("Самая короткая строка в массиве: " + strCornerValues[0] + "\n"
                + "Самая длинная строка в массиве: " + strCornerValues[1]);

        /* Lesson 23-24
         * 1. Вывод результата метода cornerValuesArray типа int[]: */
        int[] intCornerValues = cornerValuesArray(6, 34, 17, 22, 48);
        System.out.println("Минимальное число в массиве: " + intCornerValues[0] + "\n"
                + "Максимальное число в массиве: " + intCornerValues[1]);

        /* 1.1 Вывод результата метода cornerValuesArray типа char[]: */
        char[] charCornerValues = cornerValuesArray('J', 'A', 'V', 'A');
        System.out.println("Минимальный символ в массиве: " + charCornerValues[0] +
                " (Unicode: " + (int) charCornerValues[0] + ")");
        System.out.println("Максимальный символ в массиве: " + charCornerValues[1] +
                " (Unicode: " + (int) charCornerValues[1] + ")");

    }

    /**
     * 1.
     * Метод вычисляет квадрат числа.
     *
     * @param squareNumber целое число, квадрат которого нужно вычислить.
     * @return возвращает квадрат этого числа.
     */
    static int square(int squareNumber) {
        return squareNumber * 2;
    }

    /**
     * 2.
     * Метод возвращает полное имя и фамилию в виде строки.
     *
     * @param firstName строка, представляющая имя.
     * @param lastName  строка, представляющая фамилию.
     * @return возвращает строку в формате "Full name: firstName lastName".
     */
    static String printFullName(String firstName, String lastName) {
        return String.format("Full name: %s %s", firstName, lastName);
    }

    /**
     * 3.
     * Метод находит самую короткую и самую длинную строки в массиве строк.
     *
     * @param array массив строк типа String, для поиска самой короткой и самой длинной строк.
     * @return возвращает массив из двух строк: первой является самая короткая, второй — самая длинная.
     */
    static String[] cornerValuesArray(String... array) {
        String shortWord = array[0];
        String longWord = array[0];

        for (String word : array) {
            if (word.length() < shortWord.length()) {
                shortWord = word;
            }
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }

        return new String[]{shortWord, longWord};
    }

    // Lesson 23-24

    /**
     * 1.1
     * Метод находит минимальное и максимальное числа в массиве целых чисел, типа int.
     *
     * @param array массив целых чисел для поиска минимального и максимального значений.
     * @return возвращает массив, где первый элемент — минимальное число, второй элемент — максимальное число.
     */
    static int[] cornerValuesArray(int... array) {
        int minCoin = array[0];
        int maxCoin = array[0];

        for (int number : array) {
            if (number < minCoin) {
                minCoin = number;
            }
            if (number > maxCoin) {
                maxCoin = number;
            }
        }
        return new int[]{minCoin, maxCoin};
    }

    /**
     * 1.2
     * Метод находит минимальный и максимальный символы в массиве символов, типа char.
     * Сравнение происходит на основе кодов Unicode символов.
     *
     * @param array массив символов для поиска минимального и максимального символов
     * @return массив, где первый элемент — символ с минимальным кодом Unicode, второй — с максимальным
     */
    static char[] cornerValuesArray(char... array) {
        char minSymbol = array[0];
        char maxSymbol = array[0];

        for (char symbol : array) {
            if (symbol < minSymbol) {
                minSymbol = symbol;
            }
            if (symbol > maxSymbol) {
                maxSymbol = symbol;
            }
        }
        return new char[]{minSymbol, maxSymbol};
    }
}
