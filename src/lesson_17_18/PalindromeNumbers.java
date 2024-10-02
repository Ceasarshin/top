package lesson_17_18;

public class PalindromeNumbers {
    public static void main(String[] args) {
        int digStr = 1234321;

        // Преобразуем число в строку и проверяем его на палиндром:
        System.out.println(isPalindrome(Integer.toString(digStr))
                ? "Числовая строка: " + digStr + " - является палиндромом!"
                : "Числовая строка: " + digStr + " - не является палиндромом!");
    }

    // Метод для проверки строки на палиндром
    static boolean isPalindrome(String polStr) {
        StringBuilder sb = new StringBuilder(polStr);
        return polStr.equals(sb.reverse().toString());
    }
}

