package lesson_41;

/**
 * Класс, представляющий велосипед, наследующий от WheeledTransport.
 */
public class Bicycle extends WheeledTransport {
    private String type;
    private int yearOfManufacture;

    /**
     * Конструктор для создания велосипеда.
     *
     * @param wheelCount        количество колес
     * @param maxSpeed          максимальная скорость
     * @param type              тип велосипеда (например, горный, шоссейный)
     * @param yearOfManufacture год выпуска велосипеда
     */
    public Bicycle(int wheelCount, int maxSpeed, String type, int yearOfManufacture) {
        super(wheelCount, maxSpeed);
        this.type = type;
        this.yearOfManufacture = yearOfManufacture;
    }

    /**
     * Возвращает тип велосипеда.
     *
     * @return тип велосипеда
     */
    public String getType() {
        return type;
    }

    /**
     * Устанавливает тип велосипеда.
     *
     * @param type тип велосипеда
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Возвращает год выпуска велосипеда.
     *
     * @return год выпуска велосипеда
     */
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    /**
     * Устанавливает год выпуска велосипеда.
     *
     * @param yearOfManufacture год выпуска велосипеда
     */
    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public void service() {
        super.service();
        System.out.printf("Обслужено оборудование велосипеда типа %s, %d года выпуска.%n", type, yearOfManufacture);
    }
}
