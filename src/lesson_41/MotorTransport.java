package lesson_41;

/**
 * Абстрактный класс, представляющий моторный транспорт, наследующий от WheeledTransport.
 */
public abstract class MotorTransport extends WheeledTransport {
    private String engineType;

    /**
     * Конструктор для создания моторного транспорта.
     *
     * @param wheelCount количество колес
     * @param maxSpeed   максимальная скорость
     * @param engineType тип двигателя (Бензиновый или дизельный)
     */
    public MotorTransport(int wheelCount, int maxSpeed, String engineType) {
        super(wheelCount, maxSpeed);
        this.engineType = engineType;
    }

    /**
     * Устанавливает тип двигателя.
     *
     * @param engineType тип двигателя.
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * Возвращает тип двигателя.
     *
     * @return тип двигателя.
     */
    public String getEngineType() {
        return engineType;
    }


    @Override
    public void service() {
        super.service();
        System.out.printf("Обслужен двигатель типа \"%s\".%n", engineType);
    }
}

