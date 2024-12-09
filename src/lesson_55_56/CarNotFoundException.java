package lesson_55_56;

/**
 * Исключение, выбрасываемое при отсутствии машины в списке.
 */
public class CarNotFoundException extends RuntimeException {
    /**
     * Конструктор для создания исключения с сообщением.
     *
     * @param message сообщение об ошибке.
     */
    public CarNotFoundException(String message) {
        super(message);
    }
}

