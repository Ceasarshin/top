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

        /* TEST: Вывод результата метода cornerValuesArray типа String[] со значениями одинаковой длины: */
        String[] strCornerValues2 = cornerValuesArray("TOP", "411", "Doc");
        System.out.println("Самая короткая строка в массиве: " + strCornerValues2[0] + "\n"
                + "Самая длинная строка в массиве: " + strCornerValues2[1]);

        /* TEST: Вывод результата метода cornerValuesArray типа String[] с одним значением: */
        String[] strCornerValues3 = cornerValuesArray("411");
        System.out.println("Самая короткая строка в массиве: " + strCornerValues3[0] + "\n"
                + "Самая длинная строка в массиве: " + strCornerValues3[1]);

        /* TEST: Вывод результата метода cornerValuesArray типа String[] с пустым массивом: */
        String[] caseNull = {};
        String[] strCornerValues4 = cornerValuesArray(caseNull);
        System.out.println("Самая короткая строка в массиве: " + strCornerValues4[0] + "\n"
                + "Самая длинная строка в массиве: " + strCornerValues4[1]);

        /* Lesson 23-24
         * 1. Вывод результата метода cornerValuesArray типа int[]: */
        int[] intCornerValues = cornerValuesArray(6, 34, 17, 22, 48);
        System.out.println("Минимальное число в массиве: " + intCornerValues[0] + "\n"
                + "Максимальное число в массиве: " + intCornerValues[1]);

        /* TEST: Вывод результата метода cornerValuesArray типа int[] с одинаковым значением в массиве: */
        int[] intCornerValues2 = cornerValuesArray(6, 6, 6, 6, 6);
        System.out.println("Минимальное число в массиве: " + intCornerValues2[0] + "\n"
                + "Максимальное число в массиве: " + intCornerValues2[1]);

        /* TEST: Вывод результата метода cornerValuesArray типа int[] с одним значением в массиве: */
        int[] intCornerValues3 = cornerValuesArray(100);
        System.out.println("Минимальное число в массиве: " + intCornerValues3[0] + "\n"
                + "Максимальное число в массиве: " + intCornerValues3[1]);

        /* TEST: Вывод результата метода cornerValuesArray типа int[] с пустым значением в массиве: */
        int[] countNull = {};
        int[] intCornerValues4 = cornerValuesArray(countNull);
        System.out.println("Минимальное число в массиве: " + intCornerValues4[0] + "\n"
                + "Максимальное число в массиве: " + intCornerValues4[1]);


        /* 1.1 Вывод результата метода cornerValuesArray типа char[]: */
        char[] charCornerValues = cornerValuesArray('J', 'A', 'V', 'A');
        System.out.println("Минимальный символ в массиве: " + charCornerValues[0] +
                " (Unicode: " + (int) charCornerValues[0] + ")");
        System.out.println("Максимальный символ в массиве: " + charCornerValues[1] +
                " (Unicode: " + (int) charCornerValues[1] + ")");

        /* TEST: Вывод результата метода cornerValuesArray типа char[] с одинаковыми символами в массиве: */
        char[] charCornerValues2 = cornerValuesArray('A', 'A', 'A', 'A');
        System.out.println("Минимальный символ в массиве: " + charCornerValues2[0] +
                " (Unicode: " + (int) charCornerValues2[0] + ")");
        System.out.println("Максимальный символ в массиве: " + charCornerValues2[1] +
                " (Unicode: " + (int) charCornerValues2[1] + ")");

        /* TEST: Вывод результата метода cornerValuesArray типа char[] с одним символом в массиве: */
        char[] charCornerValues3 = cornerValuesArray('A');
        System.out.println("Минимальный символ в массиве: " + charCornerValues3[0] +
                " (Unicode: " + (int) charCornerValues3[0] + ")");
        System.out.println("Максимальный символ в массиве: " + charCornerValues3[1] +
                " (Unicode: " + (int) charCornerValues3[1] + ")");

        /* TEST: Вывод результата метода cornerValuesArray типа char[] с пустым массивом: */
        char[] charNull = {};
        char[] charCornerValues4 = cornerValuesArray(charNull);
        System.out.println("Минимальный символ в массиве: " + charCornerValues4[0] +
                " (Unicode: " + (int) charCornerValues4[0] + ")");
        System.out.println("Максимальный символ в массиве: " + charCornerValues4[1] +
                " (Unicode: " + (int) charCornerValues4[1] + ")");

        /* Lesson 25-26
         * Вызов результата метода для факториала */
        int number = 5;
        System.out.println("Факториал числа " + number + ": " + factorial(number));

        int number2 = -5;
        System.out.println("Факториал числа " + number2 + " = " + factorial(number2));

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
        if (array == null || array.length == 0) {
            return new String[]{null, null};
        }

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
        if (array.length == 0) {
            return new int[]{0, 0};
        }

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
        if (array.length == 0) {
            return new char[]{'\0', '\0'};
        }

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

    /**
     * Метод для нахождения факториала числа с использованием рекурсии.
     *
     * @param n число, факториал которого нужно вычислить.
     * @return факториал числа n.
     */
    static int factorial(int n) {
        if (n < 0) {
            System.out.println("Ошибка: число должно быть неотрицательным.");
            return -1;
        }
        if (n <= 1) {
            return 1;
        }
        /* Рекурсивный случай: n * факториал от (n - 1) */
        return n * factorial(n - 1);
    }
}
