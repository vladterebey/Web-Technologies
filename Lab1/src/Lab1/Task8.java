package Lab1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество элементов массива: ");
        int N = in.nextInt();
        System.out.print("Введите " + N + " элементов первого массива: ");

        int[] array1 = new int[N];
        for (int i = 0; i < N; i++) {
            array1[i] = in.nextInt();
        }

        System.out.print("Введите " + N + " элементов второго массива: ");
        int[] array2 = new int[N];
        for (int i = 0; i < N; i++) {
            array2[i] = in.nextInt();
        }

        int[] index = new int[N];

        index = f(array1, array2);

        for (int k = 0; k < N; k++) {
            System.out.print(index[k] + " ");
        }

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }

    public static int[] f(int[] array1, int[] array2) {
        int N = array1.length;
        int[] index = new int[N];
        int i = 0;
        int j = 0;
        while (j < N)
        {
            if (i < N) {
                if (array1[i] < array2[j]) {
                    i++;
                } else
                {
                    index[j] = i;
                    j++;
                }
            } else
            {
                index[j] = i;
                j++;
            }
        }
        return index;
    }
}
