import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ЗАДАНИЕ 1: Среднее арифметическое элементов массива ===");
        System.out.print("Введите размер одномерного массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите элементы массива:");
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        double average = (arr.length > 0) ? (sum / arr.length) : 0;
        System.out.printf("Среднее арифметическое всех элементов: %.2f%n", average);

        System.out.println("\n=== ЗАДАНИЕ 2: Максимум в матрице 5x5 ===");
        int[][] matrix = new int[5][5];
        int max = Integer.MIN_VALUE;


//        System.out.println("Сгенерированная матрица 5x5:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = random.nextInt(100);
//                System.out.printf("%4d", matrix[i][j]);
//                if (matrix[i][j] > max) {
//                    max = matrix[i][j];
//                }
//            }
//            System.out.println();
//        }

        System.out.println("Введите вручную: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("\nВведенная матрица 5x5:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Максимальный элемент во всей матрице: " + max);
        scanner.close();
    }
}