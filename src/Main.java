import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создание сканнера для ввода данных из консоли.
        Scanner scanner = new Scanner(System.in);

        //Запрос значений у пользователя.
        System.out.print("Введите целое значение A : ");
        int a = scanner.nextInt();

        System.out.print("Введите целое значение B : ");
        int b = scanner.nextInt();

        // Арифметические операции с целыми числами типа int.
        int sum = a + b;           // Сложение.
        int difference = a - b;    // Вычитание.
        int product = a * b;       // Умножение.
        int quotient = a / b;      // Деление.
        int remainder = a % b;     // Остаток от деления.
        int increment = ++a;       // Увеличение значения переменной "a" на 1. Инкремент.
        int decrement = --a;       // Уменьшение значения переменной "a" на 1. Декремент.

        // Вывод результатов в консоль
        System.out.println("Сложение: " + sum);
        System.out.println("Вычитание: " + difference);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + quotient);
        System.out.println("Остаток от деления: " + remainder);
        System.out.println("Инкремент: " + increment);
        System.out.println("Декремент: " + decrement);

        // Генерация случайных чисел при помощи класса Random и приведение их к типу char.
        Random random = new Random();
        char letter1 = (char) (random.nextInt(26) + 'A'); // Генерация случайной 1 буквы.
        char letter2 = (char) (random.nextInt(26) + 'A'); // Генерация случайной 2 буквы.
        char letter3 = (char) (random.nextInt(26) + 'A'); // Генерация случайной 3 буквы.
        char letter4 = (char) (random.nextInt(26) + 'A'); // Генерация случайной 4 буквы.

        // Вывод случайных символов в одно слово.
        System.out.print("Случайное слово: ");
        System.out.print(letter1);
        System.out.print(letter2);
        System.out.print(letter3);
        System.out.print(letter4);
        System.out.println(); // Пустая строка в качестве разделителя.

        // Переполнение типа int.
        long myLong = 10000000000L;
        int myInt = (int) myLong;

        // Вывод значения long и полученного int.
        System.out.println("Значение long: " + myLong);
        System.out.println("Переполненное значение int: " + myInt);
    }
}
