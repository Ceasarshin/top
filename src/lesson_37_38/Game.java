package lesson_37_38;

import java.util.ArrayList;
import java.util.List;
/**
 * Класс Game представляет игрову, в которой хранится список игроков и управляется их добавление.
 */
public class Game {
    private static final int MAX_PLAYERS = 6;

    private final List<Player> players = new ArrayList<>();

    /**
     * Добавляет нового игрока в игру, если текущее количество игроков меньше максимального.
     *
     * @param name Имя нового игрока
     * @return true, если игрок был добавлен успешно, иначе false.
     */
    public boolean addPlayer(String name) {
        if (players.size() < MAX_PLAYERS) {
            players.add(new Player(name));
            return true;
        } else {
            System.out.println("Невозможно добавить игрока: достигнуто максимальное количество игроков.");
            return false;
        }
    }

    /**
     * Проверяет, есть ли в игре игрок с указанным именем.
     *
     * @param name Имя для поиска
     * @return true, если игрок с таким именем найден, иначе false.
     */
    public boolean hasPlayer(String name) {
        return players.stream().anyMatch(player -> player.getName().equals(name));
    }

    /**
     * Выводит информацию о количестве игроков на поле.
     */
    public void info() {
        System.out.println("Количество игроков в игре: " + players.size());
    }

    /**
     * Удаляет игрока, если он выдохся (выносливость на минимуме).
     *
     * @param player Игрок для удаления
     */
    public void removePlayer(Player player) {
        players.remove(player);
        System.out.println("Игрок " + player.getName() + " удален из игры.");
    }

    /**
     * Возвращает список текущих игроков.
     *
     * @return список игроков
     */
    public List<Player> getPlayers() {
        return players;
    }
}
