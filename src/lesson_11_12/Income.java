package lesson_11_12;

public class Income {
    public static void main(String[] args) {
        // Зарплаты сотрудников:
        double salaryDiana = 66660;
        double salaryAndrey = 77770;
        double salaryMaria = 88880;

        // Процент увеличения зарплаты 15%
        double percent = 0.15;

        // Рассчитаем новые зарплаты
        double newSalaryDiana = salaryDiana * (1 + percent);
        double newSalaryAndrey = salaryAndrey * (1 + percent);
        double newSalaryMaria = salaryMaria * (1 + percent);

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


        System.out.printf(
                "Диана теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n" +
                        "Андрей теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n" +
                        "Мария теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n",
                newSalaryDiana, differenceDiana,
                newSalaryAndrey, differenceAndrey,
                newSalaryMaria, differenceMaria
        );
    }
}

