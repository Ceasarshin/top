package lesson_33_34;

/**
 * Базовый абстрактный класс Animal, представляющий животное.
 */
abstract class Animal {
    private String name;


    /**
     * Конструктор для создания объекта Animal.
     *
     * @param name имя животного
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Возвращает имя животного.
     *
     * @return имя животного.
     */
    public String getName() {
        return name;
    }

    /**
     * Абстрактный метод makeSound
     * Задает звук животному, который нужно реализовать в подклассах.
     */
    public abstract void makeSound();

    /**
     * Абстрактный метод move
     * Задает как двигается животное
     * */
    public abstract void move();

    /**
     * Выводит сообщение о том, что животное ест. Может быть переопределен в подклассах.
     */
    public void eat() {
        System.out.println(name + " ест:");
    }


}
