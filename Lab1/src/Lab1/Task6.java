package Lab1;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество элементов массива: ");
        int N = in.nextInt();
        System.out.print("Введите " + N + " элементов массива: ");

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }

        int[][] matrix = createMatrixFromArray(array);
        printMatrix(matrix);

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }

    public static int[][] createMatrixFromArray(int[] array) {
        int N = array.length;
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = array[(i + j) % N];
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
