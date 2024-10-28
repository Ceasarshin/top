package lesson_33_34;

/**
 * Класс Cat, представляющий кошку.
 * Наследуется от класса Animal и реализует интерфейс Pet.
 */
public class Cat extends Animal implements Pet {
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
        System.out.println(getName() + " говорит: Мяу!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " крадется.");
    }

    /**
     * Выводит сообщение о том, что кошка ест:
     */
    @Override
    public void eat() {
        System.out.println(getName() + " ест рыбу.");
    }

    /**
     * Выводит метод для игры с животным:
     */
    @Override
    public void play() {
        System.out.println(getName() + " играет с мышкой.");
    }

    /**
     * Выводит метод для демонстрации дружелюбного поведения:
     */
    @Override
    public void beFriendly() {
        System.out.println(getName() + " мурлычет и ласкается.");
    }
}
