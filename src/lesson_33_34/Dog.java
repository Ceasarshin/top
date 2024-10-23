package lesson_33_34;

/**
 * Класс Dog, представляющий собаку.
 * Наследуется от класса Animal.
 */
public class Dog extends Animal {
    /**
     * Конструктор для создания объекта Dog.
     *
     * @param name имя собаки
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Выводит звук, который издает собака:
     */
    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Гав-гав");
    }

    /**
     * Выводит сообщение о том, что собака ест:
     */
    @Override
    public void eat() {
        System.out.println(getName() + " ест кость!");
    }
}
