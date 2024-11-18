package lesson_37_38;
import java.util.ArrayList;
/**
 * Класс Main демонстрирует использование классов Player и Game.
 * Создает игру, добавляет игроков, запускает процесс выносливости и удаляет выдохшихся игроков.
 */
public class Main {
    /**
     * Точка входа в программу. Создает объект Game и добавляет игроков.
     * Выполняет проверку выносливости и удаляет игроков, у которых закончилась выносливость.
     *
     * @param args Аргументы командной строки
     */
    public static void main(String[] args) {
        Game game = new Game();

        // Добавляем игроков в игру
        game.addPlayer("Алексей");
        game.addPlayer("Владимир");
        game.addPlayer("Дмитрий");
        game.addPlayer("Станислав");
        game.addPlayer("Олег");
        game.addPlayer("Григорий");

        // Пытаемся добавить седьмого игрока (не добавится, т.к. достигнут лимит)
        game.addPlayer("Ярослав");

        // Проверка наличия игрока по имени
        System.out.println("Есть ли игрок с именем Олег? " + game.hasPlayer("Олег"));

        // Вывод информации о количестве игроков
        game.info();

        // Запускаем "бег" для каждого игрока, пока у кого-то не закончится выносливость
        for (Player player : new ArrayList<>(game.getPlayers())) {
            while (player.getStamina() > Player.getMinStamina()) {
                if (player.run()) {
                    game.removePlayer(player); // Удаляем игрока, если он выдохся
                    break;
                }
            }
        }

        // Вывод итогового количества игроков на поле
        game.info();
    }
}



