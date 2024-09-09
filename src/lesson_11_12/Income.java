package lesson_11_12;

public class Income {
    public static void main(String[] args) {
        // Зарплаты сотрудников:
        double salaryDiana = 66660;
        double salaryAndrey = 77770;
        double salaryMaria = 88880;

        // Процент увеличения зарплаты 15%
        double increasePercent = 0.15;

        // Рассчитаем новые зарплаты
        double newSalaryDiana = salaryDiana * (1 + increasePercent);
        double newSalaryAndrey = salaryAndrey * (1 + increasePercent);
        double newSalaryMaria = salaryMaria * (1 + increasePercent);

        // Рассчитаем годовые доходы до и после повышения
        double annualIncomeDianaBefore = salaryDiana * 12;
        double annualIncomeDianaAfter = newSalaryDiana * 12;
        double differenceDiana = annualIncomeDianaAfter - annualIncomeDianaBefore;

        double annualIncomeAndreyBefore = salaryAndrey * 12;
        double annualIncomeAndreyAfter = newSalaryAndrey * 12;
        double differenceAndrey = annualIncomeAndreyAfter - annualIncomeAndreyBefore;

        double annualIncomeMariaBefore = salaryMaria * 12;
        double annualIncomeMariaAfter = newSalaryMaria * 12;
        double differenceMaria = annualIncomeMariaAfter - annualIncomeMariaBefore;


        System.out.printf("Диана теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n", newSalaryDiana, differenceDiana);
        System.out.printf("Андрей теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n", newSalaryAndrey, differenceAndrey);
        System.out.printf("Мария теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n", newSalaryMaria, differenceMaria);
    }
}

