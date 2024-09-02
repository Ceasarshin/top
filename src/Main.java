public class Main {
    public static void main(String[] args) {
        // Объявление и инициализация переменных всех 8 типов примитивов
        byte myByte = 100;
        short myShort = 10000;
        int myInt = 100000;
        long myLong = 10000000000L;
        float myFloat = 10.5f;
        double myDouble = 10.55555;
        char myChar = 'A';
        boolean myBoolean = true;

        // Арифметические операции с целами числами типа int
        int a = 10;
        int b = 5;

        int sum = a + b;           // Сложение
        int difference = a - b;    // Вычитание
        int product = a * b;       // Умножение
        int quotient = a / b;      // Деление
        int remainder = a % b;     // Остаток от деления
        int inkrement = ++a;       // Увеличения значения переменной "a" на 1. Инкремент.
        int dekrement = --a;       // Уменьшение значения переменной "a" на 1. Декремент.

        // Вывод результатов в консоль
        System.out.println("Сложение: " + sum);
        System.out.println("Вычитание: " + difference);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + quotient);
        System.out.println("Остаток от деления: " + remainder);
        System.out.println("Инкремент: " + inkrement);
        System.out.println("Декремент:" + dekrement);
    }
}
