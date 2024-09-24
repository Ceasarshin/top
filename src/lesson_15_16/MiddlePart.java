package lesson_15_16;

public class MiddlePart {
    public static void main(String[] args) {
        metodMiddlePart("String");
        metodMiddlePart("Code");
        metodMiddlePart("Practice");
        metodMiddlePart("Java");
    }

    public static void metodMiddlePart(String input) {
        if (input.length() % 2 == 0) {
            int index = input.length() / 2;
            String middlePart = input.substring(index - 1, index + 1);
            System.out.printf("Два средних символа для строки %s : %s \n", input, middlePart);
        } else {
            System.out.printf("Нечетная длина строки: %s. ", input);
        }
    }
}
