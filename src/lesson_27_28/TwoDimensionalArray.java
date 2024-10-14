package lesson_27_28;

import java.util.Arrays;

/**
 * Данный класс демонстрирует операции с двумерным массивом,
 * включая заполнение, вывод, вычисление сумм строк и столбцов,
 * а также работу с копией массива и исходным массивом.
 */
public class TwoDimensionalArray {

    /**
     * Основной метод для выполнения программы.
     * Инициализирует двумерный массив 3x3, заполняет его числами от 1 до 9
     * и выполняет различные операции, включая вывод массива и вычисление сумм строк и столбцов.
     * Также демонстрирует работу методов, изменяющих копию массива и исходный массив.
     *
     * @param args Аргументы.
     */
    public static void main(String[] args) {
        int[][] nums = new int[3][3];

        fillNums(nums);
        printNums(nums);
        printRowSums(nums);
        printColumnSums(nums);

        int[] nums2 = {4, 6, 12, 3, 8, 4};
        System.out.println("Исходный массив: " + Arrays.toString(nums2));
        changArray(nums2);
        System.out.println("После изменения исходника: " + Arrays.toString(nums2));
        changCopyArray(nums2);
        System.out.println("После изменения копии: " + Arrays.toString(nums2));
    }

    /**
     * Заполняет переданный двумерный массив последовательными числами, начиная с 1.
     *
     * @param nums Двумерный массив для заполнения числами.
     */
    private static void fillNums(int[][] nums) {
        int number = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = number++;
            }
        }
    }

    /**
     * Выводит двумерный массив в виде матрицы.
     *
     * @param nums Двумерный массив для вывода.
     */
    private static void printNums(int[][] nums) {
        System.out.println("Матрица:");
        for (int[] row : nums) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    /**
     * Вычисляет и выводит сумму элементов для каждой строки двумерного массива.
     *
     * @param nums Двумерный массив, суммы строк которого нужно вычислить и вывести.
     */
    private static void printRowSums(int[][] nums) {
        System.out.println("Сумма элементов каждой строки:");
        for (int i = 0; i < nums.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                rowSum += nums[i][j];
            }
            System.out.println("Сумма строки " + (i + 1) + ": " + rowSum);
        }
    }

    /**
     * Вычисляет и выводит сумму элементов для каждого столбца двумерного массива.
     *
     * @param nums Двумерный массив, суммы столбцов которого нужно вычислить и вывести.
     */
    private static void printColumnSums(int[][] nums) {
        System.out.println("Сумма элементов каждого столбца:");
        for (int j = 0; j < nums[0].length; j++) {
            int colSum = 0;
            for (int[] num : nums) colSum += num[j];
            System.out.println("Сумма столбца " + (j + 1) + ": " + colSum);
        }
    }

    /**
     * Метод, который создает копию массива и изменяет только её.
     * Исходный массив, переданный в метод, остается неизменным.
     *
     * @param array Исходный массив, который будет скопирован и изменен.
     */
    public static void changArray(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length); // Создаем копию массива
        Arrays.fill(arrayCopy, 3); // Меняем каждый элемент на значение 3
        System.out.println("Копия массива внутри метода changArray: " + Arrays.toString(arrayCopy));
    }

    /**
     * Метод, который изменяет исходный массив, переданный в качестве параметра.
     * Все изменения применяются напрямую к исходному массиву.
     *
     * @param array Исходный массив, который будет изменен.
     */
    public static void changCopyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2; // Умножаем на 2 каждый элемент исходного массива
        }
        System.out.println("Массив во втором методе (исходный): " + Arrays.toString(array));
    }
}
