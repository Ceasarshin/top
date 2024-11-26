package lesson_49_50.Task4;

import java.util.Comparator;

/**
 * Компаратор для сортировки объектов CustomClass по возрасту.
 */
public class AgeComparator implements Comparator<CustomClass> {
    @Override
    public int compare(CustomClass o1, CustomClass o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}