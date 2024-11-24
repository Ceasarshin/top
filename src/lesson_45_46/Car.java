package lesson_45_46;

/**
 * Класс, представляющий автомобиль с полями модели, года выпуска и цвета.
 * Реализует интерфейс  Comparable для сортировки объектов Car
 * в порядке убывания по модели, году и цвету.
 */
public class Car implements Comparable<Car> {
    private final String model;
    private final int year;
    private final String color;

    /**
     * Конструктор для создания объекта Car.
     *
     * @param model Модель автомобиля.
     * @param year  Год выпуска автомобиля.
     * @param color Цвет автомобиля.
     */
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    /**
     * Возвращает модель автомобиля.
     *
     * @return Модель автомобиля.
     */
    public String getModel() {
        return model;
    }

    /**
     * Возвращает год выпуска автомобиля.
     *
     * @return Год выпуска автомобиля.
     */
    public int getYear() {
        return year;
    }

    /**
     * Возвращает цвет автомобиля.
     *
     * @return Цвет автомобиля.
     */
    public String getColor() {
        return color;
    }

    /**
     * Сравнивает данный объект Car с другим объектом Car для сортировки.
     * Принцип сортировки:
     * 1.Сортировка по значению "model" в алфавитном порядке.
     * 2.Сортировка по значению "year" в порядке убывания от большего к меньшему.
     * 3.Сортировка по значению "color" в алфавитном порядке при условии если модель и год одинаковые.
     *
     * @param other Другой объект Car для сравнения.
     * @return Отрицательное число, ноль или положительное число, если данный объект меньше,равен или больше
     * указанного объекта.
     */
    @Override
    public int compareTo(Car other) {
        int modelComparison = this.model.compareTo(other.model);
        if (modelComparison != 0) {
            return modelComparison;
        }

        int yearComparison = Integer.compare(other.year, this.year);
        if (yearComparison != 0) {
            return yearComparison;
        }

        return this.color.compareTo(other.color);
    }

    /**
     * Переопределяет метод equals для сравнения объектов Car.
     *
     * @param o Объект для сравнения.
     * @return Возвращает true, если объекты равны; в ином случае - false .
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (!model.equals(car.model)) return false;
        return color.equals(car.color);
    }

    /**
     * Переопределяет метод hashCode для объекта Car.
     *
     * @return Возвращает Хеш-код для данного объекта Car.
     */
    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + year;
        result = 31 * result + color.hashCode();
        return result;
    }

    /**
     * Возвращает строковое представление объекта Car.
     *
     * @return Строка, представляющая объект Car, которая включает модель, год и цвет.
     */
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
