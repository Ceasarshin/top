package lesson_33_34;

/**
 * Главный класс Main.
 * Демонстрирует полиморфизм с животными.
 */
public class Main {
    /**
     * Точка входа в программу.
     *
     * @param args аргументы.
     */
    public static void main(String[] args) {
        // Создание животных:
        Animal dog = new Dog("Шарик");
        Animal cat = new Cat("Мурка");
        Animal bird = new Bird("Берт", true);

        // Создание массива животных
        Animal[] animalSpecies = {dog, cat, bird};

        // Полиморфизм: вызов методов для каждого животного:
        for (Animal animal : animalSpecies) {
            animal.makeSound();
            animal.eat();
            // Проверяем, является ли животное птицей и умеет ли летать:
            if (animal instanceof Bird) {
                Bird birdAnimal = (Bird) animal;
                System.out.println(birdAnimal.getName() + (birdAnimal.isCanFly() ? " может летать!" : " не может летать!"));
            }
            System.out.println();
        }
    }
}
