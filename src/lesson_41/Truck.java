package lesson_41;

/**
 * Класс, представляющий грузовик, наследующий от MotorTransport.
 */
public class Truck extends MotorTransport {
    private int loadCapacity;
    private int yearOfManufacture;

    /**
     * Конструктор для создания грузовика.
     *
     * @param wheelCount        количество колес
     * @param maxSpeed          максимальная скорость
     * @param engineType        тип двигателя
     * @param loadCapacity      грузоподъемность грузовика
     * @param yearOfManufacture год выпуска грузовика
     */
    public Truck(int wheelCount, int maxSpeed, String engineType, int loadCapacity, int yearOfManufacture) {
        super(wheelCount, maxSpeed, engineType);
        this.loadCapacity = loadCapacity;
        this.yearOfManufacture = yearOfManufacture;
    }

    /**
     * Возвращает грузоподъемность грузовика.
     *
     * @return грузоподъемность грузовика
     */
    public int getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * Устанавливает грузоподъемность грузовика.
     *
     * @param loadCapacity грузоподъемность грузовика
     */
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    /**
     * Возвращает год выпуска грузовика.
     *
     * @return год выпуска грузовика
     */
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    /**
     * Устанавливает год выпуска грузовика.
     *
     * @param yearOfManufacture год выпуска грузовика
     */
    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public void service() {
        super.service();
        System.out.printf("Обслужен грузовик с грузоподъемностью %d кг, %d года выпуска.%n", loadCapacity, yearOfManufacture);
    }
}
