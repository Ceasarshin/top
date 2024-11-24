package lesson_47_48;

/**
 * Класс Task представляет задачу с именем, приоритетом и категорией.
 */
class Task implements Comparable<Task> {
    private final String name;
    private final int priority;
    private final String category;

    /**
     * Конструктор для создания задачи.
     *
     * @param name     имя задачи
     * @param priority приоритет задачи (чем меньше значение, тем выше приоритет)
     * @param category категория задачи
     */
    public Task(String name, int priority, String category) {
        if (priority < 1 || priority > 3) {
            throw new IllegalArgumentException("Приоритет должен быть от 1 до 3.");
        }
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getCategory() {
        return category;
    }

    /**
     * Сравнивает задачи по приоритету и категории.
     *
     * @param other другая задача для сравнения
     * @return отрицательное, нулевое или положительное число в зависимости от сравнения
     */
    @Override
    public int compareTo(Task other) {
        // Сравнение по приоритету (меньший приоритет выше):
        int priorityComparison = Integer.compare(this.priority, other.priority);
        if (priorityComparison != 0) {
            return priorityComparison;
        }
        // Если приоритеты равны, сравнение по названию категории
        return this.category.compareTo(other.category);
    }

    /**
     * Возвращает строковое представление задачи.
     */
    @Override
    public String toString() {
        return String.format("Задача: %s, Приоритет: %d, Категория: %s", name, priority, category);
    }
}
