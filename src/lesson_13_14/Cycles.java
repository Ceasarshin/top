package lesson_13_14;

public class Cycles {
    public static void main(String[] args) {
        // Задача №1. Вывод нечётных чисел от 1 до n.
        int n = 10; // Установим 10, для предотвращения переполнения типа int либо long при большем значении.
        System.out.println("Задача №1 :: Решение :: Все нечетные числа до " + n + ":");
        boolean first = true;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                continue;
            }
            if (i % 2 != 0) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.println(".");
        System.out.println("");

        // Задача №2. Вычисление произведения всех чисел от 1 до заданного числа n.
        int result = 1;
        System.out.println("Задача №2 :: Решение :: Произведение всех чисел от 1 до заданного числа " + n + ": ");

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                continue;
            }
            result *= i;
            System.out.print(i);
            if (i < n) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + result + ".");
        System.out.println("");

        // Задача №3.Вывод таблицы умножения от 1 до 10.
        System.out.println("Задача №3 :: Решение :: Таблица умножения: ");
        for (int i = 0; i <= 10; i++) {
            if (i == 0) {
                continue;
            }
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %-4d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}
