package lesson_41;

/**
 * Класс, представляющий станцию технического обслуживания транспорта.
 */
public class ServiceStation {
    /**
     * Метод для обслуживания любого типа транспорта.
     *
     * @param transport транспорт, который необходимо обслужить
     */
    public void check(Transport transport) {
        transport.service();
    }
}

