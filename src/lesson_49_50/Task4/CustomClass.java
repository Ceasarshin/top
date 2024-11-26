package lesson_49_50.Task4;

/**
 * Класс с двумя полями: имя и возраст.
 */
public class CustomClass {
    private final String name;
    private final int age;

    /**
     * Конструктор для создания объекта.
     *
     * @param name имя.
     * @param age возраст.
     */
    public CustomClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Получает имя.
     *
     * @return имя.
     */
    public String getName() {
        return name;
    }

    /**
     * Получает возраст.
     *
     * @return возраст.
     */
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "CustomClass{name='" + name + "', age=" + age + "}";
    }
}
