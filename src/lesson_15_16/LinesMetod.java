package lesson_15_16;

public class LinesMetod {
    public static void main(String[] args) {
        String input = "I like Java!!!";
        System.out.println("Исходная строка: " + input);

        String lastSymbol = String.valueOf(input.charAt(input.length() - 1));
        String msgLastSymbol = (input.length() > 0) ? "a. Последний символ строки:" + lastSymbol : "Пустая строка!";
        System.out.println(msgLastSymbol);

        String msgEndsWith = (input.endsWith("!!!")) ? "b. Строка заканчивается на '!!!' " : "b. Строка не заканчивается на '!!!'";
        System.out.println(msgEndsWith);

        String msgStartsWith = (input.startsWith("I like")) ? "c. Строка начинается с 'I like'" : "c. Строка не начинается с 'I like'";
        System.out.println(msgStartsWith);

        String msgContains = (input.contains("Java")) ? "d. Строка содержит подстроку 'Java'" : "d. Строка не содержит подстроку 'Java'";
        System.out.println(msgContains);

        int position = input.indexOf("Java");
        String msgPosition = (position != -1) ? "e. Позиция подстроки 'Java': " + position : "e. Позиция подстроки 'Java' не найдена!";
        System.out.println(msgPosition);

        String msgReplaced = input.replace("a", "o");
        System.out.println("f. Строка с заменой символов 'a' на 'o' : " + msgReplaced);

        System.out.println("g. В нижнем регистре: " + input.toLowerCase());
        System.out.println("h. В верхнем регистре: " + input.toUpperCase());
    }
}
