package lesson_17_18;

public class Palindrome {
    // Переменная для хранения результата сравнения символов.
    static String resCharMsg;

    public static void main(String[] args) {
        String st = "QwertytrewQ";

        // a. Вывод результата с помощью метода StringBuilder:
        System.out.println(isPalindrome(st) ? "Строка является палиндромом." : "Строка не является палиндромом.");

        // b. Вывод сообщения о результате посимвольной проверки:
        isPalindromeChar(st);
        System.out.println(resCharMsg);
    }

    // Метод для проверки палиндрома с использованием StringBuilder
    static boolean isPalindrome(String palStr) {
        StringBuilder sb = new StringBuilder(palStr);
        String reversed = sb.reverse().toString();
        if (palStr.equals(reversed)) {
            System.out.println("a. Реверсированная строка: " + reversed);
            return true;
        } else {
            return false;
        }
    }

    // Метод для посимвольной проверки палиндрома
    static void isPalindromeChar(String palStr) {
        int lenPalStr = palStr.length();

        // Цикл для сравнения символов с начала и конца строки
        for (int i = 0; i < lenPalStr / 2; i++) {
            if (palStr.charAt(i) != palStr.charAt(lenPalStr - 1 - i)) {
                // Если символы не совпадают выводим сообщение и выходим из метода.
                resCharMsg = "b. Несовпадение символов! Это не палиндром!";
                return;
            }
        }
        // Если все символы совпадают:
        resCharMsg = "b. Идеальное совпадение! Это палиндром!";
    }
}
