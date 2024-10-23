package lesson_33_34;

/**
 * Базовый класс Animal, представляющий животное.
 */
public class Animal {
    private String name;

    /**
     * Пустой конструктор для создания объекта Animal.
     */
    public Animal() {
    }

    /**
     * Конструктор для создания объекта Animal.
     *
     * @param name имя животного
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Устанавливает имя животного.
     *
     * @param name новое имя животного
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает имя животного.
     *
     * @return имя животного
     */
    public String getName() {
        return name;
    }

    /**
     * Выводит звук, который издает животное. Может быть переопределен в подклассах.
     */
    public void makeSound() {
        System.out.println(name + " издает звук: ");

    }

    /**
     * Выводит сообщение о том, что животное ест. Может быть переопределен в подклассах.
     */
    public void eat() {
        System.out.println(name + " ест: ");
    }

   
}
