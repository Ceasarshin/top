package lesson_37_38;

import java.util.Random;

/**
 * Класс Player представляет игрока в футболе.
 * Каждый игрок имеет выносливость и может участвовать в игре.
 * Существует ограничение на количество игроков на поле - максимум 6.
 */
public class Player {
    /**
     * Максимальная выносливость игрока. Все игроки могут иметь максимум 10 единиц выносливости.
     */
    public static final int MAX_STAMINA = 10;

    /**
     * Минимальная выносливость игрока. Когда выносливость достигает 0, игрок выбывает с поля.
     */
    public static final int MIN_STAMINA = 0;

    /**
     * Статическое поле, которое отслеживает количество игроков на футбольном поле.
     */
    private static int countPlayers = 0;

    /**
     * Имя игрока.
     */
    private final String name;

    /**
     * Выносливость для конкретного игрока.
     */
    private int stamina;

    /**
     * Приватный конструктор создает игрока с заданной выносливостью.
     * Количество игроков на поле увеличивается при создании объекта.
     *
     * @param stamina значение выносливости для игрока (от 8 до 10)
     */
    private Player(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
        countPlayers++;
    }

    /**
     * Геттер для получения имени игрока.
     *
     * @return имя игрока
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер для получения значения выносливости игрока.
     *
     * @return текущее значение выносливости игрока
     */
    public int getStamina() {
        return stamina;
    }

    /**
     * Метод run уменьшает выносливость игрока на 1.
     * Если выносливость достигает минимального значения (0), игрок уходит с поля.
     */
    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                System.out.println("У игрока: " + getName() + "  - закончилась выносливость! Он покидает футбольное поле.");
                countPlayers--;
            }
        }
    }

    /**
     * Статический метод для добавления нового игрока на поле.
     * Игрок добавляется только если на поле менее 6 игроков.
     *
     * @return новый объект Player, если игрок успешно добавлен, иначе null
     */
    public static Player addPlayer(String name) {
        if (countPlayers < 6) {
            Random random = new Random();
            int stamina = random.nextInt(3) + 8; // Генерируем выносливость от 8 до 10.
            return new Player(name, stamina);
        } else {
            System.out.println("На футбольном поле нет свободных мест!");
            return null; // Вовращаем null,если нет возможности добавить игрока.
        }
    }

    /**
     * Статический метод выводит информацию о количестве игроков на поле.
     * Если игроков меньше 6, выводится информация о свободных местах.
     * Если на поле 6 игроков, сообщается, что мест больше нет.
     */
    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные! На поле еще есть " + (6 - countPlayers) + " свободных мест.");
        } else {
            System.out.println("Все команды полные! На поле нет свободных мест.");
        }
    }

    /**
     * Статический метод для получения текущего количества игроков на поле.
     *
     * @return количество игроков, находящихся на поле
     */
    public static int getCountPlayers() {
        return countPlayers;
    }
}