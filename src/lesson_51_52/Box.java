package lesson_51_52;

/**
 * Обобщенный класс, представляющий контейнер для хранения одного объекта любого типа.
 *
 * @param <T> тип объекта, хранящегося в контейнере.
 */
public class Box<T> {
    private T item;

    /**
     * Возвращает объект, хранящийся в контейнере.
     *
     * @return объект.
     */
    public T get() {
        return item;
    }

    /**
     * Устанавливает объект в контейнер.
     *
     * @param item объект для хранения.
     */
    public void set(T item) {
        this.item = item;
    }

    /**
     * Проверяет, пуст ли контейнер.
     *
     * @return true, если контейнер пуст, иначе false.
     */
    public boolean isEmpty() {
        return item == null;
    }

    /**
     * Очищает контейнер.
     */
    public void clear() {
        item = null;
    }
    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Контейнер с типом String:
        Box<String> stringBox = new Box<>();
        stringBox.set("TOP Java 411");
        System.out.println("Объект в контейнере типа 'String': " + stringBox.get());
        System.out.println("Проверяем пуст ли контейнер: " + stringBox.isEmpty());
        stringBox.clear();
        System.out.println("Проверяем пуст ли контейнер после очистки: " + stringBox.isEmpty());
        System.out.println();

        // Контейнер с типом Integer:
        Box<Integer> intBox = new Box<>();
        intBox.set(411);
        System.out.println("Значение в ящике типа 'Integer': " + intBox.get());
        System.out.println("Проверяем пуст ли контейнер: " + intBox.isEmpty());
        intBox.clear();
        System.out.println("Проверяем пуст ли контейнер после очистки: " + intBox.isEmpty());
        System.out.println();

        // Контейнер с типом Character:
        Box<Character> charBox = new Box<>();
        charBox.set('A');
        System.out.println("Значение в ящике типа 'Character': " + charBox.get());
        System.out.println("Проверяем пуст ли контейнер: " + charBox.isEmpty());
        charBox.clear();
        System.out.println("Проверяем пуст ли контейнер после очистки: " + charBox.isEmpty());
        System.out.println();

        // Контейнер с типом Double:
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14159);
        System.out.println("Значение в ящике типа 'Double': " + doubleBox.get());
        System.out.println("Проверяем пуст ли контейнер: " + doubleBox.isEmpty());
        doubleBox.clear();
        System.out.println("Проверяем пуст ли контейнер после очистки: " + doubleBox.isEmpty());
    }
}

