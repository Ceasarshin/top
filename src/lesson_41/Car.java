package lesson_41;

/**
 * Класс, представляющий автомобиль, наследующий от MotorTransport.
 */
public class Car extends MotorTransport {
    private String brand;
    private String model;
    private int yearOfManufacture;

    /**
     * Конструктор для создания автомобиля.
     *
     * @param wheelCount        количество колес
     * @param maxSpeed          максимальная скорость
     * @param engineType        тип двигателя
     * @param brand             марка автомобиля
     * @param model             модель автомобиля
     * @param yearOfManufacture год выпуска автомобиля
     */
    public Car(int wheelCount, int maxSpeed, String engineType, String brand, String model, int yearOfManufacture) {
        super(wheelCount, maxSpeed, engineType);
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    /**
     * Возвращает марку автомобиля.
     *
     * @return марка автомобиля
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Устанавливает марку автомобиля.
     *
     * @param brand марка автомобиля
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Возвращает модель автомобиля.
     *
     * @return модель автомобиля
     */
    public String getModel() {
        return model;
    }

    /**
     * Устанавливает модель автомобиля.
     *
     * @param model модель автомобиля
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Возвращает год выпуска автомобиля.
     *
     * @return год выпуска автомобиля
     */
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    /**
     * Устанавливает год выпуска автомобиля.
     *
     * @param yearOfManufacture год выпуска автомобиля
     */
    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public void service() {
        super.service();
        System.out.printf("Обслужен автомобиль марки и модели: %s %s, %d года выпуска.%n", brand, model, yearOfManufacture);
    }
}
