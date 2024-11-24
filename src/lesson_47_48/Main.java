package lesson_47_48;

/**
 * Основной класс программы.
 */
public class Main {
    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Создаём менеджер задач:
        TaskManager manager = new TaskManager();

        // Добавляем задачи:
        manager.addTask(new Task("Найти и исправить баг", 1, "Bug"));
        manager.addTask(new Task("Реализовать фильтрацию товаров по цене", 2, "Feature"));
        manager.addTask(new Task("Обновить документацию", 3, "Documentation"));
        manager.addTask(new Task("Оптимизировать код", 2, "Bug"));
        manager.addTask(new Task("Проверить тестами", 1, "Feature"));
        manager.addTask(new Task("Ускорить производительность", 2, "Bug"));

        // Выводим задачи в порядке выполнения:
        System.out.println("Задачи в порядке выполнения согласно приоритету:");
        manager.processTasks();
    }
}
