package Lab1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество элементов массива: ");
        int N = in.nextInt();
        System.out.print("Введите " + N + " элементов массива: ");

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }

        array = sortArray(array); // Вызываем функцию для сортировки массива

        for (int j = 0; j < N; j++) {
            System.out.print(array[j] + " ");
        }

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }

    public static int[] sortArray(int[] array) {
        int N = array.length;
        int i = 0;
        while (i < N - 1) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return array;
    }
}
