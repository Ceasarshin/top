package lesson_39_40;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Main - точка входа в программу.
 * Демонстрирует создание объектов House с использованием паттерна Builder.
 */
public class Main {
    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Создаем дома с использованием Builder
        House house1 = new House.Builder().setFloors(2).setRooms(6).setHasGarage(true).build();
        House house2 = new House.Builder().setFloors(1).setRooms(4).setHasGarage(false).build();
        House house3 = new House.Builder().setFloors(2).setRooms(6).setHasGarage(true).build();
        House house4 = new House.Builder().setFloors(1).setRooms(4).setHasGarage(false).build();

        // Добавляем все дома в список:
        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        // Проверка наличия домов в списке:
        System.out.println("Список домов: " + houses);
        System.out.println("Содержит ли список house1? " + houses.contains(house1));
        System.out.println("Содержит ли список house2? " + houses.contains(house2));

        // Проверка позиции домов в списке
        System.out.println("Позиция house3 в списке: " + houses.indexOf(house3));
        System.out.println("Позиция house4 в списке: " + houses.indexOf(house4));

        // Изменяем equals, убрав поле hasGarage, и проверяем результат:
        System.out.println("\nПроверка при исключении поля hasGarage из equals:");
        house3 = new House.Builder().setFloors(2).setRooms(6).setHasGarage(false).build();
        System.out.println("Содержит ли список house3 (с другим hasGarage)? " + houses.contains(house3));
    }
}
