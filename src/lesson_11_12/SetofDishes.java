package lesson_11_12;

import java.util.Scanner;

public class SetofDishes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы голодны (да/нет)?");
        String hungerStatus = scanner.nextLine().toLowerCase();

        System.out.println("Выберите категорию: завтрак, обед или ужин:");
        String mealType = scanner.nextLine().toLowerCase();

        String mainEat;
        String mainDrink;

        if (hungerStatus.equals("да")) {
            switch (mealType) {
                case "завтрак" -> {
                    mainEat = "Омлет с тостами";
                    mainDrink = "Кофе";
                }
                case "обед" -> {
                    mainEat = "Стейк с картофелем";
                    mainDrink = "Сок";
                }
                case "ужин" -> {
                    mainEat = "Паста с соусом";
                    mainDrink = "Сок";
                }
                default -> {
                    System.out.println("Несоответствующая категория.");
                    return;
                }
            }
        } else if (hungerStatus.equals("нет")) {
            switch (mealType) {
                case "завтрак" -> {
                    mainEat = "Йогурт с фруктами";
                    mainDrink = "Кофе";
                }
                case "обед" -> {
                    mainEat = "Салат с курицей";
                    mainDrink = "Сок";
                }
                case "ужин" -> {
                    mainEat = "Суп-пюре";
                    mainDrink = "Сок";
                }
                default -> {
                    System.out.println("Несоответствующая категория.");
                    return;
                }
            }
        } else {
            System.out.println("Некорректный выбор статуса голода.");
            return;
        }

        // Вывод результата
        System.out.println("Вам предложено: " + mainEat + " и Напиток: " + mainDrink);
    }
}
