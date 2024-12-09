package lesson_55_56;

import java.util.ArrayList;
import java.util.List;

/**
 * Главный класс программы, демонстрирующий работу с исключениями и валидацией.
 */
public class Main {
    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        // Задача 1: Исключение ArithmeticException
        System.out.println("Решение задачи №1");
        handleDivision();
        System.out.println();

        // Задача 2: Пользовательское исключение
        System.out.println("Решение задачи №2");
        handleCarSearch();
        System.out.println();

        // Задача 3: Проверка паролей на соответствие правилам:
        System.out.println("Решение задачи №3");
        handlePasswordValidation();
        System.out.println();
    }

    /**
     * Метод демонстрирует обработку исключения ArithmeticException.
     */
    private static void handleDivision() {
        try {
            System.out.println("Результат деления: " + divide(14, 2));
            System.out.println("Результат деления: " + divide(14, 0));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    /**
     * Метод демонстрирует обработку пользовательского исключения CarNotFoundException.
     */
    private static void handleCarSearch() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla"));
        cars.add(new Car("Honda", "Accord"));
        cars.add(new Car("Ваз", "2114"));

        try {
            Car car = getCar(cars, "Toyota", "Camry");
            System.out.println("Найденная машина: " + car);
        } catch (CarNotFoundException e) {
            System.out.println("Внимание! Ошибка: " + e.getMessage());
        }
    }

    /**
     * Метод демонстрирует валидацию паролей по заданным правилам.
     */
    private static void handlePasswordValidation() {
        String[] passwords = {
                "MyPassword123", "ffffff66", "ShlechtPass", "aSdf3h", "avalanche gt2020"
        };
        for (String password : passwords) {
            System.out.println(validatePassword(password));
        }
    }

    /**
     * Делит два числа.
     *
     * @param numerator   числитель.
     * @param denominator знаменатель.
     * @return результат деления в виде double.
     * @throws ArithmeticException если знаменатель равен нулю.
     */
    public static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Деление на ноль невозможно!");
        }
        return (double) numerator / denominator;
    }

    /**
     * Ищет машину в списке.
     *
     * @param cars  список машин.
     * @param make  марка искомой машины.
     * @param model модель искомой машины.
     * @return объект Car, если машина найдена.
     * @throws CarNotFoundException если машина не найдена.
     */
    public static Car getCar(List<Car> cars, String make, String model) {
        return cars.stream()
                .filter(car -> car.getBrand().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model))
                .findFirst()
                .orElseThrow(() -> new CarNotFoundException(
                        "Машина с параметрами (марка: " + make + ", модель: " + model + ") в списке не найдена."
                ));
    }

    /**
     * Проверяет пароль на соответствие правилам.
     *
     * @param password пароль для проверки.
     * @return сообщение о соответствии или недостатках пароля.
     */
    public static String validatePassword(String password) {
        StringBuilder result = new StringBuilder("Пароль " + password + " - ");

        if (password.length() < 8 || password.length() > 20) {
            result.append("должен быть длиной от 8 до 20 символов! ");
        }
        if (!password.matches(".*[A-Z].*")) {
            result.append("должен содержать хотя бы одну заглавную букву! ");
        }
        if (!password.matches(".*[a-z].*")) {
            result.append("должен содержать хотя бы одну строчную букву! ");
        }
        if (!password.matches(".*\\d.*")) {
            result.append("должен содержать хотя бы одну цифру! ");
        }
        if (password.contains(" ")) {
            result.append("не должен содержать пробелов! ");
        }

        if (result.toString().endsWith(" - ")) {
            result.append("данный пароль соответствует всем правилам!");
        }
        return result.toString();
    }
}
