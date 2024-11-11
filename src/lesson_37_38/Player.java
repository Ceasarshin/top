package lesson_37_38;
/**
 * Класс Player представляет игрока.
 * У каждого игрока есть имя и уровень выносливости.
 */
public class Player {
    private static final int MAX_STAMINA = 10;
    private static final int MIN_STAMINA = 0;

    private final String name;
    private int stamina;

    /**
     * Конструктор класса Player. Задает имя игрока и устанавливает выносливость на максимальный уровень.
     *
     * @param name Имя игрока
     */
    public Player(String name) {
        this.name = name;
        this.stamina = MAX_STAMINA;
    }

    /**
     * Метод для выполнения действия "бег". Снижает выносливость на 1.
     * Если выносливость достигает минимального значения, игрок считается выдохшимся.
     *
     * @return true, если выносливость игрока истощена, иначе false.
     */
    public boolean run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
        }
        return stamina == MIN_STAMINA;
    }

    /**
     * Возвращает имя игрока.
     *
     * @return имя игрока
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает текущий уровень выносливости игрока.
     *
     * @return выносливость игрока
     */
    public int getStamina() {
        return stamina;
    }
    /**
     * Возвращает минимальный уровень выносливости игрока.
     *
     * @return выносливость игрока
     */
    public static int getMinStamina() {
        return MIN_STAMINA;
    }
}
