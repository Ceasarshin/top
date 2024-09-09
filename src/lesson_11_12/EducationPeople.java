package lesson_11_12;
import java.util.Scanner;

public class EducationPeople {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода возраста.
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем возраст у пользователя.
        System.out.print("Введите возраст человека: ");
        // Проверяем, является ли ввод числом
        if (scanner.hasNextInt()) {
            int agePerson = scanner.nextInt();

            // Проверяем введенное значение на целочисленность.
            if (agePerson < 0) {
                System.out.println("Возраст не может быть отрицательным!");
             // Определяем учебное заведение в зависимости от возраста:
            } else if (agePerson >= 2 && agePerson <= 6) {
                System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад!");
            } else if (agePerson >= 7 && agePerson <= 18) {
                System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно посещать школу!");
            } else if (agePerson > 18 && agePerson <= 24) {
                System.out.println("Если возраст человека равен " + agePerson + ", то ему следует учиться в университете!");
            } else if (agePerson > 24) {
                System.out.println("Если возраст человека равен " + agePerson + ", то ему пора идти на работу!");
            } else {
                System.out.println("Возраст слишком мал для посещения учебного заведения!");
            }
        } else {
            // Сообщаем об ошибке, если введено не число.
            System.out.println("Ошибка: пожалуйста, введите целое число для возраста.");
        }
        scanner.close();
    }
}
