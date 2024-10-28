package lesson_33_34;

/**
 * Класс Bird, представляющий птицу.
 * Наследуется от класса Animal.
 */
public final class Bird extends Animal {
    private boolean canFly;

    /**
     * Конструктор для создания объекта Bird.
     *
     * @param name   имя птицы
     * @param canFly может ли птица летать
     */
    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    /**
     * Возвращает информацию о том, может ли птица летать.
     *
     * @return true, если птица может летать, иначе false
     */
    public boolean isCanFly() {
        return canFly;
    }

    /**
     * Устанавливает возможность птицы летать.
     *
     * @param canFly true, если птица может летать, иначе false
     */
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    /**
     * Выводит звук, который издает птица:
     */
    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Чирик-чирик!");
    }

    @Override
    public void move() {
        if (canFly) {
            System.out.println(getName() + " летит.");
        } else {
            System.out.println(getName() + " ходит.");
        }
    }

    /**
     * Выводит сообщение о том, что птица ест:
     */
    @Override
    public void eat() {
        System.out.println(getName() + " ест семена.");
    }
}
