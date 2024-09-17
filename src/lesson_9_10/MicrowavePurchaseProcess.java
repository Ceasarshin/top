package lesson_9_10;

import java.util.Scanner;

public class MicrowavePurchaseProcess {
    public static void main(String[] args) {
        // Начало процесса
        System.out.println("Начало процесса покупки микроволновки.");

        Scanner scanner = new Scanner(System.in);

        // 1. Определение бюджета
        System.out.print("Введите ваш бюджет на микроволновку : ");
        int budget = scanner.nextInt();

        // 2. Определение потребностей
        System.out.println("Определение ваших потребностей.");
        System.out.print("Введите минимальные требования к мощности (800-1000-1200Вт): ");
        int requiredPower = scanner.nextInt();
        System.out.print("Введите минимальный объем (20-23-25л): ");
        int requiredVolume = scanner.nextInt();
        System.out.print("Нужен ли гриль? (1 - Да, 0 - Нет): ");
        boolean needGrill = scanner.nextInt() == 1;

        // 3. Исследование рынка
        System.out.println("Исследование рынка...");

        // Характеристики модели A
        String modelA = "Модель A";
        int priceA = 5450;
        int powerA = 800;
        int volumeA = 20;
        boolean grillA = true;

        // Характеристики модели B
        String modelB = "Модель B";
        int priceB = 7600;
        int powerB = 1000;
        int volumeB = 23;
        boolean grillB = false;

        // Характеристики модели C
        String modelC = "Модель C";
        int priceC = 12800;
        int powerC = 1200;
        int volumeC = 25;
        boolean grillC = true;

        // 4. Выбор модели
        String chosenModel = "";
        if (priceA <= budget && powerA >= requiredPower && volumeA >= requiredVolume && (!needGrill || grillA)) {
            chosenModel = modelA;
        } else if (priceB <= budget && powerB >= requiredPower && volumeB >= requiredVolume && (!needGrill || grillB)) {
            chosenModel = modelB;
        } else if (priceC <= budget && powerC >= requiredPower && volumeC >= requiredVolume && (!needGrill || grillC)) {
            chosenModel = modelC;
        }

        String modelMessage = !chosenModel.isEmpty() ? "Вы выбрали модель: " + chosenModel : "Нет моделей, соответствующих вашему бюджету и требованиям.";
        System.out.println(modelMessage);
        if (chosenModel.isEmpty()) {
            System.out.println("Завершение процесса покупки.");
            return;
        }

        // 5. Проверка наличия модели
        System.out.println("Проверка наличия модели в магазине...");
        boolean isAvailable = Math.random() > 0.3;  // Допустим, 70% вероятность наличия модели в магазине

        String availabilityMessage = isAvailable ? "Модель доступна для покупки." : "Модель отсутствует в магазине.";
        System.out.println(availabilityMessage);
        if (!isAvailable) {
            System.out.println("Завершение процесса покупки.");
            return;
        }

        // 6. Покупка
        System.out.print("Как будете покупать? (1 - В магазине, 2 - Онлайн): ");
        int purchaseMethod = scanner.nextInt();

        String purchaseMessage = (purchaseMethod == 1) ? "Покупка в магазине успешно совершена." : "Оформлен онлайн-заказа.";
        System.out.println(purchaseMessage);

        if (purchaseMethod == 2) {
            System.out.print("Введите адрес доставки: ");
            scanner.nextLine();
            String address = scanner.nextLine();
            System.out.println("Заказ оформлен на адрес: " + address);
        }

        // 7. Получение товара.
        String deliveryMessage = (purchaseMethod == 1) ? "Вы забрали микроволновку из магазина." : "Ожидаем доставку микроволновки на дом.";
        System.out.println(deliveryMessage);

        // 8. Установка и проверка.
        System.out.println("Устанавливаем микроволновку на кухне...");
        System.out.println("Проверяем работу микроволновки...");
        boolean isWorking = true;  // Допустим, микроволновка работает корректно
        String checkMessage = isWorking ? "Микроволновка работает исправно и соответствует характеристикам." : "Проблемы с работой микроволновки.";
        System.out.println(checkMessage);

        // Конец процесса покупки.
        System.out.println("Завершение процесса покупки.");
    }
}
