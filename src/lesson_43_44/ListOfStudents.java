package lesson_43_44;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Класс ListOfStudents управляет списком студентов, предоставляя
 * методы для добавления, удаления, проверки наличия и очистки списка студентов.
 */
public class ListOfStudents {
    private final List<String> students;

    /**
     * Конструктор класса ListOfStudents, инициализирует пустой список студентов.
     */
    public ListOfStudents() {
        students = new ArrayList<>();
    }

    /**
     * Добавляет список студентов к текущему списку.
     *
     * @param newStudents список студентов для добавления
     */
    public void addStudents(List<String> newStudents) {
        students.addAll(newStudents);
    }

    /**
     * Добавляет одного студента в список.
     *
     * @param student имя студента для добавления
     */
    public void addStudent(String student) {
        students.add(student);
    }

    /**
     * Удаляет студента из списка по имени.
     *
     * @param name имя студента для удаления
     */
    public void removeStudentByName(String name) {
        students.remove(name);
    }

    /**
     * Удаляет студента из списка по индексу.
     *
     * @param index индекс студента для удаления
     */
    public void removeStudentByIndex(int index) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
        }
    }

    /**
     * Проверяет, содержится ли студент с указанным именем в списке.
     *
     * @param name имя студента для проверки
     * @return {@code true}, если студент содержится в списке, иначе {@code false}
     */
    public boolean containsStudent(String name) {
        return students.contains(name);
    }

    /**
     * Проверяет, содержатся ли все указанные студенты в списке.
     *
     * @param checkList список студентов для проверки
     * @return {@code true}, если все студенты из checkList содержатся в списке, иначе {@code false}
     */
    public boolean containsAllStudents(List<String> checkList) {
        return new HashSet<>(students).containsAll(checkList);
    }

    /**
     * Возвращает количество студентов в списке.
     *
     * @return количество студентов
     */
    public int getStudentCount() {
        return students.size();
    }

    /**
     * Проверяет, пуст ли список студентов.
     *
     * @return {@code true}, если список пуст, иначе {@code false}
     */
    public boolean isEmpty() {
        return students.isEmpty();
    }

    /**
     * Очищает список студентов.
     */
    public void clearStudents() {
        students.clear();
    }

    /**
     * Основной метод для тестирования функциональности класса ListOfStudents.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        ListOfStudents course = new ListOfStudents();

        // Добавление студентов
        course.addStudent("Марина");
        course.addStudent("Максим");
        course.addStudent("Александр");
        course.addStudent("Ольга");
        course.addStudent("Дмитрий");

        List<String> moreStudents = List.of("Елена", "Андрей");
        course.addStudents(moreStudents);

        // Вывод изначального списка студентов
        System.out.println("Изначальный список студентов: " + course.students);
        System.out.println();

        // Удаление студентов
        course.removeStudentByName("Марина");
        course.removeStudentByIndex(2);

        // Проверка на наличие студента
        String studentName = "Елена";
        boolean containsStudent = course.containsStudent(studentName);
        System.out.println("Содержит ли список '" + studentName + "'?\n" +
                (containsStudent ? "Да, " + studentName + " содержится в списке студентов." : "Нет, " +
                        studentName + " не содержится в списке студентов."));
        System.out.println();

        List<String> checkList = List.of("Галина", "Елена");
        System.out.println("Содержит ли список всех студентов в списке students: " +
                (course.containsAllStudents(checkList) ? "Да" : "Нет"));

        // Получение размера и проверка на пустоту:
        System.out.println("Количество студентов: " + course.getStudentCount() + " человек");
        System.out.println();
        System.out.println("Пустой ли список студентов?\n" +
                (course.isEmpty() ? "Да,список пуст!" : "Нет,список не пуст!"));
        System.out.println();

        // Очистка списка:
        course.clearStudents();
        System.out.println("Пустой ли список после удаления всех студентов?\n" +
                (course.isEmpty() ? "Да,список пуст!" : "Нет,список не пуст!"));
    }
}
