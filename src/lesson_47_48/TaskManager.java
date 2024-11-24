package lesson_47_48;

import java.util.PriorityQueue;

/**
 * Класс TaskManager управляет приоритетной очередью задач.
 */
class TaskManager {
    private final PriorityQueue<Task> taskQueue;

    /**
     * Конструктор для создания менеджера задач.
     */
    public TaskManager() {
        this.taskQueue = new PriorityQueue<>();
    }

    /**
     * Добавляет задачу в очередь.
     *
     * @param task задача для добавления
     */
    public void addTask(Task task) {
        taskQueue.offer(task);
    }

    /**
     * Извлекает и выводит задачи из очереди в порядке выполнения.
     */
    public void processTasks() {
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}
