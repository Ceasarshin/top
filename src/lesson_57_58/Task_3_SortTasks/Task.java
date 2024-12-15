package lesson_57_58.Task_3_SortTasks;

/**
 * Класс, представляющий задачу с двумя параметрами: название задачи и её приоритет.
 */
public class Task {
    private final String taskName;
    private final int taskPriority;

    /**
     * @param name Имя задачи
     * @param priority Приоритет задачи
     */
    public Task(String name, int priority) {
        this.taskName = name;
        this.taskPriority = priority;
    }

    /**
     * @return Возвращает наименование задачи.
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @return Возвращает приоритет задачи.
     */
    public int getTaskPriority() {
        return taskPriority;
    }

    @Override
    public String toString() {
        return "Task{name='" + taskName + "', priority=" + taskPriority + '}';
    }
}

