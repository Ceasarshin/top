package lesson_49_50.Task4;

import java.util.Comparator;

/**
 * Компаратор для сортировки объектов CustomClass по имени.
 */
public class NameComparator implements Comparator<CustomClass> {
    @Override
    public int compare(CustomClass o1, CustomClass o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
