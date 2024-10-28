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
        Animal dog2 = new Dog("Бобик");
        Animal cat = new Cat("Мурка");
        Animal cat2 = new Cat("Пушок");
        Animal bird = new Bird("Берт", true);


        // Создание массива животных
        Animal[] animalSpecies = {dog, dog2, cat, cat2, bird};

        // Полиморфизм: вызов методов для каждого животного:
        for (Animal animal : animalSpecies) {
            animal.makeSound();
            animal.eat();
            animal.move();

            // Проверяем, является ли животное птицей и умеет ли летать и выводим результат:
            if (animal instanceof Bird) {
                Bird birdAnimal = (Bird) animal;
                System.out.println(birdAnimal.getName() + (birdAnimal.isCanFly() ? " может летать!" : " не может летать!"));
            }

            // Проверка, является ли животное домашним
            if (animal instanceof Pet) {
                Pet pet = (Pet) animal;
                System.out.println("Животное домашнее.");
                pet.play();
                pet.beFriendly();
            } else {
                System.out.println("Животное не домашнее");
            }

            System.out.println();
        }
    }
}
