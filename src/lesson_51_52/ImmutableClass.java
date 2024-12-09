package lesson_51_52;

import java.util.*;

/**
 * Иммутабельный класс, который может использоваться в качестве ключа в Map.
 */
public final class ImmutableClass {
    private final String name; // Поле неизменяемое, доступ только для чтения.
    private final List<Integer> numbers; // Копируется при передаче и при возврате.
    private final CustomMutableClass customMutableClass; // Хранение копии объекта.

    /**
     * Конструктор для создания объекта ImmutableClass.
     *
     * @param name                имя объекта.
     * @param numbers             список чисел.
     * @param customMutableClass  объект изменяемого класса.
     */
    public ImmutableClass(String name, List<Integer> numbers, CustomMutableClass customMutableClass) {
        this.name = Objects.requireNonNull(name, "Имя не может быть пустым");
        // Копирование коллекции для защиты от изменений:
        this.numbers = numbers == null ? Collections.emptyList() : new ArrayList<>(numbers);
        // Создание копии изменяемого объекта:
        this.customMutableClass = customMutableClass == null
                ? null
                : new CustomMutableClass(customMutableClass.getValue());
    }

    /**
     * Возвращает имя.
     *
     * @return имя.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает копию списка чисел.
     *
     * @return список чисел.
     */
    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }

    /**
     * Возвращает копию объекта CustomMutableClass.
     *
     * @return объект CustomMutableClass.
     */
    public CustomMutableClass getCustomMutableClass() {
        // Возвращается новая копия изменяемого объекта:
        return customMutableClass == null ? null : new CustomMutableClass(customMutableClass.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(numbers, that.numbers) &&
                Objects.equals(customMutableClass, that.customMutableClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbers, customMutableClass);
    }
    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        CustomMutableClass mutable = new CustomMutableClass(10);
        ImmutableClass immutableClass = new ImmutableClass("Пример", Arrays.asList(1, 2, 3), mutable);

        System.out.println("Имутабельный класс: " + immutableClass.getName());
        System.out.println("Значения: " + immutableClass.getNumbers());

        CustomMutableClass retrieved = immutableClass.getCustomMutableClass();
        if (retrieved != null) {
            System.out.println("Значение CustomMutableClass: " + retrieved.getValue());
        } else {
            System.out.println("Пустое значение объекта.");
        }

        // Пробуем изменить состояние mutable:
        mutable.setValue(20);
        retrieved = immutableClass.getCustomMutableClass();
        if (retrieved != null) {
            System.out.println("После изменения, Значение CustomMutableClass в ImmutableClass: " + retrieved.getValue());
        } else {
            System.out.println("Пустое значение CustomMutableClass.");
        }

        // Использование в Map:
        Map<ImmutableClass, String> map = new HashMap<>();
        map.put(immutableClass, "Успешно");
        System.out.println("Map значение: " + map.get(immutableClass));
    }

    /**
     * Вложенный изменяемый класс для демонстрации принципов иммутабельности.
     */
    public static class CustomMutableClass {
        private int value;

        /**
         * Конструктор для создания объекта CustomMutableClass.
         *
         * @param value начальное значение.
         */
        public CustomMutableClass(int value) {
            this.value = value;
        }

        /**
         * Возвращает значение.
         *
         * @return значение.
         */
        public int getValue() {
            return value;
        }

        /**
         * Устанавливает новое значение.
         *
         * @param value новое значение.
         */
        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "CustomMutableClass{" + "value=" + value + '}';
        }
    }
}
