package lesson_55_56;

/**
 * Класс, представляющий автомобиль.
 */
public class Car {
    private final String brand;
    private final String model;

    /**
     * Конструктор для создания объекта машины.
     *
     * @param make  марка машины.
     * @param model модель машины.
     */
    public Car(String make, String model) {
        this.brand = make;
        this.model = model;
    }

    /**
     * Возвращает марку машины.
     *
     * @return марка машины.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Возвращает модель машины.
     *
     * @return модель машины.
     */
    public String getModel() {
        return model;
    }

    /**
     * Возвращает строковое представление объекта.
     *
     * @return строка вида "make model".
     */
    @Override
    public String toString() {
        return brand + " " + model;
    }
}
