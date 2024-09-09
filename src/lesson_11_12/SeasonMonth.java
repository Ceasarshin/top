package lesson_11_12;

import java.util.Scanner;

public class SeasonMonth {
    public static void main(String[] args) {
        // Вводим номер месяца
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца (1-12): ");
        int monthNumber = scanner.nextInt();

        // Определение сезона:
        String season = switch (monthNumber) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Некорректный номер месяца";
        };

        // Вывод результата
        System.out.println("Этот месяц относится к сезону: " + season);
    }
}

