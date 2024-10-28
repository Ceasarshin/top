package lesson_37_38;

import java.util.ArrayList;

/**
 * Класс Main - точка входа в программу.
 * Демонстрирует создание и поведение объектов класса Player.
 */
public class Main {
    /**
     * Точка входа в программу.
     *
     * @param args аргументы.
     */
    public static void main(String[] args) {
        // Список для хранения всех созданных игроков
        ArrayList<Player> playersOnField = new ArrayList<>();

        // Создаем 6 игроков и добавляем их в список, если они успешно созданы
        Player gamer1 = Player.addPlayer("Алексей");
        if (gamer1 != null) playersOnField.add(gamer1);

        Player gamer2 = Player.addPlayer("Владимир");
        if (gamer2 != null) playersOnField.add(gamer2);

        Player gamer3 = Player.addPlayer("Дмитрий");
        if (gamer3 != null) playersOnField.add(gamer3);

        Player gamer4 = Player.addPlayer("Станислав");
        if (gamer4 != null) playersOnField.add(gamer4);

        Player gamer5 = Player.addPlayer("Олег");
        if (gamer5 != null) playersOnField.add(gamer5);

        Player gamer6 = Player.addPlayer("Григорий");
        if (gamer6 != null) playersOnField.add(gamer6);

        // Выводим состав всех игроков на поле в начале
        System.out.println("Состав игроков на поле:");
        int playerNumber = 1;
        for (Player player : playersOnField) {
            System.out.println("Игрок #" + playerNumber + " - Имя: " + player.getName() + ", Выносливость: " + player.getStamina());
            playerNumber++;
        }

        // Проверяем информацию о количестве игроков на поле:
        Player.info();
        System.out.println();

        // Пытаемся добавить 7-го и 8-го игрока:
        System.out.println("Попытка добавить седьмого игрока на футбольное поле:");
        Player gamer7 = Player.addPlayer("Ярослав");
        if (gamer7 != null) {
            System.out.println(gamer7.getName() + " успешно добавлен на поле.");
        }
        System.out.println();

        System.out.println("Попытка добавить восьмого игрока на футбольное поле:");
        Player gamer8 = Player.addPlayer("Андрей");
        if (gamer8 != null) {
            System.out.println(gamer8.getName() + " успешно добавлен на поле.");
        }
        System.out.println();

        // Применяем метод run к первому игроку до тех пор, пока он не выдохнется
        if (gamer1 != null) {
            while (gamer1.getStamina() > Player.MIN_STAMINA) {
                gamer1.run();
            }
        }

        // Выводим количество игроков на поле после того, как первый игрок выдохся:
        System.out.println("Общее количество игроков на поле: " + Player.getCountPlayers() + " человек.");
    }
}

