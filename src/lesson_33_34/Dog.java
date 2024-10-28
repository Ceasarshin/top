package lesson_33_34;

/**
 * Класс Dog, представляющий собаку.
 * Наследуется от класса Animal и реализует интерфейс Pet.
 */
public class Dog extends Animal implements Pet {
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
        System.out.println(getName() + " говорит: Гав-гав!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " бежит.");
    }

    /**
     * Выводит сообщение о том, что собака ест:
     */
    @Override
    public void eat() {
        System.out.println(getName() + " ест кость.");
    }

    /**
     * Выводит метод для игры с животным:
     */
    @Override
    public void play() {
        System.out.println(getName() + " играет с хозяином.");
    }
    /**
     * Выводит метод для демонстрации дружелюбного поведения:
     */
    @Override
    public void beFriendly() {
        System.out.println(getName() + " виляет хвостом.");
    }
}
