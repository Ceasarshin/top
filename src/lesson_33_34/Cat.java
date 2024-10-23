package lesson_33_34;

/**
 * Класс Cat, представляющий кошку.
 * Наследуется от класса Animal.
 */
public class Cat extends Animal {
    /**
     * Конструктор для создания объекта Cat.
     *
     * @param name имя кошки
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Выводит звук, который издает кошка:
     */
    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу");
    }

    /**
     * Выводит сообщение о том, что кошка ест:
     */
    @Override
    public void eat() {
        System.out.println(getName() + " ест рыбу!");
    }
}
