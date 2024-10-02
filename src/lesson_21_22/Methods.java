package lesson_21_22;

import java.util.Random;

public class Methods {
    public static void main(String[] args) {
        // 1. Вывод результата метода square():
        square();
        // 2. Вывод результата метода printFullName:
        printFullName("Владислав", "Матвеев");
        // Вывод результата метода cornerValuesArray:
        cornerValuesArray();
    }

    // 1. Метод для вычисления квадрата числа:
    public static void square() {
        Random random = new Random();
        int[] randomNumbers = new int[3];

        // Генерация случайных чисел и вычисление их квадратов:
        for (int i = 0; i < 3; i++) {
            randomNumbers[i] = random.nextInt(101); // случайное число от 0 до 100.
            System.out.println("Число: " + randomNumbers[i] + ", Квадрат этого числа: " + (int) Math.pow(randomNumbers[i], 2));
        }
    }

    // 2. Метод  выводит полное имя и фамилию:
    public static void printFullName(String firstName, String lastName) {
        System.out.printf("Full name: %s %s%n", firstName, lastName);
    }

    // 3. Метод, который создает массив строк, находит самую короткую и самую длинную строки и выводит результат:
    public static void cornerValuesArray() {
        String[] words = {"TOP", "Academy", "Java", "Group"};
        String shortWord = words[0];
        String longWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longWord.length()) {
                longWord = words[i];
            }
        }
        System.out.println("Самая короткая строка в массиве: " + shortWord);
        System.out.println("Самая длинная строка в массиве: " + longWord);
    }

}

