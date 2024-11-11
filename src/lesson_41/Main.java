package lesson_41;

/**
 * Основной класс для запуска программы.
 */
public class Main {
    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Создание объектов различных видов транспорта:
        Bicycle bicycle = new Bicycle(2, 20, "Горный", 2018);
        Car car = new Car(4, 200, "Бензиновый", "Toyota", "Camry", 2022);
        Truck truck = new Truck(6, 120, "Дизельный", 5000, 2020);

        // Создаем объект станции обслуживания:
        ServiceStation station = new ServiceStation();

        // Обслуживание каждого транспортного средства:
        station.check(bicycle);
        System.out.println("");
        station.check(car);
        System.out.println("");
        station.check(truck);
    }
}

