package lesson_15_16;

public class Lines {
    public static void main(String[] args) {
        String input = "TOP_Java_411";
        int numbersUp0to4 = 0;
        int numbersUp5to9 = 0;
        int smallLetters = 0;
        int capitalLetters = 0;

        // Разбор строки по символам:
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            // Определяем,является ли символ цифрой:
            if (Character.isDigit(symbol)) {
                int numb = Character.getNumericValue(symbol);

                if (numb >= 0 && numb <= 4) {
                    numbersUp0to4++;
                } else if (numb >= 5 && numb <= 9) {
                    numbersUp5to9++;
                }
                // Определяем регистр каждого символа:
            } else if (Character.isLetter(symbol)) {
                if (Character.isLowerCase(symbol)) {
                    smallLetters++;
                } else if (Character.isUpperCase(symbol)) {
                    capitalLetters++;
                }
            }
        }
        System.out.println(input);
        System.out.println("Количество цифр от 0 до 4 в строке: " + numbersUp0to4 + " шт.");
        System.out.println("Количество цифр от 5 до 9 в строке: " + numbersUp5to9 + " шт.");
        System.out.println("Количество маленьких букв в строке: " + smallLetters + " шт.");
        System.out.println("Количество больших букв в строке: " + capitalLetters + " шт.");
    }
}
