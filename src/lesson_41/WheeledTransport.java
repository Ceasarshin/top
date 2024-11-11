package lesson_41;

/**
 * Абстрактный класс, представляющий колесный транспорт.
 */
public abstract class WheeledTransport implements Transport {
    private int wheelCount;
    private int maxSpeed;

    /**
     * Конструктор для создания колесного транспорта.
     *
     * @param wheelCount количество колес
     * @param maxSpeed   максимальная скорость
     */
    public WheeledTransport(int wheelCount, int maxSpeed) {
        this.wheelCount = wheelCount;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Устанавливает количество колес.
     *
     * @param wheelCount количество колес у транспорта.
     */
    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    /**
     * Возвращает количество колес.
     *
     * @return количество колес у транспорта.
     */
    public int getWheelCount() {
        return wheelCount;
    }

    /**
     * Устанавливает максимальную скорость транспорта.
     *
     * @param maxSpeed максимальная скорость транспорта.
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Возвращает максимальную скорость транспорта.
     *
     * @return максимальная скорость транспорта.
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void service() {
        System.out.printf("Обслужено колёс - %d шт.%n", wheelCount);
    }
}

