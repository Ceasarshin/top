package lesson_39_40;

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
        // Создаем первый дом с использованием Builder
        House house1 = new House.Builder()
                .setFloors(2)
                .setRooms(6)
                .setHasGarage(true)
                .build();

        // Создаем второй дом с использованием Builder
        House house2 = new House.Builder()
                .setFloors(1)
                .setRooms(4)
                .setHasGarage(false)
                .build();

        // Выводим созданные дома в консоль
        System.out.println(house1);
        System.out.println(house2);
    }
}
